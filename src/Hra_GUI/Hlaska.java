package Hra_GUI;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Zuzana Žillová
 */

public class Hlaska {
    private ArrayList<String> hlasky = new ArrayList<>();
    private HraciPanel HP;
    private int sekundy = 10;
    
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
        hlasky.add("1");
        hlasky.add("2");
        hlasky.add("3");
        hlasky.add("4");
        hlasky.add("5");
        hlasky.add("6");
        hlasky.add("7");
        hlasky.add("8");
        hlasky.add("9");
        hlasky.add("10");
        hlasky.add("11");
        hlasky.add("12");
        hlasky.add("13");
    }
   
}
