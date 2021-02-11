/**
 * Treida slúžiaca na prepájanie všetkých častí aplikácie
 */

package Hra_GUI;

import Hra_zakladneTriedy.Slovensko;
import Subory.Nacitavac;

/**
 *
 * @author Zuzana Žillová
 */
public class Hra {
    private HraciPanel HP;
    private Nacitavac nacitavac;
    private Slovensko SR;
    
    public Hra(){
        HP = new HraciPanel();
        nacitavac = new Nacitavac();
        SR = new Slovensko();
        SR.setKraje(nacitavac.getKraje());
    }
    
}
