package Hra_zakladneTriedy;

import Hra_GUI.Hra;
import Hra_GUI.Oznamenie;
import Hra_Opatrenia.CeloplosneTestovanie;
import Hra_Opatrenia.Opatrenia;
import Subory.Nacitavac;
import java.util.ArrayList;
import java.util.Random;
import java.util.SplittableRandom;

/**
 * @author Zuzana Žillová
 */
public class Slovensko {

    private ArrayList<Kraj> kraje;
    private Nacitavac nacitavac;
    private Hra hra;
    private int spokojnost;
    private int vytazenostNemocnic;
    private Opatrenia opatrenia;
    private int pocetUmrti;
    private int pocetImunnych;
    private int pocetVsetkychZaockovanych;
    private ArrayList<Clovek> infekcny = new ArrayList<>();
    private int prirastok = 0;
    private Nemocnica nemocnica;
    private Vakcina vakcina;
    private CeloplosneTestovanie testovanie;
    private double koeficient = 0.7;
    private int pocetObyvatelov = 669592 + 564917 + 584569 + 674306 + 691509 + 645276 + 826244 + 801460;

    public int getPocetObyvatelov() {
        return pocetObyvatelov;
    }

    public Slovensko(Hra hra, Opatrenia opatrenia) {
        nacitavac = new Nacitavac();
        setKraje(nacitavac.getKraje());
        nemocnica = new Nemocnica();
        this.opatrenia = opatrenia;
        this.hra = hra;
        this.vakcina = hra.getVakcina();
        testovanie = opatrenia.getCeloplosneTestovanie();
    }

    public int dajPocetVsetkychZaockovanych() {
        int pocet = 0;
        for (int i = 0; i < kraje.size(); i++) {
            pocet += kraje.get(i).dajPocetZaockovanychVKraji();
        }
        return pocet;
    }

    public ArrayList<Kraj> getKraje() {
        return kraje;
    }

    public int getSpokojnost() {
        return spokojnost;
    }

    public Opatrenia getOpatrenia() {
        return opatrenia;
    }

    public int getPocetVsetkychZaockovanych() {
        return pocetVsetkychZaockovanych;
    }

    public void setKraje(ArrayList<Kraj> kraje) {
        this.kraje = kraje;
    }

    public void setSpokojnost(int spokojnost) {
        this.spokojnost = spokojnost;
    }

    public void setVytazenostNemocnic(int vytazenostNemocnic) {
        this.vytazenostNemocnic = vytazenostNemocnic;
    }

    public void setOpatrenia(Opatrenia opatrenia) {
        this.opatrenia = opatrenia;
    }

    public void setPocetVsetkychZaockovanych(int pocetVsetkychZaockovanych) {
        this.pocetVsetkychZaockovanych = pocetVsetkychZaockovanych;
    }

    public void pridajKraj(Kraj kraj) {
        this.kraje.add(kraj);
    }

    //vygenerovanie nahodneho 1 cloveka ktorý bude mať kovid
    public void vygenerujNakazenehoClovek() {
        Random rand = new Random();
        int vygenerovanyKraj = rand.nextInt(8);
        int vygenerovanieRodiny = rand.nextInt(this.kraje.get(vygenerovanyKraj).getRodiny().size());
        int vygenerovanyClen = rand.nextInt(this.kraje.get(vygenerovanyKraj).getRodiny().get(vygenerovanieRodiny).getClenoviaRodiny().size());
        Clovek vygenerovany = this.kraje.get(vygenerovanyKraj).getRodiny().get(vygenerovanieRodiny).getClenoviaRodiny().get(vygenerovanyClen);

        vygenerovany.setMaCovid();
        if (vygenerovany.getDniDoOdhalenia() == 2) {
            infekcny.add(vygenerovany);
        }

    }

