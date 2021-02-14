package Hra_zakladneTriedy;

import Hra_Opatrenia.Opatrenia;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author Zuzana Žillová
 */
public class Slovensko {

    private ArrayList<Kraj> kraje;
    private int spokojnost;
    private int vytazenostNemocnic;
    private Opatrenia opatrenia;
    private int pocetUmrti;
    private int pocetImunnych;
    private int pocetVsetkychZaockovanych;
    private ArrayList<Clovek> infekcny = new ArrayList<>();
    private int prirastok = 0;

    public int dajPocetVsetkychZaockovanych() {
        int pocet = 0;
        for (int i = 0; i < kraje.size(); i++) {
            pocet += kraje.get(i).dajPocetZaockovanychVKraji();
        }
        return pocet;
    }

    /*public int dajPocetVsetkychNakazenych(){
        int pocet = 0;
        for (int i = 0; i < kraje.size(); i++) {
            pocet+=kraje.get(i).dajPocetNakazenychVkraji();
        }
        System.out.println(pocet);
        return pocet;
    }*/
    public ArrayList<Kraj> getKraje() {
        return kraje;
    }

    public int getSpokojnost() {
        return spokojnost;
    }

    public int getVytazenostNemocnic() {
        return vytazenostNemocnic;
    }

    public Opatrenia getOpatrenia() {
        return opatrenia;
    }

    public int getPocetUmrti() {
        return pocetUmrti;
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

    public void setPocetUmrti(int pocetUmrti) {
        this.pocetUmrti = pocetUmrti;
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
        infekcny.add(vygenerovany);
    }

    //odratavanie do ohhalenia ze ma kovid
    public void nakazDalsich() {
        Random rand = new Random();
        
        double koeficient = 0.7;
        if(infekcny.size() > 100000)
            koeficient = 0.3;
        if(infekcny.size() > 200000)
            koeficient = 0.1;
        if(infekcny.size() > 500000)
            koeficient = 0.05;
        for (int i = 0; i < infekcny.size(); i++) {
            double sanca = rand.nextDouble();
            if (sanca <= koeficient) {
                if (rand.nextDouble() < 0.9)//opatrit ci su otvorene kraje
                {
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
        infekcny.add(vygenerovany);
    }

    public void spravDen() {
        
        for (int i = 0; i < this.kraje.size(); i++) {
            for (int j = 0; j < this.kraje.get(i).getRodiny().size(); j++) {
                for (int k = 0; k < this.kraje.get(i).getRodiny().get(j).getClenoviaRodiny().size(); k++) {
                    Clovek c = this.kraje.get(i).getRodiny().get(j).getClenoviaRodiny().get(k);
                    c.spravSiDen();
                }
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
        System.out.println(prirastok);

        nakazDalsich();
        if(infekcny.isEmpty())
            vygenerujNakazenehoClovek();
       // System.out.println("Po nakazeni: ");
        System.out.println();
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
                    if (c.getDniDoOdhalenia()==0) {
                        pocet++;
                        c.setDniDoOdhalenia(-1);
                    }
                }
            }
        }
        return pocet;
    
    }
}
