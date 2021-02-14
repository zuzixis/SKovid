/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hra_GUI;

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
            case 0: this.HP.BratislavskyPocet(k.dajPocetNakazenychVkraji()); break;
            case 1: this.HP.TrnavskyPocet(k.dajPocetNakazenychVkraji()); break;
            case 2: this.HP.TrencianskyPocet(k.dajPocetNakazenychVkraji());break;
            case 3: this.HP.NitrianskyPocet(k.dajPocetNakazenychVkraji());break;
            case 4: this.HP.ZilinskyPocet(k.dajPocetNakazenychVkraji());break;
            case 5: this.HP.BanskobystrickyPocet(k.dajPocetNakazenychVkraji());break;
            case 6: this.HP.PresovskyPocet(k.dajPocetNakazenychVkraji());break;
            case 7: this.HP.KosickykyPocet(k.dajPocetNakazenychVkraji());break;
        }
    }
   
    
}
