/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hra_Opatrenia;

/**
 *
 * @author Erik Malina
 */
public class RuskaOdstup implements IOpatrenie {

    private boolean zapnute;

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
            return 0.15;
        }
        return 0;
    }

}
