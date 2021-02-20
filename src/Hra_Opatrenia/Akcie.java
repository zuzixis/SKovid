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
public class Akcie implements IOpatrenie {

    private boolean zapnute;
    private int povolenyPocetLudi;

    public void setPovolenyPocetLudi(int povolenyPocetLudi) {
        this.povolenyPocetLudi = povolenyPocetLudi;
    }

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

            switch (povolenyPocetLudi) {
                case 10:
                    return (double)(r.nextInt(3)+23)/100;
                case 100:
                    return  (double)(r.nextInt(5)+16)/100;
                case 1000:
                    return  (double)(r.nextInt(3)+8)/100;
                default:
                    return 0;
            }
        } else {
            return 0;
        }
    }
}