    //odratavanie do ohhalenia ze ma kovid
    public void nakazDalsich() {
        koeficient = 0.7;
        Random rand = new Random();
        System.out.println(opatrenia.getIndex());

        //System.out.println(koeficient);
        if (infekcny.size() > 10000) {
            koeficient = 0.6;
        }
        if (infekcny.size() > 100000) {
            koeficient = 0.5;
        }
        if (infekcny.size() > 500000) {
            koeficient = 0.05;
        }
        double x = 0;
        if (1 - opatrenia.getIndex() < 0) {
            x = 0.0001;
        } else {
            x = 1 - opatrenia.getIndex();
        }
        koeficient = koeficient * x;
        if (infekcny.size() > 800000) {
            koeficient = 0.02;
        }

        for (int i = 0; i < infekcny.size(); i++) {
            double sanca = rand.nextDouble();
            if (sanca <= koeficient) {
                if (rand.nextDouble() < opatrenia.getIndexKraja()) {
                    vygenerujNakazenehoClovekVKraji(infekcny.get(i).getKraj());
                } else {
                    vygenerujNakazenehoClovek();
                }
            }
        }
    }

    public void vygenerujNakazenehoClovekVKraji(Kraj k) {
        Random rand = new Random();
        int vygenerovanieRodiny = rand.nextInt(k.getRodiny().size());
        int vygenerovanyClen = rand.nextInt(k.getRodiny().get(vygenerovanieRodiny).getClenoviaRodiny().size());
        Clovek vygenerovany = k.getRodiny().get(vygenerovanieRodiny).getClenoviaRodiny().get(vygenerovanyClen);
        vygenerovany.setMaCovid();
        if (vygenerovany.getDniDoOdhalenia() == 2) {

            infekcny.add(vygenerovany);

        }
    }

    public void spravDen() {
        boolean upozornenie = false;
        if (getStavNemocnic() < 90) {
            upozornenie = true;
        }
        nemocnica.aktaulizuj();
        for (int i = 0; i < this.kraje.size(); i++) {
            for (int j = 0; j < this.kraje.get(i).getRodiny().size(); j++) {
                for (int k = 0; k < this.kraje.get(i).getRodiny().get(j).getClenoviaRodiny().size(); k++) {
                    Clovek c = this.kraje.get(i).getRodiny().get(j).getClenoviaRodiny().get(k);
                    c.spravSiDen();
                    if (c.isKritickyStav()) {
                        nemocnica.pridajLudi(c);
                    }
                }
            }
        }
        //upozornenie nemocnic
        if (upozornenie && getStavNemocnic() >= 90) {
            hra.pridajOznamenie(nemocnica.getOznamenie());
        }

        //vakcinacia
        if (vakcina.mameDavky()) {
            int pocet = vakcina.SpravDen();
            for (int i = 0; i < pocet; i++) {
                NajdiClovekaNaOckovanie();
            }
        }

        boolean vymaz = false;
        do {
            vymaz = false;
            if (!this.infekcny.isEmpty()) {

                if (infekcny.get(0).getDniDoOdhalenia() == 0) {
                    this.infekcny.remove(0);
                    prirastok++;
                    vymaz = true;
                } else {
                    vymaz = false;
                }
            }
        } while (vymaz);
        //System.out.println(prirastok);

        nakazDalsich();

        //testovanie
        if (testovanie.isZapnute()) {
            if (testovanie.getPocetDniDoTestovania() == 3) {
                this.hra.pridajOznamenie("Ak nenastanú komplikácie, štát plánuje celoplošné testovanie o 3 dni.");
            }
            testovanie.odratajDenDoTestovania();
            if (testovanie.getPocetDniDoTestovania() == 0) {
                UsporiadajTestovanie();
            }
        }

        //ak je malo nakazenych
        if (infekcny.size() < 10) {
            pridajNakazenych();

        }
    }

    public int getPocetNakazenych() {
        int pocet = 0;
        for (int i = 0; i < this.kraje.size(); i++) {
            for (int j = 0; j < this.kraje.get(i).getRodiny().size(); j++) {
                for (int k = 0; k < this.kraje.get(i).getRodiny().get(j).getClenoviaRodiny().size(); k++) {
                    Clovek c = this.kraje.get(i).getRodiny().get(j).getClenoviaRodiny().get(k);
                    if (c.isMaCovid()) {
                        pocet++;
                    }
                }
            }
        }
        return pocet;
    }

