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
public class Sluzby implements IOpatrenie {

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
        if(zapnute){
            switch(povolenyPocetLudi){
                case 10: return 0; //zmeniť index
                case 100: return 0;
                case 1000: return 0;
                default: return 0;
            }
        }else
        {
            return 0;//treba doplniť index ked bude neobmedzené
        }
    }
}
