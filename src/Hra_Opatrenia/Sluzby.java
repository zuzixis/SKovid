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

    private boolean rizikove = true;
    private boolean zakladne = true;

    public void setRizikove(boolean rizikove) {
        this.rizikove = rizikove;
        this.zakladne = true;
    }

    public void setNechajZakladne(boolean zakladne) {
        this.zakladne = zakladne;
        this.rizikove = false;
    }

    public void setNeobmedzene() {
        zakladne = true;
        rizikove = true;
    }

    @Override
    public void zapnutie() {

    }

    @Override
    public void vypnutie() {

    }

    @Override
    public double getIndex() {
        if (rizikove == false) {
            return 0.15;
                    
        } else if (!zakladne) {
            return 0.2;
        }
        return 0;

    }

}
