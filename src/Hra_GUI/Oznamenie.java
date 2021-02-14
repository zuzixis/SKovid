package Hra_GUI;

import java.util.ArrayList;

/**
 * @author Zuzana Žillová
 */

public class Oznamenie {
    
    private ArrayList<String> zoznamOznameni = new ArrayList<>();
    private Hra hra;
    private int sekundy = 0;
    
    public Oznamenie(Hra hra){
        this.hra = hra;
    }
    
    public void pridajOznamenie(String s){
        zoznamOznameni.add(s);
    }
    
    public void vypisOznamenie(int sekundyDoDalsiehoOznamenia){
        if (sekundy == 0) {
            if (!zoznamOznameni.isEmpty()) {
                String oznamenie = zoznamOznameni.get(0);
                zoznamOznameni.remove(0);
                this.hra.getHP().napisOznam(oznamenie);
                sekundy = sekundyDoDalsiehoOznamenia;
            } else {
                this.hra.getHP().napisOznam("");
            }
        }else{
            sekundy--;
        }
    }
    
    public void vycistiOznamenia(){
        this.zoznamOznameni.clear();
    }
}
