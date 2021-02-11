/**
 * žiaden človek nedokáže nakaziť človeka ako človek človeka
 */
package Hra_zakladneTriedy;

/**
 * @author Zuzana Žillová
 */
public class Clovek {
    private int vek;
    private int zdravotnyStav;
    private int pocetDniOdPrekonania;
    private int pocetDniStravenychVChorobe;
    private boolean maCovid;
    private boolean karantena;
    private boolean zaockovany;
    
    public Clovek(int vek)
    {
        this.vek = vek;
    }
    
    //Gettery a Settery
    public int getVek()
    {
        return vek;
    }
    
    public int getZdravotnyStav()
    {
        return zdravotnyStav;
    }
    
    public int getPocetDniOdPrekonania()
    {
        return pocetDniOdPrekonania;
    }

    public int getPocetDniStravenychVChorobe() {
        return pocetDniStravenychVChorobe;
    }

    public boolean isMaCovid() {
        return maCovid;
    }

    public boolean isKarantena() {
        return karantena;
    }

    public boolean isZaockovany() {
        return zaockovany;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public void setZdravotnyStav(int zdravotnyStav) {
        this.zdravotnyStav = zdravotnyStav;
    }

    public void setPocetDniOdPrekonania(int pocetDniOdPrekonania) {
        this.pocetDniOdPrekonania = pocetDniOdPrekonania;
    }

    public void setPocetDniStravenychVChorobe(int pocetDniStravenychVChorobe) {
        this.pocetDniStravenychVChorobe = pocetDniStravenychVChorobe;
    }

    public void setMaCovid(boolean maCovid) {
        this.maCovid = maCovid;
    }

    public void setKarantena(boolean karantena) {
        this.karantena = karantena;
    }

    public void setZaockovany(boolean zaockovany) {
        this.zaockovany = zaockovany;
    }
    
        
    
    
}
