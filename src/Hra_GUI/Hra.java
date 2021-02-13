/**
 * Treida slúžiaca na prepájanie všetkých častí aplikácie
 */

package Hra_GUI;

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
    
    
    public Hra(){
        opatrenia = new Opatrenia();
        HP = new HraciPanel(opatrenia);
        nacitavac = new Nacitavac();
        SR = new Slovensko();
        SR.setKraje(nacitavac.getKraje());
        
        this.vypisVsetkyInformacieOSlovensku();
    }
    
    private void vypisVsetkyInformacieOSlovensku(){
        HP.napisVsetciNakazeni(SR.dajPocetVsetkychNakazenych());
        HP.napisZaockovanych(SR.dajPocetVsetkychZaockovanych());
        HP.napisNakazenychNaDen(5);
        HP.napisPocetUmrti(5);
        HP.napisStavNemocnic(5);
        HP.napisSpolocenskuStabilitu(5); //vsetky doplnene su len na skusku :D 
    }
    
}
