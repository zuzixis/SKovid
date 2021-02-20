/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hra_Opatrenia;

import java.util.Random;

/**
 *
 * @author Zuzana Žillová
 */
public class Skoly implements IOpatrenie {

    private boolean zapnute;

    // je to nastavene ze ak su zapnute tak sa do skoly nechodi, ci dat to naopak? Môže
    public boolean isZapnute() {
        return zapnute;
    }

    @Override
    public void zapnutie() {
        zapnute = true;
    }

    @Override
    public void vypnutie() {
        zapnute = false;
    }

    @Override
    public double getIndex() {
        if (zapnute) {
            Random r = new Random();
            return  (double)(r.nextInt(5) + 20) / 100;
        }
        return 0;
    }
}
