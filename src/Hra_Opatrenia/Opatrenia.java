/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hra_Opatrenia;

import java.util.ArrayList;

/**
 *
 * @author Zuzana Žillová
 */
public class Opatrenia {
    
    private double index;
    
    private Akcie akcie = new Akcie();
    private Hranice hranice = new Hranice();
    private RuskaOdstup ruskaOdstup = new RuskaOdstup();
    private Skoly skoly = new Skoly();
    private Sluzby sluzby = new Sluzby();
    private VysokeSkoly vysokeSkoly = new VysokeSkoly();
    private ZakazVychadzania zakazVychadzania = new ZakazVychadzania();
    private CeloplosneTestovanie celoplosneTestovanie = new CeloplosneTestovanie();
    private ZatvorenieKrajov zatvorenieKrajov = new ZatvorenieKrajov();

    private ArrayList<IOpatrenie> opatrenia = new ArrayList<>();
    
    public Opatrenia(){
        opatrenia.add(akcie);
        opatrenia.add(hranice);
        opatrenia.add(ruskaOdstup);
        opatrenia.add(skoly);
       // opatrenia.add(sluzby);
        opatrenia.add(vysokeSkoly);
        opatrenia.add(zakazVychadzania);
       // opatrenia.add(celoplosneTestovanie);
       
    }
    
    public double getIndex() {
        return vypocitajIndex();
    }

    public void setIndex(double index) {
        this.index = index;
    }
    
    private double vypocitajIndex(){
        index = 0;
        for (int i = 0; i < opatrenia.size(); i++) {
            index += opatrenia.get(i).getIndex();
        }
        return index;
    }

    public Akcie getAkcie() {
        return akcie;
    }

    public Hranice getHranice() {
        return hranice;
    }

    public ZatvorenieKrajov getZatvorenieKrajov() {
        return zatvorenieKrajov;
    }

    public RuskaOdstup getRuskaOdstup() {
        return ruskaOdstup;
    }

    public Skoly getSkoly() {
        return skoly;
    }

    public Sluzby getSluzby() {
        return sluzby;
    }

    public VysokeSkoly getVysokeSkoly() {
        return vysokeSkoly;
    }

    public ZakazVychadzania getZakazVychadzania() {
        return zakazVychadzania;
    }

    public CeloplosneTestovanie getCeloplosneTestovanie() {
        return celoplosneTestovanie;
    }
    
    public double getIndexKraja(){
        return zatvorenieKrajov.getIndex();
    }
    
 
}