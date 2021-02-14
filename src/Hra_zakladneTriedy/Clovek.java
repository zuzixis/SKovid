/**
 * žiaden človek nedokáže nakaziť človeka ako človek človeka
 */
package Hra_zakladneTriedy;

/**
 * @author Zuzana Žillová
 */
public class Clovek {

    private int vek;
    private Rodina rodina;
    private Kraj kraj;
    private int zdravotnyStav;
    private int pocetDniOdPrekonania;
    private int pocetDniStravenychVChorobe;
    private boolean maCovid = false;
    private boolean karantena = false;
    private boolean zaockovany = false;
    private int dniDoOdhalenia = -1;
    private int dniVchorobe;
    private boolean imunny = false;
    private int pocetImunnychDni = 0;

    private int pocetDniVkarantene;

    public Clovek(int vek, Rodina rodina, Kraj kraj) {
        this.vek = vek;
        this.zaockovany = false;
        maCovid = false;
        this.rodina = rodina;
        this.kraj = kraj;
    }

    //Gettery a Settery
    public int getVek() {
        return vek;
    }

    public int getZdravotnyStav() {
        return zdravotnyStav;
    }

    public int getPocetDniOdPrekonania() {
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

    public void setMaCovid() {
        if (dniDoOdhalenia == -1) {
            if (!imunny) {
               if(!maCovid)
                    if (!zaockovany) {
                        dniDoOdhalenia = 2;
                      //  System.out.println("nakazeny");
                    }
                
            }
        }
    }

    public void setKarantena(boolean karantena) {
        this.karantena = karantena;
    }

    public void setZaockovany(boolean zaockovany) {
        this.zaockovany = zaockovany;
    }

    public Rodina getRodina() {
        return rodina;
    }

    public Kraj getKraj() {
        return kraj;
    }

    public void spravSiDen() {
     /*   if (this.karantena) {
            pocetDniVkarantene--;
            if (pocetDniVkarantene == 0) {
                this.karantena = false;
            }
        }*/
        if (this.maCovid) {
            dniVchorobe--;
            if (dniVchorobe == 0) {
                this.maCovid = false;
                this.imunny = true;
                this.pocetImunnychDni = 90;
            }
        } else if (dniDoOdhalenia > 0) {
            dniDoOdhalenia--;
            if (dniDoOdhalenia == 0) {
                this.maCovid = true;
                dniVchorobe = 7;
                //this.rodina.setMaRodinaCovid(true);
            }
        } else if (this.imunny) {
            this.pocetImunnychDni--;
            if (this.pocetImunnychDni == 0) {
                this.imunny = false;
            }
        }
    }

    public int getDniDoOdhalenia() {
        return dniDoOdhalenia;
    }

    public void setDniDoOdhalenia(int dniDoOdhalenia) {
        this.dniDoOdhalenia = dniDoOdhalenia;
    }

    public boolean isImunny() {
        return imunny;
    }

    public int getPocetImunnychDni() {
        return pocetImunnychDni;
    }

    public int getPocetDniVkarantene() {
        return pocetDniVkarantene;
    }

}
