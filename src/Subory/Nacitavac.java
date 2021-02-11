/*
 *Nacitavame zo suboru rodiny
 */
package Subory;

import Hra_zakladneTriedy.Clovek;
import Hra_zakladneTriedy.Kraj;
import Hra_zakladneTriedy.Rodina;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Erik Malina
 */
public class Nacitavac {
    private ArrayList<Kraj> kraje = new ArrayList<Kraj>();
    private int index = -1;
    private Random rand = new Random();
    private String nazovSuboru = "C:\\Users\\Zuzana Žillová\\Documents\\Projekty\\Java\\SKovid\\src\\Subory\\obyvatelstvo.txt";

//mozno dat do metody, neveim ako budeme kraje vytvarat ;)
    public Nacitavac(){
        try
        { 
          Nacitaj();
        } 
        catch(FileNotFoundException ex) 
        { 
           System.out.println("Problém s načítaním súboru");  
        } 
    }
    
    public void Nacitaj() throws FileNotFoundException {
        File f = new File(nazovSuboru);
        Scanner citac = new Scanner(f);

        int pocetClenov;
        while (citac.hasNextLine()) {
            String riadok = citac.nextLine();
            if (jeCislo(riadok)) {
                pocetClenov = Integer.parseInt(riadok);
                //pridanie rodiny
                Rodina r = new Rodina();
                
                for (int i = 0; i < pocetClenov; i++) {
                    int vek = VygenerujVek();
                    Clovek c = new Clovek(vek);
                    r.pridajClenaRodiny(c);
                }
                this.kraje.get(index).pridajRodinu(r);
            }
            else{
                //String nazov = citac.next(riadok);
                Kraj k = new Kraj(/*nazov*/);
                this.kraje.add(k);
                index++;
            }
        }
    }

    private int VygenerujVek(){
        return rand.nextInt(100)+1;
    }
    
    public boolean jeCislo(String str) {
        if (str == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
