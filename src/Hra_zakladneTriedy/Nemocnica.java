/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hra_zakladneTriedy;

import Hra_GUI.Hra;
import java.util.ArrayList;

/**
 *
 * @author Erik
 */
public class Nemocnica {

    private ArrayList<Clovek> pacienti = new ArrayList<Clovek>();
    private int maxKapacita = 3500;

    public Nemocnica() {
    }

    public void pridajLudi(Clovek c) {
        if (pacienti.size() <= maxKapacita) {
            pacienti.add(c);
        }
    }

    public void aktaulizuj() {
        boolean oznam = false;
        if (getPercentualneZaplnenie() < 90) {
            oznam = true;
        }
        boolean vymaz = false;
        do {
            vymaz = false;
            if (!this.pacienti.isEmpty()) {

                if (!pacienti.get(0).isKritickyStav()) {
                    this.pacienti.remove(0);
                    vymaz = true;
                } else {
                    vymaz = false;
                }
            }
        } while (vymaz);

        int pocet = pacienti.size();
        int pocetNaZive = 1;
        for (int i = 0; i < pocet; i++) {

            if (!this.pacienti.isEmpty()) {
                if (pacienti.get(pacienti.size() - pocetNaZive).isMrtvi()) {
                    this.pacienti.remove(pacienti.size() - pocetNaZive);
                } else {
                    pocetNaZive++;
                }
            }
        }

    }

    public String getOznamenie() {
        return (String) "Stav v nemocniciach je kriticky, prekrocili sme 90 percent kapacit.";
    }

    public int getPercentualneZaplnenie() {
        //System.out.println(pacienti.size());
        return (int) ((double) pacienti.size() / (double) maxKapacita * (double) 100);
    }
}
