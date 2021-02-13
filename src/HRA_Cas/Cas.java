/*
 * Trieda na generovanie dátumu a plynutie času
 */
package HRA_Cas;

import Hra_GUI.Hra;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Zuzana Žillová
 */

public class Cas {
    private Hra hra;
    private String aktualnyDatum = "2020-01-01";
    
    public Cas(Hra hra)
    {
        this.hra = hra;
    }
    
    public void dalsiDen(int rychlost)
    {
        try {
            TimeUnit.SECONDS.sleep(2);
                
            } catch (InterruptedException ex) {
                System.out.println("Chyba pri cese!");
            }
        try {
            vypisDatum();
        } catch (ParseException ex) {
            System.out.print("Chyba s prepnutim datumu");
        }
    }
    
    private void vypisDatum() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(aktualnyDatum));
        c.add(Calendar.DATE, 1);  // number of days to add
        aktualnyDatum = sdf.format(c.getTime());  // dt is now the new date
        this.hra.getHP().zmenDatum(aktualnyDatum);
    }
}
