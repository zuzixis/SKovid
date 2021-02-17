package Hra_GUI;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Zuzana Žillová
 */
public class Oznamenie {

    private ArrayList<String> zoznamOznameni = new ArrayList<>();
    private ArrayList<String> zoznamOznameniNaGenerovanie = new ArrayList<>();
    private Hra hra;
    private int sekundy = 0;
    private int pocetZobrazenych = 0;

    public Oznamenie(Hra hra) {
        this.hra = hra;
        this.nacitajOznamenia();
    }

    public void pridajOznamenie(String s) {
        zoznamOznameni.add(s);
    }

    public void vypisOznamenie(int sekundyDoDalsiehoOznamenia) {
        if (sekundy == 0) {
            if (!zoznamOznameni.isEmpty()) {
                String oznamenie = zoznamOznameni.get(0);
                zoznamOznameni.remove(0);
                this.hra.getHP().napisOznam(oznamenie);
                sekundy = sekundyDoDalsiehoOznamenia;
                pocetZobrazenych++;
                String datum = this.hra.getCas().getAktualnyDatum();
                hra.getHP().pridajNotifikaciu(datum);
                hra.getHP().pridajNotifikaciu("        ♦ "+oznamenie);
                hra.getHP().pridajNotifikaciu("                       ");
            } else {
                generujOznamenie();
            }
        } else {
            sekundy--;
        }
    }

    public void vycistiOznamenia() {
        this.zoznamOznameni.clear();
    }

    public int getPocetCakajucichOznameni() {
        return zoznamOznameni.size() - pocetZobrazenych;
    }

    private void nacitajOznamenia() {
        zoznamOznameniNaGenerovanie.add("Hlavný hygienik odporúča zajesť prisnejšie opatrenia.Najlepšie mäsom.");
        zoznamOznameniNaGenerovanie.add("Minister hospodárstva sa bojí o pokles slovenskej ekonomiky");
        zoznamOznameniNaGenerovanie.add("Vedci sa pokúšajú o ćo najrychlejší vývoj vakciny");
        zoznamOznameniNaGenerovanie.add("Poslanec Kotleba stále podporuje anti-rúškovú kampaň.");
        zoznamOznameniNaGenerovanie.add("Ľudia majú obavy o svoje zdravie.");
        zoznamOznameniNaGenerovanie.add("Ľudom sa nepáči nastavenie opatrení.");
        zoznamOznameniNaGenerovanie.add("Panika ľudí spôsobila v reťazcoch nedostatok múky.");
        zoznamOznameniNaGenerovanie.add("Minister zdravotníctva upozorňuje na zlé vybavenie nemocníc");
        zoznamOznameniNaGenerovanie.add("Slovom roka je Lockdown.");
        zoznamOznameniNaGenerovanie.add("Opozícia tvrdí, že premiér nezvláda spravovanie pandémie.");
      

    }

    public boolean zobrazuje() {
        if (sekundy > 0) {
            return true;
        }
        return false;
    }

    public void generujOznamenie() {
        Random rand = new Random();
        if (zoznamOznameniNaGenerovanie.size() > 0) {
            int vygenerovane = rand.nextInt(zoznamOznameniNaGenerovanie.size());
            this.pridajOznamenie(zoznamOznameniNaGenerovanie.get(vygenerovane));
            this.zoznamOznameniNaGenerovanie.remove(vygenerovane);
            this.vypisOznamenie(2);
        }
        
    }
}
