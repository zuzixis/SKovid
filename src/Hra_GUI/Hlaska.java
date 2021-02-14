package Hra_GUI;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Zuzana Žillová
 */

public class Hlaska {
    private ArrayList<String> hlasky = new ArrayList<>();
    private HraciPanel HP;
    private int sekundy = 0;
    
    public Hlaska(HraciPanel HP){
      this.HP = HP;
      nacitajHlasky();//neskor môžeme tieto hlašky (názvy) načítať zo súboru alebo len hlasky nazvat cislami :D  
    }
    
    public void vypisRandomHlasku(int sekundyDoNovejHlasky){
        if (sekundy == 0) {
            Random rand = new Random();
            int vygenerovane = rand.nextInt(hlasky.size());
            this.HP.napisHlasku(hlasky.get(vygenerovane));
            sekundy = sekundyDoNovejHlasky;
        }else sekundy--;
    }
    
    private void nacitajHlasky(){
        hlasky.add("Nevymyslel");
        hlasky.add("OneTime");
        hlasky.add("automat");
        hlasky.add("Hroby");
        hlasky.add("jednota");
        hlasky.add("odbornik");
        hlasky.add("ouNou");
        hlasky.add("pes");
        hlasky.add("podmeNato");
        hlasky.add("spolu");
    }
   
}
