/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hra_zakladneTriedy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erik
 */
public class Vakcina {

    private String zaciatokVakcinacie = "2020-12-26";
    private String schvalenieVakciny = "2020-12-22";
    private String datumDodaniaZasielky = "2021-01-07";
    private ArrayList<Integer> dodavkyVakcin = new ArrayList<Integer>();
    private int pocetDostupnychVakcin = 0;
    private boolean zaciatok = false;
    private ArrayList<Clovek> cakajuciNaDruhuDavku = new ArrayList<Clovek>();
    private int maxPocetNaOckovanie = 500;
    private int maxPocetNaOckovanieDenne = 500;
    private int limitDenny = 10000;
    int pocetZaockovanychDnes = 0;

    public Vakcina() {
        naplnDodavkyVakcin();
    }

    public int SpravDen() {
        double koef = maxPocetNaOckovanieDenne * 9 / 10;
        maxPocetNaOckovanie = (int) koef;
        Random r = new Random();
        maxPocetNaOckovanie += r.nextInt((int) (koef / 10));
        //System.out.println(maxPocetNaOckovanie);
        //System.out.println("Poecet vakcin: "+pocetDostupnychVakcin);
        if (maxPocetNaOckovanieDenne < limitDenny) {
            maxPocetNaOckovanieDenne *= 1.15;
            //System.out.println("zvysil som");
        }

        ZaockujDruhouDavkou();
        //System.out.println("pocet prvou = " + maxPocetNaOckovanie);
        if (maxPocetNaOckovanie < 0) {
            return 0;
        }
        if (maxPocetNaOckovanie < pocetDostupnychVakcin) {
            return maxPocetNaOckovanie;
        } else if (pocetDostupnychVakcin > 0) {
            return pocetDostupnychVakcin / 2;
        }

        return 0;
    }

    public void zaockuj(Clovek c) {
        //System.out.println("zaockoval som");
        if (pocetDostupnychVakcin >= 2) {
            cakajuciNaDruhuDavku.add(c);
            c.setZaockovanyPrvouDavkou(true);
            pocetDostupnychVakcin -= 2;   //prva aj druha davka
        }
    }

    public int getPocetDostupnychVakcin() {
        return pocetDostupnychVakcin / 2;
    }

    private void ZaockujDruhouDavkou() {
        int pocet = 0;
        boolean potrebujeDruhuDavku = false;
        do {
            potrebujeDruhuDavku = false;
            if (cakajuciNaDruhuDavku.size() > 0) {
                //System.out.println(cakajuciNaDruhuDavku.size());
                //odstranZcakacky();
                //System.out.println(cakajuciNaDruhuDavku.size());
                //System.out.println("-------------------------");
                if (cakajuciNaDruhuDavku.get(0).getPocetDniDoDruhejDavky() == 0) {
                    potrebujeDruhuDavku = true;
                    cakajuciNaDruhuDavku.get(0).setZaockovany(true);
                    cakajuciNaDruhuDavku.remove(0);
                    pocet++;

                    maxPocetNaOckovanie--;
                }
            }

        } while (potrebujeDruhuDavku);
        if (cakajuciNaDruhuDavku.size() > 0) {
            System.out.println(cakajuciNaDruhuDavku.get(0).getPocetDniDoDruhejDavky());
        }
    }

    public void dodajZasielku() {
        if (!dodavkyVakcin.isEmpty()) {
            pocetDostupnychVakcin += dodavkyVakcin.get(0);
            dodavkyVakcin.remove(0);
            if (pocetDostupnychVakcin > 400000) {
                limitDenny = 15000;
            }

        }
        NastavDodaniaVakcin();
    }

    public void setZaciatok() {
        this.zaciatok = true;
        pocetDostupnychVakcin += dodavkyVakcin.get(0);
        dodavkyVakcin.remove(0);
    }

    public String getZaciatokVakcinacie() {
        return zaciatokVakcinacie;
    }

    public boolean mameDavky() {

        if (zaciatok) {

            if (cakajuciNaDruhuDavku.size() > 0 || pocetDostupnychVakcin > 0) {
                return true;
            }
        }

        return false;
    }

    public String getDatumDodaniaZasielky() {
        return datumDodaniaZasielky;
    }

    public int getPocetNajblizsejDodavky() {
        if (dodavkyVakcin.size() > 0) {
            return dodavkyVakcin.get(0);
        }
        return 0;
    }

    public void setDatumDodaniaZasielky(String datumDodaniaZasielky) {
        this.datumDodaniaZasielky = datumDodaniaZasielky;
    }

    public boolean isVakcinacia() {
        return zaciatok;
    }

    private void naplnDodavkyVakcin() {
        dodavkyVakcin.add(10000);
        dodavkyVakcin.add(209000);
        dodavkyVakcin.add(264000);
        dodavkyVakcin.add(418000);
        dodavkyVakcin.add(610000);
        dodavkyVakcin.add(610000);
        dodavkyVakcin.add(610000);
        dodavkyVakcin.add(1231000);
        dodavkyVakcin.add(1231000);
        dodavkyVakcin.add(1231000);
        dodavkyVakcin.add(900000);
        dodavkyVakcin.add(900000);
        dodavkyVakcin.add(900000);

    }

    public void NastavDodaniaVakcin() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(sdf.parse(datumDodaniaZasielky));
        } catch (ParseException ex) {
            Logger.getLogger(Vakcina.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.add(Calendar.MONTH, 1);  // number of days to add
        String datumDodavkyVakcin = sdf.format(c.getTime());  // dt is now the new date
        setDatumDodaniaZasielky(datumDodavkyVakcin);

    }

    public String getSchvalenieVakciny() {
        return schvalenieVakciny;
    }

    public void odstranZcakacky() {
        ArrayList<Clovek> pom = new ArrayList<>();
        int pocet = 0;
        for (int i = 0; i < cakajuciNaDruhuDavku.size(); i++) {
            if (cakajuciNaDruhuDavku.get(i).isMrtvi()) {

            } else {
                pom.add(cakajuciNaDruhuDavku.get(i));
            }
        }
        cakajuciNaDruhuDavku.clear();
        cakajuciNaDruhuDavku = pom;

    }
}
