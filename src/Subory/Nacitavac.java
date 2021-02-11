/*
 *Nacitavame zo suboru rodiny
 */
package Subory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Erik
 */
public class Nacitavac {

    private String nazovSuboru = "obyvatelstvo.txt";

//mozno dat do metody, neveim ako budeme kraje vytvarat ;)
    public Nacitavac() throws FileNotFoundException {
        File f = new File(nazovSuboru);
        Scanner citac = new Scanner(f);

        int pocetClenov;
        while (citac.hasNextLine()) {
            String riadok = citac.nextLine();
            if (jeCislo(riadok)) {
                pocetClenov = Integer.parseInt(riadok);
                //pridanie rodiny
            }
            else{
                //zalozenie noveho kraja
            }
        }

    }

    private void VygenerujVek(){
        //generujeme vek
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
