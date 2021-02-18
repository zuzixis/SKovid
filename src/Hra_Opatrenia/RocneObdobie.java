/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hra_Opatrenia;

import Hra_GUI.Hra;

/**
 *
 * @author Erik
 */
public class RocneObdobie implements IOpatrenie {

    private boolean leto = false;
    private String zaciatokLeta = "06";
    private String koniecLeta = "09";
    
    private Hra hra;
    

    public RocneObdobie(Hra hra) {
    }

    public void skontrolujDatum(String datum) {

        String[] arrOfStr = datum.split("-");
        if (leto) {

            if (arrOfStr[1].equals(koniecLeta)) {
                leto = false;
            }
        } else {
            if (arrOfStr[1].equals(zaciatokLeta)) {
                leto = true;
            }
        }
    }

    //zapni leto
    @Override
    public void zapnutie() {
        leto = true;
    }

    //vypni leto
    @Override
    public void vypnutie() {
        leto = false;
    }

    @Override
    public double getIndex() {
        if (leto) {
            return 0.1;
        }

        return 0;
    }

    public boolean isLeto() {
        return leto;
    }

}
