package Hra_zakladneTriedy;

import java.util.ArrayList;

/**
 * @author Zuzana Žillová
 */

public class Kraj {
    ArrayList<Rodina> rodiny;
    boolean otvoreny = true;
    EStavKraja stav;
    boolean lokalneObmedzenia;
    
    public Kraj(){
        this.stav = EStavKraja.ZELENY;
    };

    public ArrayList<Rodina> getRodiny() {
        return rodiny;
    }

    public boolean isOtvoreny() {
        return otvoreny;
    }

    public EStavKraja getStav() {
        return stav;
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
    
    public void pridajRodinu(Rodina rodina)
    {
        this.rodiny.add(rodina);
    }   
}
