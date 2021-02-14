/**
 * Treida slúžiaca na prepájanie všetkých častí aplikácie
 */

package Hra_GUI;

import HRA_Cas.Cas;
import Hra_Opatrenia.Opatrenia;
import Hra_zakladneTriedy.Slovensko;
import Subory.Nacitavac;

/**
 *
 * @author Zuzana Žillová
 */
public class Hra {
    private HraciPanel HP;
    private Slovensko SR;
    private Opatrenia opatrenia;
    private Cas cas;
    private VypisOkrajoch infoKraje;
    private Hlaska hlaska;
    private Oznamenie oznam;
    
    private boolean hranie = false;
    
    
    public Hra(){
        cas = new Cas(this);
        opatrenia = new Opatrenia();
        SR = new Slovensko();
        HP = new HraciPanel(opatrenia, this); 
        infoKraje = new VypisOkrajoch(HP);
        hlaska = new Hlaska(HP);
        oznam = new Oznamenie(this);
        
        //skuska oznamení
       oznam.pridajOznamenie("prve oznamenie");
       oznam.pridajOznamenie("druhe oznamenie");
       oznam.pridajOznamenie("3 oznamenie");
       
       
       //this.hranie = true;
       //cas.oddialStart(1);
       //this.zacniHru();
        
       
    }
    
    private void vypisVsetkyInformacieOSlovensku(){
        HP.napisVsetciNakazeni(SR.getPocetNakazenych());
        HP.napisZaockovanych(SR.getPocetImunnych());
        HP.napisNakazenychNaDen(SR.getPrirastok());
        HP.napisPocetUmrti(SR.getPocetUmrti());
        HP.napisStavNemocnic(SR.getStavNemocnic());
        HP.napisSpolocenskuStabilitu(0); //vsetky doplnene su len na skusku :D 
        
        infoKraje.stavVkrajoch();
        oznam.vypisOznamenie(3);
    }

    public HraciPanel getHP() {
        return HP;
    }
    
    public Slovensko getSlovensko(){
        return SR;
    }
    
    //tu by sa mohla cykliť hra až kym hrac neprehá (obnova opatreni, pocitanie indexov, pribudanie novych a podobne :D )
    public void zacniHru(){
        
        SR.vygenerujNakazenehoClovek();
        
        while(hranie){
            cas.dalsiDen(1);
            this.vypisVsetkyInformacieOSlovensku();
            SR.spravDen();
            hlaska.vypisRandomHlasku(5);
        }
    }

    public void setHranie(boolean hranie) {
        this.hranie = hranie;
    }

    public boolean isHranie() {
        return hranie;
    }
    
}
    
