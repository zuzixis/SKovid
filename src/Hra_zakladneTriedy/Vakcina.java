/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hra_zakladneTriedy;

import java.util.ArrayList;

/**
 *
 * @author Erik
 */
public class Vakcina {

    private String zaciatokVakcinacie = "2020-12-26";
    private String schvalenieVakciny = "2020-12-22";
    private int[] pocetDostupnychDavok = {10000, 209000, 264000, 418000, 610000, 610000, 610000, 1231000, 1231000, 1231000, 900000, 900000, 900000};
    private boolean zaciatok = false;
    private ArrayList<Clovek> cakajuciNaDruhuDavku = new ArrayList<Clovek>();
    private int maxPocetNaOckovanie = 500;
    int pocetZaockovanychDnes = 0;

    public Vakcina() {
    }

    public int SpravDen() {
        maxPocetNaOckovanie = 500;
        ZaockujDruhouDavkou();
        return maxPocetNaOckovanie;
    }

    public void zaockuj(Clovek c) {
        System.out.println("zaockoval som");
        cakajuciNaDruhuDavku.add(c);
        c.setZaockovanyPrvouDavkou(true);
        pocetDostupnychDavok[0] -= 2;   //prva aj druha davka
    }

    public void ZaockujDruhouDavkou() {
        boolean potrebujeDruhuDavku = false;
        do {
            potrebujeDruhuDavku = false;
            if (cakajuciNaDruhuDavku.size() > 0) {
                if (cakajuciNaDruhuDavku.get(0).getPocetDniDoDruhejDavky() == 0) {
                    potrebujeDruhuDavku = true;
                    cakajuciNaDruhuDavku.get(0).setZaockovany(true);
                    cakajuciNaDruhuDavku.remove(0);
                    System.out.println("zaockoval som druhou davkou");
                    maxPocetNaOckovanie--;
                }
            }
        } while (potrebujeDruhuDavku);
    }

    public void setZaciatok(boolean zaciatok) {
        this.zaciatok = zaciatok;
    }

    public String getZaciatokVakcinacie() {
        return zaciatokVakcinacie;
    }

     public boolean mameDavky() {

        if (zaciatok) {
           
            if (cakajuciNaDruhuDavku.size() > 0||pocetDostupnychDavok[0] > 0) {
                return true;
            }
        }
        
        return false;
    }

}
