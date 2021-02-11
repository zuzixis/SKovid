/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hra_Opatrenia;

/**
 *
 * @author Zuzana Žillová
 */
public class VysokeSkoly implements Opatrenie{
         private boolean zapnute;
     
     // je to nastavene ze ak su zapnute tak sa do skoly nechodi, ci dat to naopak?
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
            return 0.17;
        }
        return 0;
    }
}
