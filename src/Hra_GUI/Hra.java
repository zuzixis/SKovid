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
    private Nacitavac nacitavac;
    private Slovensko SR;
    private Opatrenia opatrenia;
    private Cas cas;
    private boolean hranie = false;
    
    
    public Hra(){
        cas = new Cas(this);
        opatrenia = new Opatrenia();
        HP = new HraciPanel(opatrenia, this);
        nacitavac = new Nacitavac();
        SR = new Slovensko();
        SR.setKraje(nacitavac.getKraje());
        
        this.hranie = true;
        this.zacniHru();
        
        
    }
    
    private void vypisVsetkyInformacieOSlovensku(){
        HP.napisVsetciNakazeni(SR.dajPocetVsetkychNakazenych());
        HP.napisZaockovanych(SR.dajPocetVsetkychZaockovanych());
        HP.napisNakazenychNaDen(5);
        HP.napisPocetUmrti(5);
        HP.napisStavNemocnic(5);
        HP.napisSpolocenskuStabilitu(5); //vsetky doplnene su len na skusku :D 
    }

    public HraciPanel getHP() {
        return HP;
    }
    
    //tu by sa mohla cykliť hra až kym hrac neprehá (obnova opatreni, pocitanie indexov, pribudanie novych a podobne :D )
    public void zacniHru(){
        int i = 0;
        /*while(hranie){
            cas.dalsiDen(1);
            this.vypisVsetkyInformacieOSlovensku();
            
        }*/
    }

    public void setHranie(boolean hranie) {
        this.hranie = hranie;
    }

    public boolean isHranie() {
        return hranie;
    }
    
}
    
