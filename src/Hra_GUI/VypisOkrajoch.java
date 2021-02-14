/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hra_GUI;

import Hra_zakladneTriedy.EStavKraja;
import Hra_zakladneTriedy.Kraj;
import java.util.ArrayList;

/**
 *
 * @author Zuzana Žillová
 */
public class VypisOkrajoch {
    
    private HraciPanel HP;
    private ArrayList<Kraj> kraje;
    
    public VypisOkrajoch(HraciPanel HP){
        this.HP = HP;
        this.kraje = HP.getHra().getSlovensko().getKraje();
    }
    
    public void stavVkrajoch(){
        for (int i = 0; i < 8; i++) 
            infoKrajCisla(i);
    }
    
    private void infoKrajCisla(int kraj){
        Kraj k = this.kraje.get(kraj);
        
        switch(kraj)
        {
            case 0:this.HP.upravBratislavsky(k.dajPocetNakazenychVkraji(), k.getStav()); break;
            case 1:this.HP.upravTrnavsky(k.dajPocetNakazenychVkraji(), k.getStav()); break;
            case 2:this.HP.upravTrenciansky(k.dajPocetNakazenychVkraji(), k.getStav()); break;
            case 3:this.HP.upravNitriansky(k.dajPocetNakazenychVkraji(), k.getStav()); break;
            case 4:this.HP.upravZilinsky(k.dajPocetNakazenychVkraji(), k.getStav()); break;
            case 5:this.HP.upravBanskobystricky(k.dajPocetNakazenychVkraji(), k.getStav()); break;
            case 6:this.HP.upravPresovsky(k.dajPocetNakazenychVkraji(), k.getStav()); break;
            case 7:this.HP.upravKosickyky(k.dajPocetNakazenychVkraji(), k.getStav());break;
        }
    }
   
    
}
