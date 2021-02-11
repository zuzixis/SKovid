
package Hra_zakladneTriedy;

import Hra_Opatrenia.Opatrenia;
import java.util.ArrayList;

/**
 * @author Zuzana Žillová
 */

public class Slovensko {
    private ArrayList<Kraj> kraje;
    private int spokojnost;
    private int vytazenostNemocnic;
    private Opatrenia opatrenia;
    private int pocetNakazenych;
    private int pocetUmrti;
    private int pocetImunnych;
    private int pocetVsetkychZaockovanych;

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

    public int getPocetNakazenych() {
        return pocetNakazenych;
    }

    public int getPocetUmrti() {
        return pocetUmrti;
    }

    public int getPocetImunnych() {
        return pocetImunnych;
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

    public void setPocetNakazenych(int pocetNakazenych) {
        this.pocetNakazenych = pocetNakazenych;
    }

    public void setPocetUmrti(int pocetUmrti) {
        this.pocetUmrti = pocetUmrti;
    }

    public void setPocetImunnych(int pocetImunnych) {
        this.pocetImunnych = pocetImunnych;
    }

    public void setPocetVsetkychZaockovanych(int pocetVsetkychZaockovanych) {
        this.pocetVsetkychZaockovanych = pocetVsetkychZaockovanych;
    }
    
    public void pridajKraj(Kraj kraj)
    {
        this.kraje.add(kraj);
    }
}
