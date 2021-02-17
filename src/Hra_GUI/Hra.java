/**
 * Treida slúžiaca na prepájanie všetkých častí aplikácie
 */
package Hra_GUI;

import HRA_Cas.Cas;
import Hra_Opatrenia.Opatrenia;
import Hra_zakladneTriedy.Slovensko;
import Hra_zakladneTriedy.Vakcina;

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
    private Vakcina vakcina;

    private boolean prvyPripad = false;
    private int oznamMrtvi = 100;
    private int dennyRekord = 100;

    private boolean hranie = false;

    public Hra() {
        cas = new Cas(this);
        opatrenia = new Opatrenia(this);
        vakcina = new Vakcina();
        SR = new Slovensko(this, opatrenia);
        HP = new HraciPanel(opatrenia, this);
        infoKraje = new VypisOkrajoch(HP);
        hlaska = new Hlaska(HP);
        oznam = new Oznamenie(this);

        //skuska oznamení
       // oznam.pridajOznamenie("Slovensko zatial bez prvveho pripadu covid-19.");

        // oznam.pridajOznamenie("");
        //this.hranie = true;
        //cas.oddialStart(1);
        //this.zacniHru();
    }

    private void vypisVsetkyInformacieOSlovensku() {
        int pocetNakazenych = SR.getPocetNakazenych();
        
        if (pocetNakazenych > 0 && !prvyPripad) {
            prvyPripad = true;
            this.pridajOznamenie("Na Slovensku sme odhalili prvy pripad covid-19.");
        }
        HP.napisZaockovanych(SR.getPocetZaockovanych() + SR.getPocetImunnych());
        //denny nakazeny
        int dennyPrirastok = SR.getPrirastok();
        HP.napisNakazenychNaDen(pocetNakazenych);
        HP.napisVsetciNakazeni(dennyPrirastok);
        if (dennyRekord < dennyPrirastok) {
            this.pridajOznamenie("Na Slovensku padol rekord v pocte novych pripadov covid-19 - " + dennyPrirastok);
            dennyRekord = dennyPrirastok;
        }

        //umrtia
        int pocetUmrti = SR.getPocetUmrti();
        HP.napisPocetUmrti(pocetUmrti);
        if (oznamMrtvi <= pocetUmrti) {

            if (oznamMrtvi == 1) {
                this.pridajOznamenie("Na Slovensku umrel prvy clovek na covid-19.");

            } else {
                this.pridajOznamenie("Na Slovensku sme prekrocili hranicu " + oznamMrtvi + " umrti na covid-19.");
            }
            oznamMrtvi *= 10;
        }
        HP.napisStavNemocnic(SR.getStavNemocnic());
        HP.napisSpolocenskuStabilitu(0); 

        infoKraje.stavVkrajoch();

        if (oznam.getPocetCakajucichOznameni() > 1) {
            oznam.vypisOznamenie(1);
        } else {
            oznam.vypisOznamenie(2);
        }

        HP.vykresliGraf(dennyPrirastok);
        HP.vykresliGrafKruhovy(this.getSlovensko().getKraje().get(0).dajPocetNakazenychVkraji(),
                this.getSlovensko().getKraje().get(1).dajPocetNakazenychVkraji(),
                this.getSlovensko().getKraje().get(2).dajPocetNakazenychVkraji(),
                this.getSlovensko().getKraje().get(3).dajPocetNakazenychVkraji(),
                this.getSlovensko().getKraje().get(4).dajPocetNakazenychVkraji(),
                this.getSlovensko().getKraje().get(5).dajPocetNakazenychVkraji(),
                this.getSlovensko().getKraje().get(6).dajPocetNakazenychVkraji(),
                this.getSlovensko().getKraje().get(7).dajPocetNakazenychVkraji());

        HP.vykresliGrafImunni(SR.getPocetPrvoZaockovanych(), SR.getPocetZaockovanych());
        
        HP.informacieObratislavskomKraji(this.getSlovensko().getKraje().get(0).dajPocetNakazenychVkraji(), 4, 5);
        HP.informacieOtrnavskonKraji(this.getSlovensko().getKraje().get(1).dajPocetNakazenychVkraji(), pocetUmrti, pocetUmrti);
        HP.informacieOtrencianskomKraji(this.getSlovensko().getKraje().get(2).dajPocetNakazenychVkraji(), pocetUmrti, pocetUmrti);
        HP.informacieOnitrianskomKraji(this.getSlovensko().getKraje().get(3).dajPocetNakazenychVkraji(), pocetUmrti, pocetUmrti);
        HP.informacieOzilinskomKraji(this.getSlovensko().getKraje().get(4).dajPocetNakazenychVkraji(), pocetUmrti, pocetUmrti);
        HP.informacieObanskobystrickomKraji(this.getSlovensko().getKraje().get(5).dajPocetNakazenychVkraji(), pocetUmrti, pocetUmrti);
        HP.informacieOpresovskommKraji(this.getSlovensko().getKraje().get(6).dajPocetNakazenychVkraji(), pocetUmrti, pocetUmrti);
        HP.informacieOkosickomKraji(this.getSlovensko().getKraje().get(7).dajPocetNakazenychVkraji(), pocetUmrti, pocetUmrti);
    }

    public HraciPanel getHP() {
        return HP;
    }

    public Cas getCas() {
        return cas;
    }

    public Slovensko getSlovensko() {
        return SR;
    }

    //tu by sa mohla cykliť hra až kym hrac neprehá (obnova opatreni, pocitanie indexov, pribudanie novych a podobne :D )
    public void zacniHru() {

        SR.vygenerujNakazenehoClovek();

        while (hranie) {
            cas.dalsiDen(1);
            // if(!vakcina.mameDavky())System.out.println(vakcina.mameDavky());
            this.vypisVsetkyInformacieOSlovensku();
            SR.spravDen();
            hlaska.vypisRandomHlasku(5);
            if (!vakcina.isVakcinacia()) {
                if (vakcina.getZaciatokVakcinacie().equals(cas.getAktualnyDatum())) {
                    vakcina.setZaciatok();
                }
            } else {
                if (vakcina.getDatumDodaniaZasielky().equals(cas.getAktualnyDatum())) {
                    vakcina.dodajZasielku();
                }

            }
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

    public Vakcina getVakcina() {
        return vakcina;
    }
}
