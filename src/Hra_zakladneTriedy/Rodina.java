/*
 * Súhrn ludí
 * základná jednotka pre Kraj
 */
package Hra_zakladneTriedy;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Zuzana Žillová
 */

public class Rodina {
    private ArrayList<Clovek> clenoviaRodiny;
    private boolean maRodinaCovid = false;
    private int pocetNakazenychClenov = 0;
    private static final double INDEX_NAKAZENOSTI = 0.8; 
                     //dal som 0.8, lebo bez rusok je 0.9 ale predpokladam ze ak sa mu ludia vyhybaju je o nieco nizsia ale dost vysoka ci?
    

    public Rodina() {
        clenoviaRodiny = new ArrayList<>();
    }
    
    public void pridajClenaRodiny(Clovek clovek)
    {
        clenoviaRodiny.add(clovek);
    }
    
    public void pridajKarantenu()
    {
        for(int i=0; i<clenoviaRodiny.size();i++)
            clenoviaRodiny.get(i).setKarantena(true);
    }
    
    public void zrusKarantenu()
    {
        for(int i=0; i<clenoviaRodiny.size();i++)
            clenoviaRodiny.get(i).setKarantena(false);
    }

    public boolean getMaRodinaCovid() {
        return maRodinaCovid;
    }

    public void setMaRodinaCovid(boolean maRodinaCovid) {
        this.maRodinaCovid = maRodinaCovid;
    }

    public int getPocetNakazenychClenov() {
        return pocetNakazenychClenov;
    }

    public void setPocetNakazenychClenov(int pocetNakazenychClenov) {
        this.pocetNakazenychClenov = pocetNakazenychClenov;
    }   
    
    public void nadstavChorobu(){
        for (int i = 0; i < this.clenoviaRodiny.size(); i++) {
            if (nakazenieDalsiehoClenaRodiny(this.pocetNakazenychClenov*INDEX_NAKAZENOSTI)){
               this.clenoviaRodiny.get(i).setMaCovid(true);
               this.pocetNakazenychClenov++;
            }
        }
    }
    
    public int getPocetZaockovanychVrodine(){
        int pocetZaockovanych = 0;
        for (int i = 0; this.clenoviaRodiny.size() < 10; i++) {
            if(this.clenoviaRodiny.get(i).isZaockovany())
                pocetZaockovanych ++;
        }
        return pocetZaockovanych;
    }
    
    /**
     * vygenerovanie, či další člen domácnosti dostal kovid alebo nie 
     */
    private boolean nakazenieDalsiehoClenaRodiny(double sancaNakazania)
    {
        Random rand = new Random();
        double vygenerovane = rand.nextDouble();
        
        if (vygenerovane < sancaNakazania) {
            return true;
        }else 
            return false;
    }
    
}
