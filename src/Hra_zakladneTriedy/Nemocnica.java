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
        for (int i = 0; i < pocet; i++) {

            if (!this.pacienti.isEmpty()) {
                if (pacienti.get(pacienti.size() - 1).isMrtvi()) {
                    this.pacienti.remove(pacienti.size() - 1);

                }
            }

        }
    }

    public int getPercentualneZaplnenie() {
        System.out.println(pacienti.size());
        return (int) ((double) pacienti.size() / (double) maxKapacita * (double) 100);

    }
}
