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
    private String aktualnyDatum = "2020-03-03";
    private String porovnanieDatum1 = "2020-06-01";
    private String porovnanieDatum2 = "2020-12-31";
    private String schvalenieVakciny = "2020-12-22";

    // private String aktualnyDatum = "2020-12-24";

    public Cas(Hra hra) {
        this.hra = hra;
    }

    public void dalsiDen(int rychlost) {
        try {
            //TimeUnit.SECONDS.sleep(rychlost);
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException ex) {
            System.out.println("Chyba pri cese!");
        }
        try {
            vypisDatum();
        } catch (ParseException ex) {
            System.out.print("Chyba s prepnutim datumu");
        }
    }

    public String getAktualnyDatum() {
        return aktualnyDatum;
    }

    private void vypisDatum() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(aktualnyDatum));
        c.add(Calendar.DATE, 1);  // number of days to add
        aktualnyDatum = sdf.format(c.getTime());  // dt is now the new date
        porovnajSrealitou();
        this.hra.getHP().zmenDatum(aktualnyDatum);
    }

    public void oddialStart(int sekundy) {
        try {
            TimeUnit.SECONDS.sleep(sekundy);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void porovnajSrealitou() {
        if (porovnanieDatum1.equals(aktualnyDatum)) {
            if (hra.getSlovensko().getPocetUmrti() < 28) {
                hra.pridajOznamenie("V skutočnosti na Slovensku umrelo do 1.6 28 ľudí. Vám umrelo " + hra.getSlovensko().getPocetUmrti() + " ľudí. \nGratulujeme, len tak ďalej");
            } else {
                hra.pridajOznamenie("V skutočnosti na Slovensku umrelo do 1.6 28 ľudí. Vám umrelo " + hra.getSlovensko().getPocetUmrti() + " ľudí. Skúste sa zlepšiť.");
            }
        } else if (porovnanieDatum2.equals(aktualnyDatum)) {
            if (hra.getSlovensko().getPocetUmrti() < 2250) {
                hra.pridajOznamenie("V skutočnosti na Slovensku umrelo do 1.12 2 250 ľudí. Vám umrelo " + hra.getSlovensko().getPocetUmrti() + " ľudí. Gratulujeme, len tak ďalej");
            } else {
                hra.pridajOznamenie("V skutočnosti na Slovensku umrelo do 1.12 2 250 ľudí. Vám umrelo " + hra.getSlovensko().getPocetUmrti() + " ľudí. Skúste sa zlepšiť.");
            }
        }else if (schvalenieVakciny.equals(aktualnyDatum)) {
            hra.pridajOznamenie("Europska liekova agentura schvalila vakcínu proti covid-19.");
            hra.pridajOznamenie("Očkovanie by sa mohlo začať 26.12.2020, čoskoro príde prvá dodávka vakcín pre 5 000 ludí");
        }
    }

}
