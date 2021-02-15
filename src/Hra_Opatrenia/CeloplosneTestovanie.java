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
public class CeloplosneTestovanie implements IOpatrenie {

    private boolean zapnute = false;
    private int pocetDniDoTestovania = -1;

    public boolean isZapnute() {
        return zapnute;
    }

    @Override
    public void zapnutie() {
        zapnute = true;
        pocetDniDoTestovania = 7;
        //treba zapnut vsetky opatrenia este
    }

    @Override
    public void vypnutie() {
        zapnute = false;
        pocetDniDoTestovania = -1;
    }

    @Override
    public double getIndex() {
        if (zapnute) {
            return 0; //Trebe doplniť !!!
        }
        return 0;
    }

    public int getPocetDniDoTestovania() {
        return pocetDniDoTestovania;
    }

    public void odratajDenDoTestovania() {
        if (zapnute) {
            if (pocetDniDoTestovania == 0) {
                pocetDniDoTestovania = 7;
            }
            this.pocetDniDoTestovania--;
        }
    }

}
