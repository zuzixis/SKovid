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

    private boolean prvyPripad = false;
    private int oznamMrtvi = 1;
    private int dennyRekord = 100;

    private boolean hranie = false;

    public Hra() {
        cas = new Cas(this);
        opatrenia = new Opatrenia();
        SR = new Slovensko(this, opatrenia);
        HP = new HraciPanel(opatrenia, this);
        infoKraje = new VypisOkrajoch(HP);
        hlaska = new Hlaska(HP);
        oznam = new Oznamenie(this);

        //skuska oznamení
        oznam.pridajOznamenie("Slovensko zatial bez prvveho pripadu covid-19.");

       
        // oznam.pridajOznamenie("");

        //this.hranie = true;
        //cas.oddialStart(1);
        //this.zacniHru();
    }

    private void vypisVsetkyInformacieOSlovensku() {
        int pocetNakazenych = SR.getPocetNakazenych();
        HP.napisVsetciNakazeni(pocetNakazenych);
        if (pocetNakazenych > 0 && !prvyPripad) {
            prvyPripad = true;
            this.pridajOznamenie("Na Slovensku sme odhalili prvy pripad covid-19.");
        }
        HP.napisZaockovanych(SR.getPocetImunnych());
        //denny nakazeny
        int dennyPrirastok = SR.getPrirastok();
        HP.napisNakazenychNaDen(dennyPrirastok);
         if (dennyRekord < dennyPrirastok) {
            this.pridajOznamenie("Na Slovensku padol rekord v pocte novych pripadov covid-19 - "+ dennyPrirastok);
            dennyRekord = dennyPrirastok; 
        }
        
        //umrtia
        int pocetUmrti = SR.getPocetUmrti();
        HP.napisPocetUmrti(pocetUmrti);
        if (oznamMrtvi <= pocetUmrti) {
            
            if (oznamMrtvi == 1) {
                this.pridajOznamenie("Na Slovensku umrel prvy clovek na covid-19.");
                 
            } else {
                this.pridajOznamenie("Na Slovensku sme prekrocili hranicu "+ oznamMrtvi+" umrti na covid-19.");
            }
            oznamMrtvi *= 10;
        }
        HP.napisStavNemocnic(SR.getStavNemocnic());
        HP.napisSpolocenskuStabilitu(0); //vsetky doplnene su len na skusku :D 

        infoKraje.stavVkrajoch();
        
        
        if(oznam.getPocetCakajucichOznameni() == 0 && !oznam.zobrazuje()){
            System.out.println("teraz pridavam");
            oznam.generujOznamenie();
        }
        
        if(oznam.getPocetCakajucichOznameni() > 1)
             oznam.vypisOznamenie(1);
        else
            oznam.vypisOznamenie(2);
    }

    public HraciPanel getHP() {
        return HP;
    }

    public Slovensko getSlovensko() {
        return SR;
    }

    //tu by sa mohla cykliť hra až kym hrac neprehá (obnova opatreni, pocitanie indexov, pribudanie novych a podobne :D )
    public void zacniHru() {

        SR.vygenerujNakazenehoClovek();

        while (hranie) {
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

    public void pridajOznamenie(String s) {
        oznam.pridajOznamenie(s);
    }


}
