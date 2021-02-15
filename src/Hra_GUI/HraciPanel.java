package Hra_GUI;

import Hra_Opatrenia.Opatrenia;
import Hra_zakladneTriedy.EStavKraja;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.YIntervalRenderer;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/**
 * @author Zuzana Žillová
 */
public class HraciPanel extends javax.swing.JFrame{

    private final Hra hra;
    private boolean rusko = false;
    private boolean hranice = false;
    private boolean zakazVychadzania = false;
    private boolean celoplosneTestovanie = false;
    private boolean uzavretieKrajov = false;
    private int akcie = 0;
    private ESluzby sluzby = ESluzby.OTVORENE ;
    private ESkoly skoly = ESkoly.OTVORENE;
    private boolean zapnutieOpatreni = false;
    private ENadstavenieMenu menu = ENadstavenieMenu.PREHLAD;
    private Opatrenia opatrenia;
    private boolean skrytiePrehladu = false;
    
    private String aktualnyDatum ="2020-01-01";
    
    private ArrayList<Integer> hototyNakazenyhc = new ArrayList<>();
    private ArrayList<Integer> hodnotyZaockovanych = new ArrayList<>();
    private ArrayList<Integer> hodnotyImunnych = new ArrayList<>();
    private ArrayList<String> vsetkyHlasenia = new ArrayList<>();
    private DefaultListModel zoznamPoloziek = new DefaultListModel();
    
    
    public HraciPanel(Opatrenia opatrenia, Hra hra) {
        this.nadtsaveniaJFrame();
        this.opatrenia = opatrenia;
        this.hra = hra;
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hlavnyPanel = new javax.swing.JPanel();
        pozadieUvod = new javax.swing.JLabel();
        start = new javax.swing.JLabel();
        T_Opatrenia = new javax.swing.JLabel();
        K_ZavKraje = new javax.swing.JLabel();
        K_Rusko = new javax.swing.JLabel();
        K_Hranice = new javax.swing.JLabel();
        K_ZakazVych = new javax.swing.JLabel();
        K_CeloTest = new javax.swing.JLabel();
        K_A_Neobmedzene = new javax.swing.JLabel();
        K_A_Max10 = new javax.swing.JLabel();
        K_A_Max100 = new javax.swing.JLabel();
        K_A_Max1000 = new javax.swing.JLabel();
        K_SK_ZavreteVS = new javax.swing.JLabel();
        K_SK_ZavreteVsetky = new javax.swing.JLabel();
        K_S_ZavreteRizikove = new javax.swing.JLabel();
        K_S_Zakladne = new javax.swing.JLabel();
        BTNI_Rusko_Hranice = new javax.swing.JLabel();
        BTNI_Skoly = new javax.swing.JLabel();
        BTNI_Sluzby = new javax.swing.JLabel();
        BTNI_Akcie = new javax.swing.JLabel();
        BTNI_ZakazVych = new javax.swing.JLabel();
        BTNI_CeloTest = new javax.swing.JLabel();
        BTNI_ZavKraje = new javax.swing.JLabel();
        BTNI_OtvorVsetko = new javax.swing.JLabel();
        P_vsetciNakazeni = new javax.swing.JLabel();
        P_nakazeniZaDen = new javax.swing.JLabel();
        P_pocetUmrti = new javax.swing.JLabel();
        P_pocetZaockovanych = new javax.swing.JLabel();
        P_nstavNemocnice = new javax.swing.JLabel();
        P_spoocenskaStabilita = new javax.swing.JLabel();
        Datum = new javax.swing.JLabel();
        M_Soc_siete = new javax.swing.JLabel();
        M_Spravy = new javax.swing.JLabel();
        M_Notifikacie = new javax.swing.JLabel();
        M_Prehlad = new javax.swing.JLabel();
        BTNI_Menu = new javax.swing.JLabel();
        KR_Bratislavsky = new javax.swing.JLabel();
        KR_Trnavsky = new javax.swing.JLabel();
        KR_Trenciansky = new javax.swing.JLabel();
        KR_Nitriansky = new javax.swing.JLabel();
        KR_Zilinsky = new javax.swing.JLabel();
        KR_BanskoBystricky = new javax.swing.JLabel();
        KR_Presovsky = new javax.swing.JLabel();
        KR_Kosicky = new javax.swing.JLabel();
        Hlasky = new javax.swing.JLabel();
        Oznam = new javax.swing.JLabel();
        tien = new javax.swing.JLabel();
        Mapa_hraniceOkresy = new javax.swing.JLabel();
        Mapa_hranice = new javax.swing.JLabel();
        Mapa_kosicky = new javax.swing.JLabel();
        Mapa_presovsky = new javax.swing.JLabel();
        Mapa_banskobystricky = new javax.swing.JLabel();
        Mapa_zilinsky = new javax.swing.JLabel();
        Mapa_nitriansky = new javax.swing.JLabel();
        Mapa_trenciansky = new javax.swing.JLabel();
        Mapa_trnavsky = new javax.swing.JLabel();
        Mapa_bratislavsky = new javax.swing.JLabel();
        Mapa_pozadie = new javax.swing.JLabel();
        Notifikacie = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        panel_Graf = new javax.swing.JPanel();
        panel_Graf2_kruhovy = new javax.swing.JPanel();
        panel_Graf3_vyfarbeny = new javax.swing.JPanel();
        pozadie = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hlavnyPanel.setPreferredSize(new java.awt.Dimension(1400, 750));
        hlavnyPanel.setLayout(null);

        pozadieUvod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/Pozadie_uvod.png"))); // NOI18N
        hlavnyPanel.add(pozadieUvod);
        pozadieUvod.setBounds(-10, 710, 1400, 750);

        start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startMouseClicked(evt);
            }
        });
        hlavnyPanel.add(start);
        start.setBounds(950, 610, 60, 50);

        T_Opatrenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/opatreniaLabel.png"))); // NOI18N
        hlavnyPanel.add(T_Opatrenia);
        T_Opatrenia.setBounds(1110, 0, 80, 40);

        K_ZavKraje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                K_ZavKrajeMouseClicked(evt);
            }
        });
        hlavnyPanel.add(K_ZavKraje);
        K_ZavKraje.setBounds(1220, 330, 40, 20);

        K_Rusko.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                K_RuskoMouseClicked(evt);
            }
        });
        hlavnyPanel.add(K_Rusko);
        K_Rusko.setBounds(1080, 50, 30, 30);

        K_Hranice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                K_HraniceMouseClicked(evt);
            }
        });
        hlavnyPanel.add(K_Hranice);
        K_Hranice.setBounds(1230, 50, 30, 30);

        K_ZakazVych.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                K_ZakazVychMouseClicked(evt);
            }
        });
        hlavnyPanel.add(K_ZakazVych);
        K_ZakazVych.setBounds(1220, 360, 40, 20);

        K_CeloTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                K_CeloTestMouseClicked(evt);
            }
        });
        hlavnyPanel.add(K_CeloTest);
        K_CeloTest.setBounds(1220, 390, 40, 20);

        K_A_Neobmedzene.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                K_A_NeobmedzeneMouseClicked(evt);
            }
        });
        hlavnyPanel.add(K_A_Neobmedzene);
        K_A_Neobmedzene.setBounds(1000, 190, 130, 30);

        K_A_Max10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                K_A_Max10MouseClicked(evt);
            }
        });
        hlavnyPanel.add(K_A_Max10);
        K_A_Max10.setBounds(1130, 220, 120, 30);

        K_A_Max100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                K_A_Max100MouseClicked(evt);
            }
        });
        hlavnyPanel.add(K_A_Max100);
        K_A_Max100.setBounds(1000, 220, 130, 30);

        K_A_Max1000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                K_A_Max1000MouseClicked(evt);
            }
        });
        hlavnyPanel.add(K_A_Max1000);
        K_A_Max1000.setBounds(1130, 190, 120, 30);

        K_SK_ZavreteVS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                K_SK_ZavreteVSMouseClicked(evt);
            }
        });
        hlavnyPanel.add(K_SK_ZavreteVS);
        K_SK_ZavreteVS.setBounds(1120, 130, 30, 30);

        K_SK_ZavreteVsetky.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                K_SK_ZavreteVsetkyMouseClicked(evt);
            }
        });
        hlavnyPanel.add(K_SK_ZavreteVsetky);
        K_SK_ZavreteVsetky.setBounds(1260, 120, 30, 30);

        K_S_ZavreteRizikove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                K_S_ZavreteRizikoveMouseClicked(evt);
            }
        });
        hlavnyPanel.add(K_S_ZavreteRizikove);
        K_S_ZavreteRizikove.setBounds(1120, 290, 30, 20);

        K_S_Zakladne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                K_S_ZakladneMouseClicked(evt);
            }
        });
        hlavnyPanel.add(K_S_Zakladne);
        K_S_Zakladne.setBounds(1270, 290, 30, 20);

        BTNI_Rusko_Hranice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ruska_inactive.png"))); // NOI18N
        BTNI_Rusko_Hranice.setPreferredSize(new java.awt.Dimension(60, 146));
        hlavnyPanel.add(BTNI_Rusko_Hranice);
        BTNI_Rusko_Hranice.setBounds(990, 50, 300, 40);

        BTNI_Skoly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/skolyNeobmedzene.png"))); // NOI18N
        hlavnyPanel.add(BTNI_Skoly);
        BTNI_Skoly.setBounds(1000, 90, 330, 70);

        BTNI_Sluzby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/otvoreneSluzby.png"))); // NOI18N
        hlavnyPanel.add(BTNI_Sluzby);
        BTNI_Sluzby.setBounds(1000, 270, 320, 40);

        BTNI_Akcie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/kapacitaNeobmedzena.png"))); // NOI18N
        hlavnyPanel.add(BTNI_Akcie);
        BTNI_Akcie.setBounds(980, 150, 280, 110);

        BTNI_ZakazVych.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/vychadzanie_inactive.png"))); // NOI18N
        hlavnyPanel.add(BTNI_ZakazVych);
        BTNI_ZakazVych.setBounds(990, 350, 300, 40);

        BTNI_CeloTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/testovanie_inactive.png"))); // NOI18N
        hlavnyPanel.add(BTNI_CeloTest);
        BTNI_CeloTest.setBounds(990, 380, 300, 40);

        BTNI_ZavKraje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/kraje_inactive.png"))); // NOI18N
        hlavnyPanel.add(BTNI_ZavKraje);
        BTNI_ZavKraje.setBounds(990, 320, 300, 40);

        BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/vypnute.png"))); // NOI18N
        BTNI_OtvorVsetko.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNI_OtvorVsetkoMouseClicked(evt);
            }
        });
        hlavnyPanel.add(BTNI_OtvorVsetko);
        BTNI_OtvorVsetko.setBounds(930, 450, 280, 30);

        P_vsetciNakazeni.setBackground(new java.awt.Color(255, 255, 255));
        P_vsetciNakazeni.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        P_vsetciNakazeni.setForeground(new java.awt.Color(255, 255, 255));
        P_vsetciNakazeni.setText("0");
        hlavnyPanel.add(P_vsetciNakazeni);
        P_vsetciNakazeni.setBounds(130, 290, 130, 30);

        P_nakazeniZaDen.setBackground(new java.awt.Color(255, 255, 255));
        P_nakazeniZaDen.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        P_nakazeniZaDen.setForeground(new java.awt.Color(255, 255, 255));
        P_nakazeniZaDen.setText("0");
        hlavnyPanel.add(P_nakazeniZaDen);
        P_nakazeniZaDen.setBounds(130, 330, 130, 30);

        P_pocetUmrti.setBackground(new java.awt.Color(255, 255, 255));
        P_pocetUmrti.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        P_pocetUmrti.setForeground(new java.awt.Color(255, 255, 255));
        P_pocetUmrti.setText("0");
        hlavnyPanel.add(P_pocetUmrti);
        P_pocetUmrti.setBounds(130, 370, 130, 30);

        P_pocetZaockovanych.setBackground(new java.awt.Color(255, 255, 255));
        P_pocetZaockovanych.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        P_pocetZaockovanych.setForeground(new java.awt.Color(255, 255, 255));
        P_pocetZaockovanych.setText("0");
        hlavnyPanel.add(P_pocetZaockovanych);
        P_pocetZaockovanych.setBounds(130, 410, 130, 30);

        P_nstavNemocnice.setBackground(new java.awt.Color(255, 255, 255));
        P_nstavNemocnice.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        P_nstavNemocnice.setForeground(new java.awt.Color(255, 255, 255));
        P_nstavNemocnice.setText("0");
        hlavnyPanel.add(P_nstavNemocnice);
        P_nstavNemocnice.setBounds(130, 450, 130, 30);

        P_spoocenskaStabilita.setBackground(new java.awt.Color(255, 255, 255));
        P_spoocenskaStabilita.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        P_spoocenskaStabilita.setForeground(new java.awt.Color(255, 255, 255));
        P_spoocenskaStabilita.setText("0");
        hlavnyPanel.add(P_spoocenskaStabilita);
        P_spoocenskaStabilita.setBounds(130, 500, 130, 30);

        Datum.setBackground(new java.awt.Color(255, 255, 255));
        Datum.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Datum.setForeground(new java.awt.Color(255, 255, 255));
        hlavnyPanel.add(Datum);
        Datum.setBounds(720, 60, 100, 30);

        M_Soc_siete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_Soc_sieteMouseClicked(evt);
            }
        });
        hlavnyPanel.add(M_Soc_siete);
        M_Soc_siete.setBounds(70, 130, 200, 40);

        M_Spravy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_SpravyMouseClicked(evt);
            }
        });
        hlavnyPanel.add(M_Spravy);
        M_Spravy.setBounds(70, 170, 200, 40);

        M_Notifikacie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_NotifikacieMouseClicked(evt);
            }
        });
        hlavnyPanel.add(M_Notifikacie);
        M_Notifikacie.setBounds(70, 220, 200, 50);

        M_Prehlad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_PrehladMouseClicked(evt);
            }
        });
        hlavnyPanel.add(M_Prehlad);
        M_Prehlad.setBounds(70, 90, 200, 40);

        BTNI_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/menu_Prehlad.png"))); // NOI18N
        BTNI_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNI_MenuMouseClicked(evt);
            }
        });
        hlavnyPanel.add(BTNI_Menu);
        BTNI_Menu.setBounds(71, 86, 194, 185);

        KR_Bratislavsky.setForeground(new java.awt.Color(0, 0, 0));
        KR_Bratislavsky.setText("0");
        hlavnyPanel.add(KR_Bratislavsky);
        KR_Bratislavsky.setBounds(1040, 650, 40, 20);

        KR_Trnavsky.setForeground(new java.awt.Color(0, 0, 0));
        KR_Trnavsky.setText("0");
        hlavnyPanel.add(KR_Trnavsky);
        KR_Trnavsky.setBounds(1070, 680, 41, 16);

        KR_Trenciansky.setForeground(new java.awt.Color(0, 0, 0));
        KR_Trenciansky.setText("0");
        hlavnyPanel.add(KR_Trenciansky);
        KR_Trenciansky.setBounds(1090, 600, 50, 16);

        KR_Nitriansky.setForeground(new java.awt.Color(0, 0, 0));
        KR_Nitriansky.setText("0");
        hlavnyPanel.add(KR_Nitriansky);
        KR_Nitriansky.setBounds(1110, 660, 40, 16);

        KR_Zilinsky.setForeground(new java.awt.Color(0, 0, 0));
        KR_Zilinsky.setText("0");
        hlavnyPanel.add(KR_Zilinsky);
        KR_Zilinsky.setBounds(1160, 570, 60, 16);

        KR_BanskoBystricky.setForeground(new java.awt.Color(0, 0, 0));
        KR_BanskoBystricky.setText("0");
        hlavnyPanel.add(KR_BanskoBystricky);
        KR_BanskoBystricky.setBounds(1180, 620, 60, 16);

        KR_Presovsky.setForeground(new java.awt.Color(0, 0, 0));
        KR_Presovsky.setText("0");
        hlavnyPanel.add(KR_Presovsky);
        KR_Presovsky.setBounds(1290, 550, 70, 16);

        KR_Kosicky.setForeground(new java.awt.Color(0, 0, 0));
        KR_Kosicky.setText("0");
        hlavnyPanel.add(KR_Kosicky);
        KR_Kosicky.setBounds(1280, 590, 60, 16);

        Hlasky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/podmeNato.png"))); // NOI18N
        hlavnyPanel.add(Hlasky);
        Hlasky.setBounds(220, 600, 330, 100);

        Oznam.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        Oznam.setForeground(new java.awt.Color(229, 229, 229));
        Oznam.setText("Oznam ");
        hlavnyPanel.add(Oznam);
        Oznam.setBounds(270, 66, 440, 20);

        tien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/spodok.png"))); // NOI18N
        hlavnyPanel.add(tien);
        tien.setBounds(950, 500, 430, 50);

        Mapa_hraniceOkresy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/okresyHranica.png"))); // NOI18N
        hlavnyPanel.add(Mapa_hraniceOkresy);
        Mapa_hraniceOkresy.setBounds(1010, 510, 394, 219);

        Mapa_hranice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/pozadieHranica.png"))); // NOI18N
        hlavnyPanel.add(Mapa_hranice);
        Mapa_hranice.setBounds(1010, 510, 394, 219);
        hlavnyPanel.add(Mapa_kosicky);
        Mapa_kosicky.setBounds(1010, 510, 394, 219);
        hlavnyPanel.add(Mapa_presovsky);
        Mapa_presovsky.setBounds(1010, 510, 394, 219);
        hlavnyPanel.add(Mapa_banskobystricky);
        Mapa_banskobystricky.setBounds(1010, 510, 394, 219);
        hlavnyPanel.add(Mapa_zilinsky);
        Mapa_zilinsky.setBounds(1010, 510, 394, 219);
        hlavnyPanel.add(Mapa_nitriansky);
        Mapa_nitriansky.setBounds(1010, 510, 394, 219);
        hlavnyPanel.add(Mapa_trenciansky);
        Mapa_trenciansky.setBounds(1010, 510, 394, 219);
        hlavnyPanel.add(Mapa_trnavsky);
        Mapa_trnavsky.setBounds(1010, 510, 394, 219);
        hlavnyPanel.add(Mapa_bratislavsky);
        Mapa_bratislavsky.setBounds(1010, 510, 394, 219);

        Mapa_pozadie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/pozadieMapa1.png"))); // NOI18N
        hlavnyPanel.add(Mapa_pozadie);
        Mapa_pozadie.setBounds(1010, 510, 394, 219);

        List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Notifikacie.setViewportView(List);

        hlavnyPanel.add(Notifikacie);
        Notifikacie.setBounds(270, 90, 540, 440);

        panel_Graf.setForeground(new java.awt.Color(229, 229, 229));

        javax.swing.GroupLayout panel_GrafLayout = new javax.swing.GroupLayout(panel_Graf);
        panel_Graf.setLayout(panel_GrafLayout);
        panel_GrafLayout.setHorizontalGroup(
            panel_GrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        panel_GrafLayout.setVerticalGroup(
            panel_GrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        hlavnyPanel.add(panel_Graf);
        panel_Graf.setBounds(270, 90, 540, 240);

        panel_Graf2_kruhovy.setForeground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout panel_Graf2_kruhovyLayout = new javax.swing.GroupLayout(panel_Graf2_kruhovy);
        panel_Graf2_kruhovy.setLayout(panel_Graf2_kruhovyLayout);
        panel_Graf2_kruhovyLayout.setHorizontalGroup(
            panel_Graf2_kruhovyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        panel_Graf2_kruhovyLayout.setVerticalGroup(
            panel_Graf2_kruhovyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        hlavnyPanel.add(panel_Graf2_kruhovy);
        panel_Graf2_kruhovy.setBounds(270, 330, 280, 200);

        javax.swing.GroupLayout panel_Graf3_vyfarbenyLayout = new javax.swing.GroupLayout(panel_Graf3_vyfarbeny);
        panel_Graf3_vyfarbeny.setLayout(panel_Graf3_vyfarbenyLayout);
        panel_Graf3_vyfarbenyLayout.setHorizontalGroup(
            panel_Graf3_vyfarbenyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        panel_Graf3_vyfarbenyLayout.setVerticalGroup(
            panel_Graf3_vyfarbenyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        hlavnyPanel.add(panel_Graf3_vyfarbeny);
        panel_Graf3_vyfarbeny.setBounds(550, 330, 260, 200);

        pozadie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/Pozadie1.png"))); // NOI18N
        hlavnyPanel.add(pozadie);
        pozadie.setBounds(0, 0, 1400, 715);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(hlavnyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hlavnyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void nadtsaveniaJFrame(){
        ImageIcon frameIcon = new ImageIcon("C:\\Users\\Zuzana Žillová\\Documents\\Projekty\\Java\\SKovid\\src\\HRA_Kresbicky\\logo.jpg");
        this.setIconImage(frameIcon.getImage());
        setPreferredSize( new Dimension( 1400,750 ) );
        initComponents();
        setVisible(true);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setTitle( "SKovid" );
        pack();
        
        this.Mapa_hranice.setVisible(hranice);
        this.Mapa_hraniceOkresy.setVisible(uzavretieKrajov); 
        this.Notifikacie.setVisible(false);
        
    }
    
    private void K_RuskoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_RuskoMouseClicked
        if (!rusko) {
            if (!zapnutieOpatreni) {
                zapnutieOpatreni = true;
                
                this.BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zapinac.png")));;
            }
            rusko = true;
            this.opatrenia.getRuskaOdstup().zapnutie();
            if (!hranice) {
                
                BTNI_Rusko_Hranice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ruska_Lactive.png")));
            }else{
                BTNI_Rusko_Hranice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ruska_active.png")));
            }
        }else{
            rusko = false;
            this.opatrenia.getRuskaOdstup().vypnutie();
            if (!hranice) {
                BTNI_Rusko_Hranice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ruska_inactive.png")));
            }else{
                BTNI_Rusko_Hranice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ruska_Ractive.png")));
            }
            
        }
    }//GEN-LAST:event_K_RuskoMouseClicked

    private void K_HraniceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_HraniceMouseClicked
        if (!hranice) {
            if (!zapnutieOpatreni) {
                zapnutieOpatreni = true;
                this.BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zapinac.png")));;
            }
            hranice = true;
            this.Mapa_hranice.setVisible(hranice);
            this.opatrenia.getHranice().zapnutie();
            if (!rusko) {
                BTNI_Rusko_Hranice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ruska_Ractive.png")));
            }else{
                BTNI_Rusko_Hranice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ruska_active.png")));
            }
        }else{
            hranice = false;
            this.Mapa_hranice.setVisible(hranice);
            this.opatrenia.getHranice().vypnutie();
            if (!rusko) {
                BTNI_Rusko_Hranice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ruska_inactive.png")));
            }else{
                BTNI_Rusko_Hranice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ruska_Lactive.png")));
            }
            
        }
    }//GEN-LAST:event_K_HraniceMouseClicked

    private void K_ZakazVychMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_ZakazVychMouseClicked
        if (!zakazVychadzania) {
            if (!zapnutieOpatreni) {
                zapnutieOpatreni = true;
                this.BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zapinac.png")));;
            }
            zakazVychadzania = true;
            this.opatrenia.getZakazVychadzania().zapnutie();
            zavriVsetko();
            BTNI_ZakazVych.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/vychadzanie_active.png")));
        }else{
            zakazVychadzania = false;
            this.opatrenia.getZakazVychadzania().vypnutie();
            otvorVsetko();
            BTNI_ZakazVych.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/vychadzanie_inactive.png")));
        }
    }//GEN-LAST:event_K_ZakazVychMouseClicked

    private void K_CeloTestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_CeloTestMouseClicked
        if (!celoplosneTestovanie) {
            if (!zapnutieOpatreni) {
                zapnutieOpatreni = true;
                this.BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zapinac.png")));;
            }
            celoplosneTestovanie = true;
            this.opatrenia.getCeloplosneTestovanie().zapnutie();
            BTNI_CeloTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/testovanie_active.png")));
        }else{
            celoplosneTestovanie = false;
            this.opatrenia.getCeloplosneTestovanie().vypnutie();
            BTNI_CeloTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/testovanie_inactive.png")));
        }
    }//GEN-LAST:event_K_CeloTestMouseClicked

    private void K_A_NeobmedzeneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_A_NeobmedzeneMouseClicked
        akcie = 0;
        BTNI_Akcie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/kapacitaNeobmedzena.png")));
        this.opatrenia.getAkcie().setPovolenyPocetLudi(akcie);
        this.opatrenia.getAkcie().vypnutie();
    }//GEN-LAST:event_K_A_NeobmedzeneMouseClicked

    private void K_A_Max10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_A_Max10MouseClicked
        akcie = 10;
        if (!zapnutieOpatreni) {
                zapnutieOpatreni = true;
                this.BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zapinac.png")));;
            }
        BTNI_Akcie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/kapacita10.png")));
        this.opatrenia.getAkcie().setPovolenyPocetLudi(akcie);
        this.opatrenia.getAkcie().zapnutie();
    }//GEN-LAST:event_K_A_Max10MouseClicked

    private void K_A_Max100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_A_Max100MouseClicked
        akcie = 100;
        if (!zapnutieOpatreni) {
                zapnutieOpatreni = true;
                this.BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zapinac.png")));;
            }
        BTNI_Akcie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/kapacita100.png")));
        this.opatrenia.getAkcie().setPovolenyPocetLudi(akcie);
        this.opatrenia.getAkcie().zapnutie();
    }//GEN-LAST:event_K_A_Max100MouseClicked

    private void K_A_Max1000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_A_Max1000MouseClicked
        akcie = 1000;
        if (!zapnutieOpatreni) {
                zapnutieOpatreni = true;
                this.BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zapinac.png")));;
            }
        BTNI_Akcie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/kapacita1000.png")));
        this.opatrenia.getAkcie().setPovolenyPocetLudi(akcie);
        this.opatrenia.getAkcie().zapnutie();
    }//GEN-LAST:event_K_A_Max1000MouseClicked

    private void K_ZavKrajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_ZavKrajeMouseClicked
        if (!uzavretieKrajov) {
            if (!zapnutieOpatreni) {
                zapnutieOpatreni = true;
                this.BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zapinac.png")));;
            }
            uzavretieKrajov = true;
            this.Mapa_hraniceOkresy.setVisible(uzavretieKrajov);
            this.opatrenia.getZatvorenieKrajov().zapnutie();
            BTNI_ZavKraje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/kraje_active.png")));
        }else{
            uzavretieKrajov = false;
            this.Mapa_hraniceOkresy.setVisible(uzavretieKrajov);
            this.opatrenia.getZatvorenieKrajov().vypnutie();
            BTNI_ZavKraje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/kraje_inactive.png")));
        }
    }//GEN-LAST:event_K_ZavKrajeMouseClicked

    private void K_S_ZavreteRizikoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_S_ZavreteRizikoveMouseClicked
        sluzby = ESluzby.ZAVRETE_RIZIKOVE;
        if (!zapnutieOpatreni) {
                zapnutieOpatreni = true;
                this.BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zapinac.png")));;
            }
        BTNI_Sluzby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/rizikove.png")));
        this.opatrenia.getSluzby().zapnutie();
        //treba vyriešiť ako sa to bude správať (kolko ludi sa bude stretávať v takopmto prípade)
    }//GEN-LAST:event_K_S_ZavreteRizikoveMouseClicked

    private void K_S_ZakladneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_S_ZakladneMouseClicked
        sluzby = ESluzby.OTVORENE_LEN_ZAKLADNE;
        if (!zapnutieOpatreni) {
                zapnutieOpatreni = true;
                this.BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zapinac.png")));;
        }
        BTNI_Sluzby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zakladne.png")));
        this.opatrenia.getSluzby().zapnutie();
        //treba vyriešiť ako sa to bude správať (kolko ludi sa bude stretávať v takopmto prípade)
    }//GEN-LAST:event_K_S_ZakladneMouseClicked

    private void K_SK_ZavreteVSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_SK_ZavreteVSMouseClicked
       if (!zapnutieOpatreni) {
                zapnutieOpatreni = true;
                this.BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zapinac.png")));;
            }
        skoly = ESkoly.ZAVRETE_VYSOKE_SKOLY;
        BTNI_Skoly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/skolyVysoke.png")));
    }//GEN-LAST:event_K_SK_ZavreteVSMouseClicked

    private void K_SK_ZavreteVsetkyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_SK_ZavreteVsetkyMouseClicked
        if(skoly == ESkoly.OTVORENE || skoly == ESkoly.ZAVRETE_VYSOKE_SKOLY)
        {
            skoly = ESkoly.VSETKY_ZAVRETE;
            if (!zapnutieOpatreni) {
                zapnutieOpatreni = true;
                this.BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zapinac.png")));;
            }
            BTNI_Skoly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/skolyZavrete.png")));
            
        }else
        {
            skoly = ESkoly.OTVORENE;
            BTNI_Skoly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/skolyNeobmedzene.png")));
        }
    }//GEN-LAST:event_K_SK_ZavreteVsetkyMouseClicked

    private void BTNI_OtvorVsetkoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNI_OtvorVsetkoMouseClicked
        if (zapnutieOpatreni) {
            otvorVsetko();  
            BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/vypnute.png")));
            BTNI_CeloTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/testovanie_inactive.png")));
            celoplosneTestovanie = false;
            zapnutieOpatreni = false;
            
        }else{
            zavriVsetko();
            celoplosneTestovanie = true;
            zapnutieOpatreni = true;
            BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zapinac.png")));
        }
              
    }//GEN-LAST:event_BTNI_OtvorVsetkoMouseClicked

    private void BTNI_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNI_MenuMouseClicked
        //treba volako vymazať metodu :D :D 
    }//GEN-LAST:event_BTNI_MenuMouseClicked

    private void M_Soc_sieteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_Soc_sieteMouseClicked
        this.zmenViditelnostPrehladu(false);
        this.menu = ENadstavenieMenu.SOCIALNE_SIETE;
        this.BTNI_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/menu_soc_siete.png")));
    }//GEN-LAST:event_M_Soc_sieteMouseClicked

    private void M_PrehladMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_PrehladMouseClicked
        this.zmenViditelnostPrehladu(true);
        this.Notifikacie.setVisible(false);
        this.skrytiePrehladu = false;
        this.menu = ENadstavenieMenu.PREHLAD;
        this.BTNI_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/menu_Prehlad.png")));
        //this.vykresliGraf();        
    }//GEN-LAST:event_M_PrehladMouseClicked

    private void M_SpravyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_SpravyMouseClicked
        this.zmenViditelnostPrehladu(false);
        this.Notifikacie.setVisible(false);
        this.skrytiePrehladu = true;
        this.menu = ENadstavenieMenu.SPRAVY;
        this.BTNI_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/menu_spravy.png")));
    }//GEN-LAST:event_M_SpravyMouseClicked

    private void M_NotifikacieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_NotifikacieMouseClicked
        this.zmenViditelnostPrehladu(false);
        this.Notifikacie.setVisible(true);
        this.skrytiePrehladu = true;
        this.menu = ENadstavenieMenu.NOTIFIKACIE;
        this.BTNI_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/menu_Notifikacie.png")));
    }//GEN-LAST:event_M_NotifikacieMouseClicked

    private void startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseClicked
        this.pozadieUvod.setVisible(false);  
        this.Notifikacie.setVisible(false);
        Vlakno_ZacatiaHry vlakno = new Vlakno_ZacatiaHry(this.hra);
        vlakno.start();
    }//GEN-LAST:event_startMouseClicked

    private void zavriVsetko(){
        rusko = true;
        hranice = true;
        zakazVychadzania = true;
        uzavretieKrajov = true;
        akcie = 10;
        sluzby = ESluzby.OTVORENE_LEN_ZAKLADNE;
        skoly = ESkoly.VSETKY_ZAVRETE;
        
        BTNI_Rusko_Hranice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ruska_active.png")));
        BTNI_ZakazVych.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/vychadzanie_active.png")));
        BTNI_ZavKraje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/kraje_active.png")));
        BTNI_Akcie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/kapacita10.png")));
        BTNI_Sluzby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zakladne.png")));
        BTNI_Skoly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/skolyZavrete.png")));
        
        this.Mapa_hranice.setVisible(hranice);
        this.Mapa_hraniceOkresy.setVisible(uzavretieKrajov);
    }
    
    private void otvorVsetko(){
        rusko = false;
        hranice = false;
        zakazVychadzania = false;
        celoplosneTestovanie = false;
        uzavretieKrajov = false;
        akcie = 0;
        sluzby = ESluzby.OTVORENE;
        skoly = ESkoly.OTVORENE;
        
        BTNI_Rusko_Hranice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ruska_inactive.png")));
        BTNI_ZakazVych.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/vychadzanie_inactive.png")));
        BTNI_ZavKraje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/kraje_inactive.png")));
        BTNI_CeloTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/testovanie_inactive.png")));
        BTNI_Akcie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/kapacitaNeobmedzena.png")));
        BTNI_Sluzby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/otvoreneSluzby.png")));
        BTNI_Skoly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/skolyNeobmedzene.png")));
        
        this.Mapa_hranice.setVisible(hranice);
        this.Mapa_hraniceOkresy.setVisible(uzavretieKrajov);
    }
    
    public void napisVsetciNakazeni(int pocet)
    {
        this.P_vsetciNakazeni.setText(""+pocet);
    }
    
    public void napisNakazenychNaDen(int pocet)
    {
        this.P_nakazeniZaDen.setText(""+pocet);
    }
    
    public void napisPocetUmrti(int pocet)
    {
        this.P_pocetUmrti.setText(""+pocet);
    }
    
    public void napisZaockovanych(int pocet)
    {
        this.P_pocetZaockovanych.setText(""+pocet);
    }
    
    public void napisStavNemocnic(int pocet)
    {
        this.P_nstavNemocnice.setText(""+pocet+" %");
    }
    
    public void napisSpolocenskuStabilitu(int pocet)
    {
        this.P_spoocenskaStabilita.setText(""+pocet);
    }
    
    public void zmenDatum(String datum)
    {
        this.Datum.setText(datum);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BTNI_Akcie;
    private javax.swing.JLabel BTNI_CeloTest;
    private javax.swing.JLabel BTNI_Menu;
    private javax.swing.JLabel BTNI_OtvorVsetko;
    private javax.swing.JLabel BTNI_Rusko_Hranice;
    private javax.swing.JLabel BTNI_Skoly;
    private javax.swing.JLabel BTNI_Sluzby;
    private javax.swing.JLabel BTNI_ZakazVych;
    private javax.swing.JLabel BTNI_ZavKraje;
    private javax.swing.JLabel Datum;
    private javax.swing.JLabel Hlasky;
    private javax.swing.JLabel KR_BanskoBystricky;
    private javax.swing.JLabel KR_Bratislavsky;
    private javax.swing.JLabel KR_Kosicky;
    private javax.swing.JLabel KR_Nitriansky;
    private javax.swing.JLabel KR_Presovsky;
    private javax.swing.JLabel KR_Trenciansky;
    private javax.swing.JLabel KR_Trnavsky;
    private javax.swing.JLabel KR_Zilinsky;
    private javax.swing.JLabel K_A_Max10;
    private javax.swing.JLabel K_A_Max100;
    private javax.swing.JLabel K_A_Max1000;
    private javax.swing.JLabel K_A_Neobmedzene;
    private javax.swing.JLabel K_CeloTest;
    private javax.swing.JLabel K_Hranice;
    private javax.swing.JLabel K_Rusko;
    private javax.swing.JLabel K_SK_ZavreteVS;
    private javax.swing.JLabel K_SK_ZavreteVsetky;
    private javax.swing.JLabel K_S_Zakladne;
    private javax.swing.JLabel K_S_ZavreteRizikove;
    private javax.swing.JLabel K_ZakazVych;
    private javax.swing.JLabel K_ZavKraje;
    private javax.swing.JList<String> List;
    private javax.swing.JLabel M_Notifikacie;
    private javax.swing.JLabel M_Prehlad;
    private javax.swing.JLabel M_Soc_siete;
    private javax.swing.JLabel M_Spravy;
    private javax.swing.JLabel Mapa_banskobystricky;
    private javax.swing.JLabel Mapa_bratislavsky;
    private javax.swing.JLabel Mapa_hranice;
    private javax.swing.JLabel Mapa_hraniceOkresy;
    private javax.swing.JLabel Mapa_kosicky;
    private javax.swing.JLabel Mapa_nitriansky;
    private javax.swing.JLabel Mapa_pozadie;
    private javax.swing.JLabel Mapa_presovsky;
    private javax.swing.JLabel Mapa_trenciansky;
    private javax.swing.JLabel Mapa_trnavsky;
    private javax.swing.JLabel Mapa_zilinsky;
    private javax.swing.JScrollPane Notifikacie;
    private javax.swing.JLabel Oznam;
    private javax.swing.JLabel P_nakazeniZaDen;
    private javax.swing.JLabel P_nstavNemocnice;
    private javax.swing.JLabel P_pocetUmrti;
    private javax.swing.JLabel P_pocetZaockovanych;
    private javax.swing.JLabel P_spoocenskaStabilita;
    private javax.swing.JLabel P_vsetciNakazeni;
    private javax.swing.JLabel T_Opatrenia;
    private javax.swing.JPanel hlavnyPanel;
    private javax.swing.JPanel panel_Graf;
    private javax.swing.JPanel panel_Graf2_kruhovy;
    private javax.swing.JPanel panel_Graf3_vyfarbeny;
    private javax.swing.JLabel pozadie;
    private javax.swing.JLabel pozadieUvod;
    private javax.swing.JLabel start;
    private javax.swing.JLabel tien;
    // End of variables declaration//GEN-END:variables

    public Hra getHra() {
        return hra;
    }
    
    public void upravBratislavsky(int pocet,EStavKraja stav){
        this.KR_Bratislavsky.setText(""+pocet);
        switch(stav){
            case ZELENY:
                this.Mapa_bratislavsky.setVisible(false);
                break;
            case ZLTY:
                this.Mapa_bratislavsky.setVisible(true);
                this.Mapa_bratislavsky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Ba_1.png")));
                break;
            case ORANZOVY:
                this.Mapa_bratislavsky.setVisible(true);
                this.Mapa_bratislavsky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Ba_2.png")));
                break;
            case CERVENY:
                this.Mapa_bratislavsky.setVisible(true);
                this.Mapa_bratislavsky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Ba_3.png")));
                break;
        }
    }
    
    public void upravTrnavsky(int pocet,EStavKraja stav){
        this.KR_Trnavsky.setText(""+pocet);
        switch(stav){
            case ZELENY:
                this.Mapa_trnavsky.setVisible(false);
                break;
            case ZLTY:
                this.Mapa_trnavsky.setVisible(true);
                this.Mapa_trnavsky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Tn_1.png")));
                break;
            case ORANZOVY:
                this.Mapa_trnavsky.setVisible(true);
                this.Mapa_trnavsky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Tn_2.png")));
                break;
            case CERVENY:
                this.Mapa_trnavsky.setVisible(true);
                this.Mapa_trnavsky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Tn_3.png")));
                break;
        }
    }
    
    public void upravTrenciansky(int pocet,EStavKraja stav){
        this.KR_Trenciansky.setText(""+pocet);
        switch(stav){
            case ZELENY:
                this.Mapa_trenciansky.setVisible(false);
                break;
            case ZLTY:
                this.Mapa_trenciansky.setVisible(true);
                this.Mapa_trenciansky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Tr_1.png")));
                break;
            case ORANZOVY:
                this.Mapa_trenciansky.setVisible(true);
                this.Mapa_trenciansky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Tr_2.png")));
                break;
            case CERVENY:
                this.Mapa_trenciansky.setVisible(true);
                this.Mapa_trenciansky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Tr_3.png")));
                break;
        }
    }
    
    public void upravNitriansky(int pocet,EStavKraja stav){
        this.KR_Nitriansky.setText(""+pocet);
        switch(stav){
            case ZELENY:
                this.Mapa_nitriansky.setVisible(false);
                break;
            case ZLTY:
                this.Mapa_nitriansky.setVisible(true);
                this.Mapa_nitriansky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Nt_1.png")));
                break;
            case ORANZOVY:
                this.Mapa_nitriansky.setVisible(true);
                this.Mapa_nitriansky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Nt_2.png")));
                break;
            case CERVENY:
                this.Mapa_nitriansky.setVisible(true);
                this.Mapa_nitriansky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Nt_3.png")));
                break;
        }
    }
    
    public void upravZilinsky(int pocet,EStavKraja stav){
        this.KR_Zilinsky.setText(""+pocet);
        switch(stav){
            case ZELENY:
                this.Mapa_zilinsky.setVisible(false);
                break;
            case ZLTY:
                this.Mapa_zilinsky.setVisible(true);
                this.Mapa_zilinsky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Za_1.png")));
                break;
            case ORANZOVY:
                this.Mapa_zilinsky.setVisible(true);
                this.Mapa_zilinsky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Za_2.png")));
                break;
            case CERVENY:
                this.Mapa_zilinsky.setVisible(true);
                this.Mapa_zilinsky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Za_3.png")));
                break;
        }
    }
    
    public void upravBanskobystricky(int pocet,EStavKraja stav){
        this.KR_BanskoBystricky.setText(""+pocet);
        switch(stav){
            case ZELENY:
                this.Mapa_banskobystricky.setVisible(false);
                break;
            case ZLTY:
                this.Mapa_banskobystricky.setVisible(true);
                this.Mapa_banskobystricky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/BB_1.png")));
                break;
            case ORANZOVY:
                this.Mapa_banskobystricky.setVisible(true);
                this.Mapa_banskobystricky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/BB_2.png")));
                break;
            case CERVENY:
                this.Mapa_banskobystricky.setVisible(true);
                this.Mapa_banskobystricky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/BB_3.png")));
                break;
        }
    }
    
    public void upravPresovsky(int pocet,EStavKraja stav){
        this.KR_Presovsky.setText(""+pocet);
        switch(stav){
            case ZELENY:
                this.Mapa_presovsky.setVisible(false);
                break;
            case ZLTY:
                this.Mapa_presovsky.setVisible(true);
                this.Mapa_presovsky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Pr_1.png")));
                break;
            case ORANZOVY:
                this.Mapa_presovsky.setVisible(true);
                this.Mapa_presovsky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Pr_2.png")));
                break;
            case CERVENY:
                this.Mapa_presovsky.setVisible(true);
                this.Mapa_presovsky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Pr_3.png")));
                break;
        }
    }
    
    public void upravKosickyky(int pocet,EStavKraja stav){
        this.KR_Kosicky.setText(""+pocet);
        switch(stav){
            case ZELENY:
                this.Mapa_kosicky.setVisible(false);
                break;
            case ZLTY:
                this.Mapa_kosicky.setVisible(true);
                this.Mapa_kosicky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Ke_1.png")));
                break;
            case ORANZOVY:
                this.Mapa_kosicky.setVisible(true);
                this.Mapa_kosicky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Ke_2.png")));
                break;
            case CERVENY:
                this.Mapa_kosicky.setVisible(true);
                this.Mapa_kosicky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/Ke_3.png")));
                break;
        }
    }
    
    public void napisHlasku(String menoHlasky){
        this.Hlasky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/"+menoHlasky+".png")));
    }
    
    public void napisOznam(String oznam){
        this.Oznam.setText(oznam);
    }
    
    public void vykresliGraf(int hodnotaNakazenych){
        //vypisanie grafu
        
        hototyNakazenyhc.add(hodnotaNakazenych);
        XYSeries oSeries = new XYSeries("");
        for (int i = 0; i < hototyNakazenyhc.size(); i++) {
            oSeries.add(i+1,hototyNakazenyhc.get(i));
        }
        
        XYSeriesCollection oDatabase = new XYSeriesCollection();
        oDatabase.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("", "", "", oDatabase,PlotOrientation.VERTICAL,false, false, false);
        oChart.setBackgroundPaint(null);
        ChartPanel oPanel = new ChartPanel(oChart);
        
        
        XYPlot plot = oChart.getXYPlot();
        
        var renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke( 2f ));
        
        YIntervalRenderer r = new YIntervalRenderer();
        r.setSeriesShape(5, new Rectangle());

        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);
        plot.setOutlinePaint(null);//vypnutie bordera
        
        
        //plot.setRenderer(renderer);
        
        this.panel_Graf.setLayout(new java.awt.BorderLayout());
        this.panel_Graf.add(oPanel);
        this.panel_Graf.validate();
    }
    
    public void vykresliGrafKruhovy(int bratislava, int trnava, int trencin, int nitra, int zilina, int bystrica, int presov, int kosice){
        var dataset = new DefaultPieDataset();
        
        dataset.setValue("BA", bratislava);
        dataset.setValue("TN", trnava);
        dataset.setValue("TR", trencin);
        dataset.setValue("NT", nitra);
        dataset.setValue("ZA", zilina);
        dataset.setValue("BB", bystrica);
        dataset.setValue("PR", presov);
        dataset.setValue("KE", kosice);
        
        
        JFreeChart chart = ChartFactory.createPieChart("",
                dataset, true, false, false);

        chart.getPlot().setOutlineVisible(false);
        //chart.getLegend().setVisible(false);
        
        chart.setBorderVisible(false);
        chart.getPlot().setBackgroundPaint(null);
        ChartPanel oPanel = new ChartPanel(chart);
        
        
        this.panel_Graf2_kruhovy.setLayout(new java.awt.BorderLayout());
        this.panel_Graf2_kruhovy.add(oPanel);
        this.panel_Graf2_kruhovy.validate();
    }
    
    public void vykresliGrafImunni(int pocetZaockovanych, int pocetImunnych){
        //vypisanie grafu
        
        this.hodnotyZaockovanych.add(pocetZaockovanych);
        this.hodnotyImunnych.add(pocetImunnych);
        
        XYSeries oSeries = new XYSeries("imunni");
        for (int i = 0; i < hodnotyZaockovanych.size(); i++) {
            oSeries.add(i+1,hodnotyZaockovanych.get(i));
        }
        
        XYSeries oSeries2 = new XYSeries("úmrtia");
        for (int i = 0; i < hodnotyImunnych.size(); i++) {
            oSeries2.add(i+1,hodnotyImunnych.get(i));
        }
        
        XYSeriesCollection oDatabase = new XYSeriesCollection();
        oDatabase.addSeries(oSeries);
        oDatabase.addSeries(oSeries2);
        
        
        JFreeChart oChart = ChartFactory.createXYLineChart("", "", "", oDatabase,PlotOrientation.VERTICAL,true, true, false);
        //oChart.setBackgroundPaint(null);
        ChartPanel oPanel = new ChartPanel(oChart);
        
        
        XYPlot plot = oChart.getXYPlot();
        
        var renderer = new XYLineAndShapeRenderer();

        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));
        renderer.setSeriesPaint(1, Color.BLUE);
        renderer.setSeriesStroke(1, new BasicStroke(2.0f));

        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.white);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);


        this.panel_Graf3_vyfarbeny.setLayout(new java.awt.BorderLayout());
        this.panel_Graf3_vyfarbeny.add(oPanel);
        this.panel_Graf3_vyfarbeny.validate();
    }
    
    private void zmenViditelnostPrehladu(boolean viditelnost){
        this.panel_Graf.setVisible(viditelnost);
        this.panel_Graf2_kruhovy.setVisible(viditelnost);
        this.panel_Graf3_vyfarbeny.setVisible(viditelnost);
    }
    
    public void pridajNotifikaciu(String s){
        zoznamPoloziek.addElement(/*vsetkyHlasenia.get(i)*/s);
        List.setModel(zoznamPoloziek);
    }
    
}

enum ESluzby {
    OTVORENE,
    ZAVRETE_RIZIKOVE,
    OTVORENE_LEN_ZAKLADNE;
}

enum ESkoly {
    OTVORENE,
    ZAVRETE_VYSOKE_SKOLY,
    VSETKY_ZAVRETE
}

enum ENadstavenieMenu{
    PREHLAD,
    SOCIALNE_SIETE,
    SPRAVY,
    NOTIFIKACIE
}
