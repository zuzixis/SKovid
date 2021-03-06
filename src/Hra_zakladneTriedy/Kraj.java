package Hra_zakladneTriedy;

import java.util.ArrayList;

/**
 * @author Zuzana Žillová
 */
public class Kraj {

    private ArrayList<Rodina> rodiny = new ArrayList<Rodina>();
    private boolean otvoreny = true;
    private EStavKraja stav;
    private boolean lokalneObmedzenia;
    private String nazov;
    private int pocetNakazenych;
    private int pocetMrtvych = 0;
    private int pocetZaockovanych = 0;
    private int pocetZaockovanychPrvouDavkou = 0;

    public Kraj(String nazovKraja) {
        this.stav = EStavKraja.ZELENY;
        this.nazov = nazovKraja;
    }

    ;

    public ArrayList<Rodina> getRodiny() {
        return rodiny;
    }

    public boolean isOtvoreny() {
        return otvoreny;
    }

    public EStavKraja getStav() {
        int pocetNakazenych = this.dajPocetNakazenychVkraji();
        if (pocetNakazenych <= 50) {
            return EStavKraja.ZELENY;
        } else if (pocetNakazenych <= 250) {
            return EStavKraja.ZLTY;
        } else if (pocetNakazenych <= 1500) {
            return EStavKraja.ORANZOVY;
        } else {
            return EStavKraja.CERVENY;
        }

    }

    public boolean isLokalneObmedzenia() {
        return lokalneObmedzenia;
    }

    public void setRodiny(ArrayList<Rodina> rodiny) {
        this.rodiny = rodiny;
    }

    public void setOtvoreny(boolean otvoreny) {
        this.otvoreny = otvoreny;
    }

    public void setStav(EStavKraja stav) {
        this.stav = stav;
    }

    public void setLokalneObmedzenia(boolean lokalneObmedzenia) {
        this.lokalneObmedzenia = lokalneObmedzenia;
    }

    public void pridajRodinu(Rodina rodina) {
        this.rodiny.add(rodina);
    }

    public String getNazov() {
        return nazov;
    }

    public int dajPocetNakazenychVkraji() {
        int pocet = 0;
        for (int i = 0; i < this.rodiny.size(); i++) {
            for (int j = 0; j < this.rodiny.get(i).getClenoviaRodiny().size(); j++) {
                if (this.rodiny.get(i).getClenoviaRodiny().get(j).isMaCovid()) {
                    pocet++;
                }
            }
        }
        return pocet;
    }

    public int getPocetNakazenych() {
        return pocetNakazenych;
    }

    public int dajPocetZaockovanychVKraji() {
        int pocet = 0;
        for (int i = 0; i < this.rodiny.size(); i++) {
            pocet += this.rodiny.get(i).getPocetZaockovanychVrodine();
        }
        return pocet;
    }

    public int getPocetMrtvych() {
        return pocetMrtvych;
    }

    public void pridajMrtveho() {
        this.pocetMrtvych++;
    }

    public void pridajZaockovaneho() {
        this.pocetZaockovanych++;
    }

    public void pridajPrvoZaockovaneho() {
        this.pocetZaockovanychPrvouDavkou++;
    }

    public int getPocetZaockovanych() {
        return pocetZaockovanych;
    }

    public int getPocetZaockovanychPrvouDavkou() {
        return pocetZaockovanychPrvouDavkou;
    }
    
    public void odstranRodinu(Rodina r){
        this.rodiny.remove(r);
    }
}