    public int getPocetImunnych() {
        int pocet = 0;
        for (int i = 0; i < this.kraje.size(); i++) {
            for (int j = 0; j < this.kraje.get(i).getRodiny().size(); j++) {
                for (int k = 0; k < this.kraje.get(i).getRodiny().get(j).getClenoviaRodiny().size(); k++) {
                    Clovek c = this.kraje.get(i).getRodiny().get(j).getClenoviaRodiny().get(k);
                    if (c.isImunny()) {
                        pocet++;
                    }
                }
            }
        }
        return pocet;
    }

    public int getPrirastok() {
        int pocet = 0;
        for (int i = 0; i < this.kraje.size(); i++) {
            for (int j = 0; j < this.kraje.get(i).getRodiny().size(); j++) {
                for (int k = 0; k < this.kraje.get(i).getRodiny().get(j).getClenoviaRodiny().size(); k++) {
                    Clovek c = this.kraje.get(i).getRodiny().get(j).getClenoviaRodiny().get(k);
                    if (c.getDniDoOdhalenia() == 0) {
                        pocet++;
                        c.setDniDoOdhalenia(-1);
                    }
                }
            }
        }
        return pocet;
    }

    public int getStavNemocnic() {
        return nemocnica.getPercentualneZaplnenie();
    }

    public int getPocetUmrti() {
        int pocet = 0;
        for (Kraj kraj : kraje) {
            pocet += kraj.getPocetMrtvych();
        }
        return pocet;
    }

    public int getPocetZaockovanych() {
        int pocet = 0;
        for (Kraj kraj : kraje) {
            pocet += kraj.getPocetZaockovanych();
        }
        return pocet;
    }

    public int getPocetPrvoZaockovanych() {
        int pocet = 0;
        for (Kraj kraj : kraje) {
            pocet += kraj.getPocetZaockovanychPrvouDavkou();
        }
        return pocet;
    }

    public void upravKoeficient(double cislo) {
        koeficient += cislo;
    }

    private void NajdiClovekaNaOckovanie() {
        int pocet = 0;
        Clovek vygenerovany;
        boolean spravny = false;
        do {
            Random rand = new Random();
            int vygenerovanyKraj = rand.nextInt(8);
            int vygenerovanieRodiny = rand.nextInt(this.kraje.get(vygenerovanyKraj).getRodiny().size());
            int vygenerovanyClen = rand.nextInt(this.kraje.get(vygenerovanyKraj).getRodiny().get(vygenerovanieRodiny).getClenoviaRodiny().size());
            vygenerovany = this.kraje.get(vygenerovanyKraj).getRodiny().get(vygenerovanieRodiny).getClenoviaRodiny().get(vygenerovanyClen);
            //kontrola spravnosti vygenerovaneho

            if (!vygenerovany.isMaCovid()) {
                if (!vygenerovany.isMrtvi()) {
                    if (!vygenerovany.isZaockovanyPrvouDavkou()) {
                        
                            spravny = true;
                        
                    }
                }
            }
            pocet++;
        } while (!spravny);
        if (spravny) {
            vakcina.zaockuj(vygenerovany);
        }
    }

    private void UsporiadajTestovanie() {
        int pocet = 0;
        if (!infekcny.isEmpty()) {
            SplittableRandom r = new SplittableRandom();
            int pocetOtestovanych = infekcny.size() * 3 / 4;
            System.out.println("pocet: " + pocetOtestovanych);
            for (int i = 0; i < pocetOtestovanych; i++) {
                if (r.nextDouble() < 0.6) {
                    int konkretny = r.nextInt(0, infekcny.size());
                    infekcny.get(konkretny).nastavOtestovanehoScovidom();
                    this.infekcny.remove(konkretny);
                    pocet++;
                }

            }
        }
        System.out.println(pocet);
        this.hra.pridajOznamenie("Celoplosne testovanie prebehlo uspesne. Odhalilo " + pocet + " pripadov.");
    }

    private void pridajNakazenych() {
        Random cislo = new Random();
        if (cislo.nextInt(3) == 0) {
            vygenerujNakazenehoClovek();
            if (cislo.nextInt(4) == 0) {
                vygenerujNakazenehoClovek();
            }
        }
    }

    public boolean skontrolujInfekcnost(Clovek c) {
        for (int i = 0; i < infekcny.size(); i++) {
            if (c.equals(infekcny.get(i))) {
                return true;
            }
        }
        return false;
    }
}
