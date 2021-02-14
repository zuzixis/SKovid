
package Hra_GUI;

/**
 *
 * @author Zuzana Žillová
 */
public class Vlakno_ZacatiaHry extends Thread {
    private Hra hra;
    
    public Vlakno_ZacatiaHry(Hra hra)
    {
        this.hra = hra;
    }
    
    @Override
    public void run() {
        hra.setHranie(true);
        hra.zacniHru();
    }
}
