package Hra_GUI;

import Hra_Opatrenia.Opatrenia;
import Hra_zakladneTriedy.EStavKraja;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JScrollBar;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
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
    
    private ArrayList<Integer> BAnakazeni = new ArrayList<>();
    private ArrayList<Integer> BAumrtia = new ArrayList<>();
    private ArrayList<Integer> BAzaockovani = new ArrayList<>();
    
    private ArrayList<Integer> TNnakazeni = new ArrayList<>();
    private ArrayList<Integer> TNumrtia = new ArrayList<>();
    private ArrayList<Integer> TNzaockovani = new ArrayList<>();
    
    private ArrayList<Integer> TRnakazeni = new ArrayList<>();
    private ArrayList<Integer> TRumrtia = new ArrayList<>();
    private ArrayList<Integer> TRzaockovani = new ArrayList<>();
    
    private ArrayList<Integer> NTnakazeni = new ArrayList<>();
    private ArrayList<Integer> NTumrtia = new ArrayList<>();
    private ArrayList<Integer> NTzaockovani = new ArrayList<>();
    
    private ArrayList<Integer> ZAnakazeni = new ArrayList<>();
    private ArrayList<Integer> ZAumrtia = new ArrayList<>();
    private ArrayList<Integer> ZAzaockovani = new ArrayList<>();
    
    private ArrayList<Integer> BBnakazeni = new ArrayList<>();
    private ArrayList<Integer> BBumrtia = new ArrayList<>();
    private ArrayList<Integer> BBzaockovani = new ArrayList<>();
    
    private ArrayList<Integer> PRnakazeni = new ArrayList<>();
    private ArrayList<Integer> PRumrtia = new ArrayList<>();
    private ArrayList<Integer> PRzaockovani = new ArrayList<>();
    
    private ArrayList<Integer> KEnakazeni = new ArrayList<>();
    private ArrayList<Integer> KEumrtia = new ArrayList<>();
    private ArrayList<Integer> KEzaockovani = new ArrayList<>();
    
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
        M_InfoOkrajoch = new javax.swing.JLabel();
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
        Kraje_info = new javax.swing.JPanel();
        TN = new javax.swing.JLabel();
        BA = new javax.swing.JLabel();
        KE = new javax.swing.JLabel();
        TR = new javax.swing.JLabel();
        NT = new javax.swing.JLabel();
        ZA = new javax.swing.JLabel();
        BB = new javax.swing.JLabel();
        PR = new javax.swing.JLabel();
        info_bratislava = new javax.swing.JPanel();
        BA_g_pocetUmrti = new javax.swing.JPanel();
        BA_g_nakazeni = new javax.swing.JPanel();
        BA_g_zaockovani = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BA_pocetZaockovanych = new javax.swing.JLabel();
        BA_pocetUmrti = new javax.swing.JLabel();
        BA_pocetNakazenych = new javax.swing.JLabel();
        info_kosice = new javax.swing.JPanel();
        KE_g_pocetUmrti = new javax.swing.JPanel();
        KE_g_nakazeni = new javax.swing.JPanel();
        KE_g_zaockovani = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        KE_pocetZaockovanych = new javax.swing.JLabel();
        KE_pocetUmrti = new javax.swing.JLabel();
        KE_pocetNakazenych = new javax.swing.JLabel();
        info_presov = new javax.swing.JPanel();
        PR_g_pocetUmrti = new javax.swing.JPanel();
        PR_g_nakazeni = new javax.swing.JPanel();
        PR_g_zaockovani = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        PR_pocetZaockovanych = new javax.swing.JLabel();
        PR_pocetUmrti = new javax.swing.JLabel();
        PR_pocetNakazenych = new javax.swing.JLabel();
        info_bystrica = new javax.swing.JPanel();
        BB_g_pocetUmrti = new javax.swing.JPanel();
        BB_g_nakazeni = new javax.swing.JPanel();
        BB_g_zaockovani = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        BB_pocetZaockovanych = new javax.swing.JLabel();
        BB_pocetUmrti = new javax.swing.JLabel();
        BB_pocetNakazenych = new javax.swing.JLabel();
        info_zilina = new javax.swing.JPanel();
        ZA_g_pocetUmrti = new javax.swing.JPanel();
        ZA_g_nakazeni = new javax.swing.JPanel();
        ZA_g_zaockovani = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        ZA_pocetZaockovanych = new javax.swing.JLabel();
        ZA_pocetUmrti = new javax.swing.JLabel();
        ZA_pocetNakazenych = new javax.swing.JLabel();
        info_nitra = new javax.swing.JPanel();
        NT_g_pocetUmrti = new javax.swing.JPanel();
        NT_g_nakazeni = new javax.swing.JPanel();
        NT_g_zaockovani = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        NT_pocetZaockovanych = new javax.swing.JLabel();
        NT_pocetUmrti = new javax.swing.JLabel();
        NT_pocetNakazenych = new javax.swing.JLabel();
        info_trencin = new javax.swing.JPanel();
        TR_g_pocetUmrti = new javax.swing.JPanel();
        TR_g_nakazeni = new javax.swing.JPanel();
        TR_g_zaockovani = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TR_pocetZaockovanych = new javax.swing.JLabel();
        TR_pocetUmrti = new javax.swing.JLabel();
        TR_pocetNakazenych = new javax.swing.JLabel();
        info_trnava = new javax.swing.JPanel();
        TN_g_pocetUmrti = new javax.swing.JPanel();
        TN_g_nakazeni = new javax.swing.JPanel();
        TN_g_zaockovani = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TN_pocetZaockovanych = new javax.swing.JLabel();
        TN_pocetUmrti = new javax.swing.JLabel();
        TN_pocetNakazenych1 = new javax.swing.JLabel();
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
        K_SK_ZavreteVS.setBounds(1120, 120, 30, 30);

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

        M_InfoOkrajoch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_InfoOkrajochMouseClicked(evt);
            }
        });
        hlavnyPanel.add(M_InfoOkrajoch);
        M_InfoOkrajoch.setBounds(70, 130, 200, 40);

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
        M_Prehlad.setBounds(70, 90, 200, 30);

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

        Kraje_info.setBackground(new java.awt.Color(51, 51, 51));
        Kraje_info.setLayout(null);

        TN.setBackground(new java.awt.Color(255, 255, 255));
        TN.setForeground(new java.awt.Color(255, 255, 255));
        TN.setText(" TN");
        TN.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        TN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TNMouseClicked(evt);
            }
        });
        Kraje_info.add(TN);
        TN.setBounds(500, 100, 30, 40);

        BA.setBackground(new java.awt.Color(255, 255, 255));
        BA.setForeground(new java.awt.Color(255, 255, 255));
        BA.setText(" BA");
        BA.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BAMouseClicked(evt);
            }
        });
        Kraje_info.add(BA);
        BA.setBounds(500, 60, 30, 40);

        KE.setBackground(new java.awt.Color(255, 255, 255));
        KE.setForeground(new java.awt.Color(255, 255, 255));
        KE.setText(" KE");
        KE.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        KE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KEMouseClicked(evt);
            }
        });
        Kraje_info.add(KE);
        KE.setBounds(500, 340, 30, 40);

        TR.setBackground(new java.awt.Color(255, 255, 255));
        TR.setForeground(new java.awt.Color(255, 255, 255));
        TR.setText(" TR");
        TR.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        TR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TRMouseClicked(evt);
            }
        });
        Kraje_info.add(TR);
        TR.setBounds(500, 140, 30, 40);

        NT.setBackground(new java.awt.Color(255, 255, 255));
        NT.setForeground(new java.awt.Color(255, 255, 255));
        NT.setText(" NT");
        NT.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        NT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NTMouseClicked(evt);
            }
        });
        Kraje_info.add(NT);
        NT.setBounds(500, 180, 30, 40);

        ZA.setBackground(new java.awt.Color(255, 255, 255));
        ZA.setForeground(new java.awt.Color(255, 255, 255));
        ZA.setText(" ZA");
        ZA.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ZA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ZAMouseClicked(evt);
            }
        });
        Kraje_info.add(ZA);
        ZA.setBounds(500, 220, 30, 40);

        BB.setBackground(new java.awt.Color(255, 255, 255));
        BB.setForeground(new java.awt.Color(255, 255, 255));
        BB.setText(" BB");
        BB.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BBMouseClicked(evt);
            }
        });
        Kraje_info.add(BB);
        BB.setBounds(500, 260, 30, 40);

        PR.setBackground(new java.awt.Color(255, 255, 255));
        PR.setForeground(new java.awt.Color(255, 255, 255));
        PR.setText(" PR");
        PR.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        PR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PRMouseClicked(evt);
            }
        });
        Kraje_info.add(PR);
        PR.setBounds(500, 300, 30, 40);

        info_bratislava.setBackground(new java.awt.Color(102, 102, 102));
        info_bratislava.setLayout(null);

        javax.swing.GroupLayout BA_g_pocetUmrtiLayout = new javax.swing.GroupLayout(BA_g_pocetUmrti);
        BA_g_pocetUmrti.setLayout(BA_g_pocetUmrtiLayout);
        BA_g_pocetUmrtiLayout.setHorizontalGroup(
            BA_g_pocetUmrtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        BA_g_pocetUmrtiLayout.setVerticalGroup(
            BA_g_pocetUmrtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_bratislava.add(BA_g_pocetUmrti);
        BA_g_pocetUmrti.setBounds(250, 30, 250, 190);

        javax.swing.GroupLayout BA_g_nakazeniLayout = new javax.swing.GroupLayout(BA_g_nakazeni);
        BA_g_nakazeni.setLayout(BA_g_nakazeniLayout);
        BA_g_nakazeniLayout.setHorizontalGroup(
            BA_g_nakazeniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        BA_g_nakazeniLayout.setVerticalGroup(
            BA_g_nakazeniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_bratislava.add(BA_g_nakazeni);
        BA_g_nakazeni.setBounds(0, 30, 250, 190);

        javax.swing.GroupLayout BA_g_zaockovaniLayout = new javax.swing.GroupLayout(BA_g_zaockovani);
        BA_g_zaockovani.setLayout(BA_g_zaockovaniLayout);
        BA_g_zaockovaniLayout.setHorizontalGroup(
            BA_g_zaockovaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        BA_g_zaockovaniLayout.setVerticalGroup(
            BA_g_zaockovaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_bratislava.add(BA_g_zaockovani);
        BA_g_zaockovani.setBounds(0, 250, 250, 190);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vývoj nákazy");
        info_bratislava.add(jLabel1);
        jLabel1.setBounds(10, 10, 230, 19);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Počet úmrtí");
        info_bratislava.add(jLabel2);
        jLabel2.setBounds(260, 10, 210, 19);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Zaočkovaní");
        info_bratislava.add(jLabel3);
        jLabel3.setBounds(10, 230, 220, 19);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Batislavský kraj");
        info_bratislava.add(jLabel4);
        jLabel4.setBounds(260, 250, 150, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ikony.png"))); // NOI18N
        info_bratislava.add(jLabel5);
        jLabel5.setBounds(270, 260, 52, 160);

        BA_pocetZaockovanych.setBackground(new java.awt.Color(51, 51, 51));
        BA_pocetZaockovanych.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BA_pocetZaockovanych.setForeground(new java.awt.Color(51, 51, 51));
        BA_pocetZaockovanych.setText("0");
        info_bratislava.add(BA_pocetZaockovanych);
        BA_pocetZaockovanych.setBounds(310, 370, 120, 24);

        BA_pocetUmrti.setBackground(new java.awt.Color(51, 51, 51));
        BA_pocetUmrti.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BA_pocetUmrti.setForeground(new java.awt.Color(51, 51, 51));
        BA_pocetUmrti.setText("0");
        info_bratislava.add(BA_pocetUmrti);
        BA_pocetUmrti.setBounds(310, 330, 120, 24);

        BA_pocetNakazenych.setBackground(new java.awt.Color(51, 51, 51));
        BA_pocetNakazenych.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BA_pocetNakazenych.setForeground(new java.awt.Color(51, 51, 51));
        BA_pocetNakazenych.setText("0");
        info_bratislava.add(BA_pocetNakazenych);
        BA_pocetNakazenych.setBounds(310, 290, 120, 24);

        Kraje_info.add(info_bratislava);
        info_bratislava.setBounds(0, 0, 500, 440);

        info_kosice.setBackground(new java.awt.Color(102, 102, 102));
        info_kosice.setLayout(null);

        javax.swing.GroupLayout KE_g_pocetUmrtiLayout = new javax.swing.GroupLayout(KE_g_pocetUmrti);
        KE_g_pocetUmrti.setLayout(KE_g_pocetUmrtiLayout);
        KE_g_pocetUmrtiLayout.setHorizontalGroup(
            KE_g_pocetUmrtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        KE_g_pocetUmrtiLayout.setVerticalGroup(
            KE_g_pocetUmrtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_kosice.add(KE_g_pocetUmrti);
        KE_g_pocetUmrti.setBounds(250, 30, 250, 190);

        javax.swing.GroupLayout KE_g_nakazeniLayout = new javax.swing.GroupLayout(KE_g_nakazeni);
        KE_g_nakazeni.setLayout(KE_g_nakazeniLayout);
        KE_g_nakazeniLayout.setHorizontalGroup(
            KE_g_nakazeniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        KE_g_nakazeniLayout.setVerticalGroup(
            KE_g_nakazeniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_kosice.add(KE_g_nakazeni);
        KE_g_nakazeni.setBounds(0, 30, 250, 190);

        javax.swing.GroupLayout KE_g_zaockovaniLayout = new javax.swing.GroupLayout(KE_g_zaockovani);
        KE_g_zaockovani.setLayout(KE_g_zaockovaniLayout);
        KE_g_zaockovaniLayout.setHorizontalGroup(
            KE_g_zaockovaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        KE_g_zaockovaniLayout.setVerticalGroup(
            KE_g_zaockovaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_kosice.add(KE_g_zaockovani);
        KE_g_zaockovani.setBounds(0, 250, 250, 190);

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Vývoj nákazy");
        info_kosice.add(jLabel36);
        jLabel36.setBounds(10, 10, 230, 19);

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Počet úmrtí");
        info_kosice.add(jLabel37);
        jLabel37.setBounds(260, 10, 210, 19);

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Zaočkovaní");
        info_kosice.add(jLabel38);
        jLabel38.setBounds(10, 230, 220, 19);

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 51));
        jLabel39.setText("Košický kraj");
        info_kosice.add(jLabel39);
        jLabel39.setBounds(260, 250, 220, 30);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ikony.png"))); // NOI18N
        info_kosice.add(jLabel40);
        jLabel40.setBounds(270, 260, 52, 160);

        KE_pocetZaockovanych.setBackground(new java.awt.Color(51, 51, 51));
        KE_pocetZaockovanych.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        KE_pocetZaockovanych.setForeground(new java.awt.Color(51, 51, 51));
        KE_pocetZaockovanych.setText("0");
        info_kosice.add(KE_pocetZaockovanych);
        KE_pocetZaockovanych.setBounds(310, 370, 120, 24);

        KE_pocetUmrti.setBackground(new java.awt.Color(51, 51, 51));
        KE_pocetUmrti.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        KE_pocetUmrti.setForeground(new java.awt.Color(51, 51, 51));
        KE_pocetUmrti.setText("0");
        info_kosice.add(KE_pocetUmrti);
        KE_pocetUmrti.setBounds(310, 330, 120, 24);

        KE_pocetNakazenych.setBackground(new java.awt.Color(51, 51, 51));
        KE_pocetNakazenych.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        KE_pocetNakazenych.setForeground(new java.awt.Color(51, 51, 51));
        KE_pocetNakazenych.setText("0");
        info_kosice.add(KE_pocetNakazenych);
        KE_pocetNakazenych.setBounds(310, 290, 120, 24);

        Kraje_info.add(info_kosice);
        info_kosice.setBounds(0, 0, 500, 440);

        info_presov.setBackground(new java.awt.Color(102, 102, 102));
        info_presov.setLayout(null);

        javax.swing.GroupLayout PR_g_pocetUmrtiLayout = new javax.swing.GroupLayout(PR_g_pocetUmrti);
        PR_g_pocetUmrti.setLayout(PR_g_pocetUmrtiLayout);
        PR_g_pocetUmrtiLayout.setHorizontalGroup(
            PR_g_pocetUmrtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        PR_g_pocetUmrtiLayout.setVerticalGroup(
            PR_g_pocetUmrtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_presov.add(PR_g_pocetUmrti);
        PR_g_pocetUmrti.setBounds(250, 30, 250, 190);

        javax.swing.GroupLayout PR_g_nakazeniLayout = new javax.swing.GroupLayout(PR_g_nakazeni);
        PR_g_nakazeni.setLayout(PR_g_nakazeniLayout);
        PR_g_nakazeniLayout.setHorizontalGroup(
            PR_g_nakazeniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        PR_g_nakazeniLayout.setVerticalGroup(
            PR_g_nakazeniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_presov.add(PR_g_nakazeni);
        PR_g_nakazeni.setBounds(0, 30, 250, 190);

        javax.swing.GroupLayout PR_g_zaockovaniLayout = new javax.swing.GroupLayout(PR_g_zaockovani);
        PR_g_zaockovani.setLayout(PR_g_zaockovaniLayout);
        PR_g_zaockovaniLayout.setHorizontalGroup(
            PR_g_zaockovaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        PR_g_zaockovaniLayout.setVerticalGroup(
            PR_g_zaockovaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_presov.add(PR_g_zaockovani);
        PR_g_zaockovani.setBounds(0, 250, 250, 190);

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Vývoj nákazy");
        info_presov.add(jLabel31);
        jLabel31.setBounds(10, 10, 230, 19);

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Počet úmrtí");
        info_presov.add(jLabel32);
        jLabel32.setBounds(260, 10, 210, 19);

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Zaočkovaní");
        info_presov.add(jLabel33);
        jLabel33.setBounds(10, 230, 220, 19);

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("Prešovský kraj");
        info_presov.add(jLabel34);
        jLabel34.setBounds(260, 250, 220, 30);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ikony.png"))); // NOI18N
        info_presov.add(jLabel35);
        jLabel35.setBounds(270, 260, 52, 160);

        PR_pocetZaockovanych.setBackground(new java.awt.Color(51, 51, 51));
        PR_pocetZaockovanych.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PR_pocetZaockovanych.setForeground(new java.awt.Color(51, 51, 51));
        PR_pocetZaockovanych.setText("0");
        info_presov.add(PR_pocetZaockovanych);
        PR_pocetZaockovanych.setBounds(310, 370, 120, 24);

        PR_pocetUmrti.setBackground(new java.awt.Color(51, 51, 51));
        PR_pocetUmrti.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PR_pocetUmrti.setForeground(new java.awt.Color(51, 51, 51));
        PR_pocetUmrti.setText("0");
        info_presov.add(PR_pocetUmrti);
        PR_pocetUmrti.setBounds(310, 330, 120, 24);

        PR_pocetNakazenych.setBackground(new java.awt.Color(51, 51, 51));
        PR_pocetNakazenych.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PR_pocetNakazenych.setForeground(new java.awt.Color(51, 51, 51));
        PR_pocetNakazenych.setText("0");
        info_presov.add(PR_pocetNakazenych);
        PR_pocetNakazenych.setBounds(310, 290, 120, 24);

        Kraje_info.add(info_presov);
        info_presov.setBounds(0, 0, 500, 440);

        info_bystrica.setBackground(new java.awt.Color(102, 102, 102));
        info_bystrica.setLayout(null);

        javax.swing.GroupLayout BB_g_pocetUmrtiLayout = new javax.swing.GroupLayout(BB_g_pocetUmrti);
        BB_g_pocetUmrti.setLayout(BB_g_pocetUmrtiLayout);
        BB_g_pocetUmrtiLayout.setHorizontalGroup(
            BB_g_pocetUmrtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        BB_g_pocetUmrtiLayout.setVerticalGroup(
            BB_g_pocetUmrtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_bystrica.add(BB_g_pocetUmrti);
        BB_g_pocetUmrti.setBounds(250, 30, 250, 190);

        javax.swing.GroupLayout BB_g_nakazeniLayout = new javax.swing.GroupLayout(BB_g_nakazeni);
        BB_g_nakazeni.setLayout(BB_g_nakazeniLayout);
        BB_g_nakazeniLayout.setHorizontalGroup(
            BB_g_nakazeniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        BB_g_nakazeniLayout.setVerticalGroup(
            BB_g_nakazeniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_bystrica.add(BB_g_nakazeni);
        BB_g_nakazeni.setBounds(0, 30, 250, 190);

        javax.swing.GroupLayout BB_g_zaockovaniLayout = new javax.swing.GroupLayout(BB_g_zaockovani);
        BB_g_zaockovani.setLayout(BB_g_zaockovaniLayout);
        BB_g_zaockovaniLayout.setHorizontalGroup(
            BB_g_zaockovaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        BB_g_zaockovaniLayout.setVerticalGroup(
            BB_g_zaockovaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_bystrica.add(BB_g_zaockovani);
        BB_g_zaockovani.setBounds(0, 250, 250, 190);

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Vývoj nákazy");
        info_bystrica.add(jLabel26);
        jLabel26.setBounds(10, 10, 230, 19);

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Počet úmrtí");
        info_bystrica.add(jLabel27);
        jLabel27.setBounds(260, 10, 210, 19);

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Zaočkovaní");
        info_bystrica.add(jLabel28);
        jLabel28.setBounds(10, 230, 220, 19);

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Banskobystrický kraj");
        info_bystrica.add(jLabel29);
        jLabel29.setBounds(260, 250, 220, 30);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ikony.png"))); // NOI18N
        info_bystrica.add(jLabel30);
        jLabel30.setBounds(270, 260, 52, 160);

        BB_pocetZaockovanych.setBackground(new java.awt.Color(51, 51, 51));
        BB_pocetZaockovanych.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BB_pocetZaockovanych.setForeground(new java.awt.Color(51, 51, 51));
        BB_pocetZaockovanych.setText("0");
        info_bystrica.add(BB_pocetZaockovanych);
        BB_pocetZaockovanych.setBounds(310, 370, 120, 24);

        BB_pocetUmrti.setBackground(new java.awt.Color(51, 51, 51));
        BB_pocetUmrti.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BB_pocetUmrti.setForeground(new java.awt.Color(51, 51, 51));
        BB_pocetUmrti.setText("0");
        info_bystrica.add(BB_pocetUmrti);
        BB_pocetUmrti.setBounds(310, 330, 120, 24);

        BB_pocetNakazenych.setBackground(new java.awt.Color(51, 51, 51));
        BB_pocetNakazenych.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BB_pocetNakazenych.setForeground(new java.awt.Color(51, 51, 51));
        BB_pocetNakazenych.setText("0");
        info_bystrica.add(BB_pocetNakazenych);
        BB_pocetNakazenych.setBounds(310, 290, 120, 24);

        Kraje_info.add(info_bystrica);
        info_bystrica.setBounds(0, 0, 500, 440);

        info_zilina.setBackground(new java.awt.Color(102, 102, 102));
        info_zilina.setLayout(null);

        javax.swing.GroupLayout ZA_g_pocetUmrtiLayout = new javax.swing.GroupLayout(ZA_g_pocetUmrti);
        ZA_g_pocetUmrti.setLayout(ZA_g_pocetUmrtiLayout);
        ZA_g_pocetUmrtiLayout.setHorizontalGroup(
            ZA_g_pocetUmrtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        ZA_g_pocetUmrtiLayout.setVerticalGroup(
            ZA_g_pocetUmrtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_zilina.add(ZA_g_pocetUmrti);
        ZA_g_pocetUmrti.setBounds(250, 30, 250, 190);

        javax.swing.GroupLayout ZA_g_nakazeniLayout = new javax.swing.GroupLayout(ZA_g_nakazeni);
        ZA_g_nakazeni.setLayout(ZA_g_nakazeniLayout);
        ZA_g_nakazeniLayout.setHorizontalGroup(
            ZA_g_nakazeniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        ZA_g_nakazeniLayout.setVerticalGroup(
            ZA_g_nakazeniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_zilina.add(ZA_g_nakazeni);
        ZA_g_nakazeni.setBounds(0, 30, 250, 190);

        javax.swing.GroupLayout ZA_g_zaockovaniLayout = new javax.swing.GroupLayout(ZA_g_zaockovani);
        ZA_g_zaockovani.setLayout(ZA_g_zaockovaniLayout);
        ZA_g_zaockovaniLayout.setHorizontalGroup(
            ZA_g_zaockovaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        ZA_g_zaockovaniLayout.setVerticalGroup(
            ZA_g_zaockovaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_zilina.add(ZA_g_zaockovani);
        ZA_g_zaockovani.setBounds(0, 250, 250, 190);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Vývoj nákazy");
        info_zilina.add(jLabel21);
        jLabel21.setBounds(10, 10, 230, 19);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Počet úmrtí");
        info_zilina.add(jLabel22);
        jLabel22.setBounds(260, 10, 210, 19);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Zaočkovaní");
        info_zilina.add(jLabel23);
        jLabel23.setBounds(10, 230, 220, 19);

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Žilinský kraj");
        info_zilina.add(jLabel24);
        jLabel24.setBounds(260, 250, 150, 30);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ikony.png"))); // NOI18N
        info_zilina.add(jLabel25);
        jLabel25.setBounds(270, 260, 52, 160);

        ZA_pocetZaockovanych.setBackground(new java.awt.Color(51, 51, 51));
        ZA_pocetZaockovanych.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ZA_pocetZaockovanych.setForeground(new java.awt.Color(51, 51, 51));
        ZA_pocetZaockovanych.setText("0");
        info_zilina.add(ZA_pocetZaockovanych);
        ZA_pocetZaockovanych.setBounds(310, 370, 120, 24);

        ZA_pocetUmrti.setBackground(new java.awt.Color(51, 51, 51));
        ZA_pocetUmrti.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ZA_pocetUmrti.setForeground(new java.awt.Color(51, 51, 51));
        ZA_pocetUmrti.setText("0");
        info_zilina.add(ZA_pocetUmrti);
        ZA_pocetUmrti.setBounds(310, 330, 120, 24);

        ZA_pocetNakazenych.setBackground(new java.awt.Color(51, 51, 51));
        ZA_pocetNakazenych.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ZA_pocetNakazenych.setForeground(new java.awt.Color(51, 51, 51));
        ZA_pocetNakazenych.setText("0");
        info_zilina.add(ZA_pocetNakazenych);
        ZA_pocetNakazenych.setBounds(310, 290, 120, 24);

        Kraje_info.add(info_zilina);
        info_zilina.setBounds(0, 0, 500, 440);

        info_nitra.setBackground(new java.awt.Color(102, 102, 102));
        info_nitra.setLayout(null);

        javax.swing.GroupLayout NT_g_pocetUmrtiLayout = new javax.swing.GroupLayout(NT_g_pocetUmrti);
        NT_g_pocetUmrti.setLayout(NT_g_pocetUmrtiLayout);
        NT_g_pocetUmrtiLayout.setHorizontalGroup(
            NT_g_pocetUmrtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        NT_g_pocetUmrtiLayout.setVerticalGroup(
            NT_g_pocetUmrtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_nitra.add(NT_g_pocetUmrti);
        NT_g_pocetUmrti.setBounds(250, 30, 250, 190);

        javax.swing.GroupLayout NT_g_nakazeniLayout = new javax.swing.GroupLayout(NT_g_nakazeni);
        NT_g_nakazeni.setLayout(NT_g_nakazeniLayout);
        NT_g_nakazeniLayout.setHorizontalGroup(
            NT_g_nakazeniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        NT_g_nakazeniLayout.setVerticalGroup(
            NT_g_nakazeniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_nitra.add(NT_g_nakazeni);
        NT_g_nakazeni.setBounds(0, 30, 250, 190);

        javax.swing.GroupLayout NT_g_zaockovaniLayout = new javax.swing.GroupLayout(NT_g_zaockovani);
        NT_g_zaockovani.setLayout(NT_g_zaockovaniLayout);
        NT_g_zaockovaniLayout.setHorizontalGroup(
            NT_g_zaockovaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        NT_g_zaockovaniLayout.setVerticalGroup(
            NT_g_zaockovaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_nitra.add(NT_g_zaockovani);
        NT_g_zaockovani.setBounds(0, 250, 250, 190);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Vývoj nákazy");
        info_nitra.add(jLabel16);
        jLabel16.setBounds(10, 10, 230, 19);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Počet úmrtí");
        info_nitra.add(jLabel17);
        jLabel17.setBounds(260, 10, 210, 19);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Zaočkovaní");
        info_nitra.add(jLabel18);
        jLabel18.setBounds(10, 230, 220, 19);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Nitriansky kraj");
        info_nitra.add(jLabel19);
        jLabel19.setBounds(260, 250, 150, 30);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ikony.png"))); // NOI18N
        info_nitra.add(jLabel20);
        jLabel20.setBounds(270, 260, 52, 160);

        NT_pocetZaockovanych.setBackground(new java.awt.Color(51, 51, 51));
        NT_pocetZaockovanych.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NT_pocetZaockovanych.setForeground(new java.awt.Color(51, 51, 51));
        NT_pocetZaockovanych.setText("0");
        info_nitra.add(NT_pocetZaockovanych);
        NT_pocetZaockovanych.setBounds(310, 370, 120, 24);

        NT_pocetUmrti.setBackground(new java.awt.Color(51, 51, 51));
        NT_pocetUmrti.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NT_pocetUmrti.setForeground(new java.awt.Color(51, 51, 51));
        NT_pocetUmrti.setText("0");
        info_nitra.add(NT_pocetUmrti);
        NT_pocetUmrti.setBounds(310, 330, 120, 24);

        NT_pocetNakazenych.setBackground(new java.awt.Color(51, 51, 51));
        NT_pocetNakazenych.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NT_pocetNakazenych.setForeground(new java.awt.Color(51, 51, 51));
        NT_pocetNakazenych.setText("0");
        info_nitra.add(NT_pocetNakazenych);
        NT_pocetNakazenych.setBounds(310, 290, 120, 24);

        Kraje_info.add(info_nitra);
        info_nitra.setBounds(0, 0, 500, 440);

        info_trencin.setBackground(new java.awt.Color(102, 102, 102));
        info_trencin.setLayout(null);

        javax.swing.GroupLayout TR_g_pocetUmrtiLayout = new javax.swing.GroupLayout(TR_g_pocetUmrti);
        TR_g_pocetUmrti.setLayout(TR_g_pocetUmrtiLayout);
        TR_g_pocetUmrtiLayout.setHorizontalGroup(
            TR_g_pocetUmrtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        TR_g_pocetUmrtiLayout.setVerticalGroup(
            TR_g_pocetUmrtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_trencin.add(TR_g_pocetUmrti);
        TR_g_pocetUmrti.setBounds(250, 30, 250, 190);

        javax.swing.GroupLayout TR_g_nakazeniLayout = new javax.swing.GroupLayout(TR_g_nakazeni);
        TR_g_nakazeni.setLayout(TR_g_nakazeniLayout);
        TR_g_nakazeniLayout.setHorizontalGroup(
            TR_g_nakazeniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        TR_g_nakazeniLayout.setVerticalGroup(
            TR_g_nakazeniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_trencin.add(TR_g_nakazeni);
        TR_g_nakazeni.setBounds(0, 30, 250, 190);

        javax.swing.GroupLayout TR_g_zaockovaniLayout = new javax.swing.GroupLayout(TR_g_zaockovani);
        TR_g_zaockovani.setLayout(TR_g_zaockovaniLayout);
        TR_g_zaockovaniLayout.setHorizontalGroup(
            TR_g_zaockovaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        TR_g_zaockovaniLayout.setVerticalGroup(
            TR_g_zaockovaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_trencin.add(TR_g_zaockovani);
        TR_g_zaockovani.setBounds(0, 250, 250, 190);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Vývoj nákazy");
        info_trencin.add(jLabel11);
        jLabel11.setBounds(10, 10, 230, 19);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Počet úmrtí");
        info_trencin.add(jLabel12);
        jLabel12.setBounds(260, 10, 210, 19);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Zaočkovaní");
        info_trencin.add(jLabel13);
        jLabel13.setBounds(10, 230, 220, 19);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Trenčiansky kraj");
        info_trencin.add(jLabel14);
        jLabel14.setBounds(260, 250, 150, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ikony.png"))); // NOI18N
        info_trencin.add(jLabel15);
        jLabel15.setBounds(270, 260, 52, 160);

        TR_pocetZaockovanych.setBackground(new java.awt.Color(51, 51, 51));
        TR_pocetZaockovanych.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TR_pocetZaockovanych.setForeground(new java.awt.Color(51, 51, 51));
        TR_pocetZaockovanych.setText("0");
        info_trencin.add(TR_pocetZaockovanych);
        TR_pocetZaockovanych.setBounds(310, 370, 120, 24);

        TR_pocetUmrti.setBackground(new java.awt.Color(51, 51, 51));
        TR_pocetUmrti.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TR_pocetUmrti.setForeground(new java.awt.Color(51, 51, 51));
        TR_pocetUmrti.setText("0");
        info_trencin.add(TR_pocetUmrti);
        TR_pocetUmrti.setBounds(310, 330, 120, 24);

        TR_pocetNakazenych.setBackground(new java.awt.Color(51, 51, 51));
        TR_pocetNakazenych.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TR_pocetNakazenych.setForeground(new java.awt.Color(51, 51, 51));
        TR_pocetNakazenych.setText("0");
        info_trencin.add(TR_pocetNakazenych);
        TR_pocetNakazenych.setBounds(310, 290, 120, 24);

        Kraje_info.add(info_trencin);
        info_trencin.setBounds(0, 0, 500, 440);

        info_trnava.setBackground(new java.awt.Color(102, 102, 102));
        info_trnava.setLayout(null);

        javax.swing.GroupLayout TN_g_pocetUmrtiLayout = new javax.swing.GroupLayout(TN_g_pocetUmrti);
        TN_g_pocetUmrti.setLayout(TN_g_pocetUmrtiLayout);
        TN_g_pocetUmrtiLayout.setHorizontalGroup(
            TN_g_pocetUmrtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        TN_g_pocetUmrtiLayout.setVerticalGroup(
            TN_g_pocetUmrtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_trnava.add(TN_g_pocetUmrti);
        TN_g_pocetUmrti.setBounds(250, 30, 250, 190);

        javax.swing.GroupLayout TN_g_nakazeniLayout = new javax.swing.GroupLayout(TN_g_nakazeni);
        TN_g_nakazeni.setLayout(TN_g_nakazeniLayout);
        TN_g_nakazeniLayout.setHorizontalGroup(
            TN_g_nakazeniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        TN_g_nakazeniLayout.setVerticalGroup(
            TN_g_nakazeniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_trnava.add(TN_g_nakazeni);
        TN_g_nakazeni.setBounds(0, 30, 250, 190);

        javax.swing.GroupLayout TN_g_zaockovaniLayout = new javax.swing.GroupLayout(TN_g_zaockovani);
        TN_g_zaockovani.setLayout(TN_g_zaockovaniLayout);
        TN_g_zaockovaniLayout.setHorizontalGroup(
            TN_g_zaockovaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        TN_g_zaockovaniLayout.setVerticalGroup(
            TN_g_zaockovaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        info_trnava.add(TN_g_zaockovani);
        TN_g_zaockovani.setBounds(0, 250, 250, 190);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Vývoj nákazy");
        info_trnava.add(jLabel6);
        jLabel6.setBounds(10, 10, 230, 19);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Počet úmrtí");
        info_trnava.add(jLabel7);
        jLabel7.setBounds(260, 10, 210, 19);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Zaočkovaní");
        info_trnava.add(jLabel8);
        jLabel8.setBounds(10, 230, 220, 19);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Trnavský kraj");
        info_trnava.add(jLabel9);
        jLabel9.setBounds(260, 250, 150, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ikony.png"))); // NOI18N
        info_trnava.add(jLabel10);
        jLabel10.setBounds(270, 260, 52, 160);

        TN_pocetZaockovanych.setBackground(new java.awt.Color(51, 51, 51));
        TN_pocetZaockovanych.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TN_pocetZaockovanych.setForeground(new java.awt.Color(51, 51, 51));
        TN_pocetZaockovanych.setText("0");
        info_trnava.add(TN_pocetZaockovanych);
        TN_pocetZaockovanych.setBounds(310, 370, 120, 24);

        TN_pocetUmrti.setBackground(new java.awt.Color(51, 51, 51));
        TN_pocetUmrti.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TN_pocetUmrti.setForeground(new java.awt.Color(51, 51, 51));
        TN_pocetUmrti.setText("0");
        info_trnava.add(TN_pocetUmrti);
        TN_pocetUmrti.setBounds(310, 330, 120, 24);

        TN_pocetNakazenych1.setBackground(new java.awt.Color(51, 51, 51));
        TN_pocetNakazenych1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TN_pocetNakazenych1.setForeground(new java.awt.Color(51, 51, 51));
        TN_pocetNakazenych1.setText("0");
        info_trnava.add(TN_pocetNakazenych1);
        TN_pocetNakazenych1.setBounds(310, 290, 120, 24);

        Kraje_info.add(info_trnava);
        info_trnava.setBounds(0, 0, 500, 440);

        hlavnyPanel.add(Kraje_info);
        Kraje_info.setBounds(270, 90, 540, 440);

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
        this.Kraje_info.setVisible(false);
        
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
        if (!zapnutieOpatreni) {
                zapnutieOpatreni = true;
                this.BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zapinac.png")));;
            }
        if(sluzby != ESluzby.ZAVRETE_RIZIKOVE){
            sluzby = ESluzby.ZAVRETE_RIZIKOVE;
            BTNI_Sluzby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/rizikove.png")));
            this.opatrenia.getSluzby().setRizikove(false);
        }else{
            sluzby = ESluzby.OTVORENE;
            this.opatrenia.getSluzby().setNeobmedzene();
            BTNI_Sluzby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/otvoreneSluzby.png")));
        }
        
        this.opatrenia.getSluzby().zapnutie();
        //treba vyriešiť ako sa to bude správať (kolko ludi sa bude stretávať v takopmto prípade)
    }//GEN-LAST:event_K_S_ZavreteRizikoveMouseClicked

    private void K_S_ZakladneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_S_ZakladneMouseClicked
        if (!zapnutieOpatreni) {
                zapnutieOpatreni = true;
                this.BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zapinac.png")));;
        }
        if(sluzby != ESluzby.OTVORENE_LEN_ZAKLADNE){
            sluzby = ESluzby.OTVORENE_LEN_ZAKLADNE;
            BTNI_Sluzby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zakladne.png")));
            this.opatrenia.getSluzby().setNechajZakladne(true);
        }else{
            sluzby = ESluzby.OTVORENE;
            this.opatrenia.getSluzby().setNeobmedzene();
            BTNI_Sluzby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/otvoreneSluzby.png")));
        }
        
        this.opatrenia.getSluzby().zapnutie();
        //treba vyriešiť ako sa to bude správať (kolko ludi sa bude stretávať v takopmto prípade)
    }//GEN-LAST:event_K_S_ZakladneMouseClicked

    private void K_SK_ZavreteVSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_SK_ZavreteVSMouseClicked
       if (!zapnutieOpatreni) {
                zapnutieOpatreni = true;
                this.BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zapinac.png")));;
            }
        if (skoly != ESkoly.ZAVRETE_VYSOKE_SKOLY) {
            skoly = ESkoly.ZAVRETE_VYSOKE_SKOLY;
            BTNI_Skoly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/skolyVysoke.png")));
            this.opatrenia.getVysokeSkoly().zapnutie();
        }else{
            skoly = ESkoly.OTVORENE;
            BTNI_Skoly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/skolyNeobmedzene.png")));
            this.opatrenia.getSkoly().vypnutie();
            this.opatrenia.getVysokeSkoly().vypnutie();
        }
        
    }//GEN-LAST:event_K_SK_ZavreteVSMouseClicked

    private void K_SK_ZavreteVsetkyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_SK_ZavreteVsetkyMouseClicked
        if (!zapnutieOpatreni) {
                zapnutieOpatreni = true;
                this.BTNI_OtvorVsetko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/zapinac.png")));;
            }
        if(skoly == ESkoly.OTVORENE || skoly == ESkoly.ZAVRETE_VYSOKE_SKOLY)
        {
            skoly = ESkoly.VSETKY_ZAVRETE;
            BTNI_Skoly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/skolyZavrete.png")));
            this.opatrenia.getSkoly().zapnutie();
            this.opatrenia.getVysokeSkoly().zapnutie();
        }else
        {
            skoly = ESkoly.OTVORENE;
            BTNI_Skoly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/skolyNeobmedzene.png")));
            this.opatrenia.getSkoly().vypnutie();
            this.opatrenia.getVysokeSkoly().vypnutie();
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

    private void M_InfoOkrajochMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_InfoOkrajochMouseClicked
        this.zmenViditelnostPrehladu(false);
        this.skrytiePrehladu = true;
        this.menu = ENadstavenieMenu.KRAJE;
        this.BTNI_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/menu_soc_siete.png")));
        this.Notifikacie.setVisible(false);
        this.Kraje_info.setVisible(true);
    }//GEN-LAST:event_M_InfoOkrajochMouseClicked

    private void M_PrehladMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_PrehladMouseClicked
        this.zmenViditelnostPrehladu(true);
        this.Notifikacie.setVisible(false);
        this.skrytiePrehladu = false;
        this.menu = ENadstavenieMenu.PREHLAD;
        this.BTNI_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/menu_Prehlad.png")));
        this.Kraje_info.setVisible(false);
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

    private void BAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BAMouseClicked
        this.info_bratislava.setVisible(true);
        this.info_bystrica.setVisible(false);
        this.info_kosice.setVisible(false);
        this.info_nitra.setVisible(false);
        this.info_presov.setVisible(false);
        this.info_trencin.setVisible(false);
        this.info_trnava.setVisible(false);
        this.info_zilina.setVisible(false);
    }//GEN-LAST:event_BAMouseClicked

    private void TNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TNMouseClicked
        this.info_bratislava.setVisible(false);
        this.info_bystrica.setVisible(false);
        this.info_kosice.setVisible(false);
        this.info_nitra.setVisible(false);
        this.info_presov.setVisible(false);
        this.info_trencin.setVisible(false);
        this.info_trnava.setVisible(true);
        this.info_zilina.setVisible(false);
    }//GEN-LAST:event_TNMouseClicked

    private void TRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRMouseClicked
        this.info_bratislava.setVisible(false);
        this.info_bystrica.setVisible(false);
        this.info_kosice.setVisible(false);
        this.info_nitra.setVisible(false);
        this.info_presov.setVisible(false);
        this.info_trencin.setVisible(true);
        this.info_trnava.setVisible(false);
        this.info_zilina.setVisible(false);
    }//GEN-LAST:event_TRMouseClicked

    private void NTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NTMouseClicked
        this.info_bratislava.setVisible(false);
        this.info_bystrica.setVisible(false);
        this.info_kosice.setVisible(false);
        this.info_nitra.setVisible(true);
        this.info_presov.setVisible(false);
        this.info_trencin.setVisible(false);
        this.info_trnava.setVisible(false);
        this.info_zilina.setVisible(false);
    }//GEN-LAST:event_NTMouseClicked

    private void ZAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZAMouseClicked
        this.info_bratislava.setVisible(false);
        this.info_bystrica.setVisible(false);
        this.info_kosice.setVisible(false);
        this.info_nitra.setVisible(false);
        this.info_presov.setVisible(false);
        this.info_trencin.setVisible(false);
        this.info_trnava.setVisible(false);
        this.info_zilina.setVisible(true);
    }//GEN-LAST:event_ZAMouseClicked

    private void BBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BBMouseClicked
        this.info_bratislava.setVisible(false);
        this.info_bystrica.setVisible(true);
        this.info_kosice.setVisible(false);
        this.info_nitra.setVisible(false);
        this.info_presov.setVisible(false);
        this.info_trencin.setVisible(false);
        this.info_trnava.setVisible(false);
        this.info_zilina.setVisible(false);
    }//GEN-LAST:event_BBMouseClicked

    private void PRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRMouseClicked
        this.info_bratislava.setVisible(false);
        this.info_bystrica.setVisible(false);
        this.info_kosice.setVisible(false);
        this.info_nitra.setVisible(false);
        this.info_presov.setVisible(true);
        this.info_trencin.setVisible(false);
        this.info_trnava.setVisible(false);
        this.info_zilina.setVisible(false);
    }//GEN-LAST:event_PRMouseClicked

    private void KEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KEMouseClicked
        this.info_bratislava.setVisible(false);
        this.info_bystrica.setVisible(false);
        this.info_kosice.setVisible(true);
        this.info_nitra.setVisible(false);
        this.info_presov.setVisible(false);
        this.info_trencin.setVisible(false);
        this.info_trnava.setVisible(false);
        this.info_zilina.setVisible(false);
    }//GEN-LAST:event_KEMouseClicked

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
        
        this.opatrenia.getAkcie().zapnutie();
        this.opatrenia.getHranice().zapnutie();
        this.opatrenia.getRuskaOdstup().zapnutie();
        this.opatrenia.getSkoly().zapnutie();
        this.opatrenia.getVysokeSkoly().zapnutie();
        this.opatrenia.getSluzby().setNechajZakladne(true);
        this.opatrenia.getZakazVychadzania().zapnutie();
        this.opatrenia.getZatvorenieKrajov().zapnutie();
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
        
        this.opatrenia.getAkcie().vypnutie();
        this.opatrenia.getCeloplosneTestovanie().vypnutie();
        this.opatrenia.getHranice().vypnutie();
        this.opatrenia.getRuskaOdstup().vypnutie();
        this.opatrenia.getSkoly().vypnutie();
        this.opatrenia.getVysokeSkoly().vypnutie();
        this.opatrenia.getSluzby().setNeobmedzene();
        this.opatrenia.getZakazVychadzania().vypnutie();
        this.opatrenia.getZatvorenieKrajov().vypnutie();
    
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
    private javax.swing.JLabel BA;
    private javax.swing.JPanel BA_g_nakazeni;
    private javax.swing.JPanel BA_g_pocetUmrti;
    private javax.swing.JPanel BA_g_zaockovani;
    private javax.swing.JLabel BA_pocetNakazenych;
    private javax.swing.JLabel BA_pocetUmrti;
    private javax.swing.JLabel BA_pocetZaockovanych;
    private javax.swing.JLabel BB;
    private javax.swing.JPanel BB_g_nakazeni;
    private javax.swing.JPanel BB_g_pocetUmrti;
    private javax.swing.JPanel BB_g_zaockovani;
    private javax.swing.JLabel BB_pocetNakazenych;
    private javax.swing.JLabel BB_pocetUmrti;
    private javax.swing.JLabel BB_pocetZaockovanych;
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
    private javax.swing.JLabel KE;
    private javax.swing.JPanel KE_g_nakazeni;
    private javax.swing.JPanel KE_g_pocetUmrti;
    private javax.swing.JPanel KE_g_zaockovani;
    private javax.swing.JLabel KE_pocetNakazenych;
    private javax.swing.JLabel KE_pocetUmrti;
    private javax.swing.JLabel KE_pocetZaockovanych;
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
    private javax.swing.JPanel Kraje_info;
    private javax.swing.JList<String> List;
    private javax.swing.JLabel M_InfoOkrajoch;
    private javax.swing.JLabel M_Notifikacie;
    private javax.swing.JLabel M_Prehlad;
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
    private javax.swing.JLabel NT;
    private javax.swing.JPanel NT_g_nakazeni;
    private javax.swing.JPanel NT_g_pocetUmrti;
    private javax.swing.JPanel NT_g_zaockovani;
    private javax.swing.JLabel NT_pocetNakazenych;
    private javax.swing.JLabel NT_pocetUmrti;
    private javax.swing.JLabel NT_pocetZaockovanych;
    private javax.swing.JScrollPane Notifikacie;
    private javax.swing.JLabel Oznam;
    private javax.swing.JLabel PR;
    private javax.swing.JPanel PR_g_nakazeni;
    private javax.swing.JPanel PR_g_pocetUmrti;
    private javax.swing.JPanel PR_g_zaockovani;
    private javax.swing.JLabel PR_pocetNakazenych;
    private javax.swing.JLabel PR_pocetUmrti;
    private javax.swing.JLabel PR_pocetZaockovanych;
    private javax.swing.JLabel P_nakazeniZaDen;
    private javax.swing.JLabel P_nstavNemocnice;
    private javax.swing.JLabel P_pocetUmrti;
    private javax.swing.JLabel P_pocetZaockovanych;
    private javax.swing.JLabel P_spoocenskaStabilita;
    private javax.swing.JLabel P_vsetciNakazeni;
    private javax.swing.JLabel TN;
    private javax.swing.JPanel TN_g_nakazeni;
    private javax.swing.JPanel TN_g_pocetUmrti;
    private javax.swing.JPanel TN_g_zaockovani;
    private javax.swing.JLabel TN_pocetNakazenych1;
    private javax.swing.JLabel TN_pocetUmrti;
    private javax.swing.JLabel TN_pocetZaockovanych;
    private javax.swing.JLabel TR;
    private javax.swing.JPanel TR_g_nakazeni;
    private javax.swing.JPanel TR_g_pocetUmrti;
    private javax.swing.JPanel TR_g_zaockovani;
    private javax.swing.JLabel TR_pocetNakazenych;
    private javax.swing.JLabel TR_pocetUmrti;
    private javax.swing.JLabel TR_pocetZaockovanych;
    private javax.swing.JLabel T_Opatrenia;
    private javax.swing.JLabel ZA;
    private javax.swing.JPanel ZA_g_nakazeni;
    private javax.swing.JPanel ZA_g_pocetUmrti;
    private javax.swing.JPanel ZA_g_zaockovani;
    private javax.swing.JLabel ZA_pocetNakazenych;
    private javax.swing.JLabel ZA_pocetUmrti;
    private javax.swing.JLabel ZA_pocetZaockovanych;
    private javax.swing.JPanel hlavnyPanel;
    private javax.swing.JPanel info_bratislava;
    private javax.swing.JPanel info_bystrica;
    private javax.swing.JPanel info_kosice;
    private javax.swing.JPanel info_nitra;
    private javax.swing.JPanel info_presov;
    private javax.swing.JPanel info_trencin;
    private javax.swing.JPanel info_trnava;
    private javax.swing.JPanel info_zilina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
        
        
        JFreeChart chart = ChartFactory.createPieChart("", dataset, true, true, false);
        
        final PiePlot plot = (PiePlot) chart.getPlot();
        plot.setInteriorGap(0.0);
        plot.setLabelGenerator(null);

        chart.getPlot().setOutlineVisible(false);
        
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
        
        XYSeries oSeries = new XYSeries("1. davka vakciny");
        for (int i = 0; i < hodnotyZaockovanych.size(); i++) {
            oSeries.add(i+1,hodnotyZaockovanych.get(i));
        }
        
        XYSeries oSeries2 = new XYSeries("2. davka vakciny");
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

        //plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.white);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);

        //this.jPanel2.setLayout(new BorderLayout());
        //this.jPanel2.add(oPanel);
        //this.jPanel2.validate();
        
        this.panel_Graf3_vyfarbeny.setLayout(new java.awt.BorderLayout());
        this.panel_Graf3_vyfarbeny.add(oPanel);
        this.panel_Graf3_vyfarbeny.validate();
        
        ChartPanel localChartPanel =  new ChartPanel(oChart, true);
        
      //  this.scrol.add(localChartPanel);
        
    }
    
    private void zmenViditelnostPrehladu(boolean viditelnost){
        this.panel_Graf.setVisible(viditelnost);
        this.panel_Graf2_kruhovy.setVisible(viditelnost);
        this.panel_Graf3_vyfarbeny.setVisible(viditelnost);
    }
    
    public void pridajNotifikaciu(String s){
        zoznamPoloziek.addElement(s);
        List.setModel(zoznamPoloziek);
    }
    
    public void informacieObratislavskomKraji(int noviNakazeni, int pocetUmrti, int zaockovani){
        this.BA_pocetNakazenych.setText(""+noviNakazeni);
        this.BA_pocetUmrti.setText(""+pocetUmrti);
        this.BA_pocetZaockovanych.setText(""+zaockovani);
        
        BAnakazeni.add(noviNakazeni);
        XYSeries oSeries = new XYSeries("");
        for (int i = 0; i < BAnakazeni.size(); i++) { oSeries.add(i+1,BAnakazeni.get(i));}
        XYSeriesCollection oDatabase = new XYSeriesCollection();
        oDatabase.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("", "", "", oDatabase,PlotOrientation.VERTICAL,false, false, false);
        oChart.setBackgroundPaint(null);
        ChartPanel oPanel = new ChartPanel(oChart);
        XYPlot plot = oChart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);
        plot.setOutlinePaint(null);//vypnutie bordera
        this.BA_g_nakazeni.setLayout(new java.awt.BorderLayout());
        this.BA_g_nakazeni.add(oPanel);
        this.BA_g_nakazeni.validate();
        
        BAumrtia.add(pocetUmrti);
        XYSeries oSeries1 = new XYSeries("");
        for (int i = 0; i < BAumrtia.size(); i++) { oSeries1.add(i+1,BAumrtia.get(i));}
        XYSeriesCollection oDatabase1 = new XYSeriesCollection();
        oDatabase1.addSeries(oSeries1);
        JFreeChart oChart1 = ChartFactory.createXYLineChart("", "", "", oDatabase1,PlotOrientation.VERTICAL,false, false, false);
        oChart1.setBackgroundPaint(null);
        ChartPanel oPanel1 = new ChartPanel(oChart1);
        XYPlot plot1 = oChart1.getXYPlot();
        plot1.setBackgroundPaint(Color.WHITE);
        plot1.setRangeGridlinesVisible(false);
        plot1.setDomainGridlinesVisible(false);
        plot1.setOutlinePaint(null);//vypnutie bordera
        this.BA_g_pocetUmrti.setLayout(new java.awt.BorderLayout());
        this.BA_g_pocetUmrti.add(oPanel1);
        this.BA_g_pocetUmrti.validate();
        
        BAzaockovani.add(zaockovani);
        XYSeries oSeries12 = new XYSeries("");
        for (int i = 0; i < BAzaockovani.size(); i++) { oSeries12.add(i+1,BAzaockovani.get(i));}
        XYSeriesCollection oDatabase12 = new XYSeriesCollection();
        oDatabase12.addSeries(oSeries12);
        JFreeChart oChart12 = ChartFactory.createXYLineChart("", "", "", oDatabase12,PlotOrientation.VERTICAL,false, false, false);
        oChart1.setBackgroundPaint(null);
        ChartPanel oPanel2 = new ChartPanel(oChart12);
        XYPlot plot12 = oChart12.getXYPlot();
        plot12.setBackgroundPaint(Color.WHITE);
        plot12.setRangeGridlinesVisible(false);
        plot12.setDomainGridlinesVisible(false);
        plot12.setOutlinePaint(null);//vypnutie bordera
        this.BA_g_zaockovani.setLayout(new java.awt.BorderLayout());
        this.BA_g_zaockovani.add(oPanel2);
        this.BA_g_zaockovani.validate();
    }
    
    public void informacieOtrnavskonKraji(int noviNakazeni, int pocetUmrti, int zaockovani){
        this.TN_pocetNakazenych1.setText(""+noviNakazeni);
        this.TN_pocetUmrti.setText(""+pocetUmrti);
        this.TN_pocetZaockovanych.setText(""+zaockovani);
        
        TNnakazeni.add(noviNakazeni);
        XYSeries oSeries = new XYSeries("");
        for (int i = 0; i < TNnakazeni.size(); i++) { oSeries.add(i+1,TNnakazeni.get(i));}
        XYSeriesCollection oDatabase = new XYSeriesCollection();
        oDatabase.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("", "", "", oDatabase,PlotOrientation.VERTICAL,false, false, false);
        oChart.setBackgroundPaint(null);
        ChartPanel oPanel = new ChartPanel(oChart);
        XYPlot plot = oChart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);
        plot.setOutlinePaint(null);//vypnutie bordera
        this.TN_g_nakazeni.setLayout(new java.awt.BorderLayout());
        this.TN_g_nakazeni.add(oPanel);
        this.TN_g_nakazeni.validate();
        
        TNumrtia.add(pocetUmrti);
        XYSeries oSeries1 = new XYSeries("");
        for (int i = 0; i < TNumrtia.size(); i++) { oSeries1.add(i+1,TNumrtia.get(i));}
        XYSeriesCollection oDatabase1 = new XYSeriesCollection();
        oDatabase1.addSeries(oSeries1);
        JFreeChart oChart1 = ChartFactory.createXYLineChart("", "", "", oDatabase1,PlotOrientation.VERTICAL,false, false, false);
        oChart1.setBackgroundPaint(null);
        ChartPanel oPanel1 = new ChartPanel(oChart1);
        XYPlot plot1 = oChart1.getXYPlot();
        plot1.setBackgroundPaint(Color.WHITE);
        plot1.setRangeGridlinesVisible(false);
        plot1.setDomainGridlinesVisible(false);
        plot1.setOutlinePaint(null);//vypnutie bordera
        this.TN_g_pocetUmrti.setLayout(new java.awt.BorderLayout());
        this.TN_g_pocetUmrti.add(oPanel1);
        this.TN_g_pocetUmrti.validate();
        
        TNzaockovani.add(zaockovani);
        XYSeries oSeries12 = new XYSeries("");
        for (int i = 0; i < TNzaockovani.size(); i++) { oSeries12.add(i+1,TNzaockovani.get(i));}
        XYSeriesCollection oDatabase12 = new XYSeriesCollection();
        oDatabase12.addSeries(oSeries12);
        JFreeChart oChart12 = ChartFactory.createXYLineChart("", "", "", oDatabase12,PlotOrientation.VERTICAL,false, false, false);
        oChart1.setBackgroundPaint(null);
        ChartPanel oPanel2 = new ChartPanel(oChart12);
        XYPlot plot12 = oChart12.getXYPlot();
        plot12.setBackgroundPaint(Color.WHITE);
        plot12.setRangeGridlinesVisible(false);
        plot12.setDomainGridlinesVisible(false);
        plot12.setOutlinePaint(null);//vypnutie bordera
        this.TN_g_zaockovani.setLayout(new java.awt.BorderLayout());
        this.TN_g_zaockovani.add(oPanel2);
        this.TN_g_zaockovani.validate();
    }
    
     public void informacieOtrencianskomKraji(int noviNakazeni, int pocetUmrti, int zaockovani){
        this.TR_pocetNakazenych.setText(""+noviNakazeni);
        this.TR_pocetUmrti.setText(""+pocetUmrti);
        this.TR_pocetZaockovanych.setText(""+zaockovani);
        
        TRnakazeni.add(noviNakazeni);
        XYSeries oSeries = new XYSeries("");
        for (int i = 0; i < TRnakazeni.size(); i++) { oSeries.add(i+1,TRnakazeni.get(i));}
        XYSeriesCollection oDatabase = new XYSeriesCollection();
        oDatabase.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("", "", "", oDatabase,PlotOrientation.VERTICAL,false, false, false);
        oChart.setBackgroundPaint(null);
        ChartPanel oPanel = new ChartPanel(oChart);
        XYPlot plot = oChart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);
        plot.setOutlinePaint(null);//vypnutie bordera
        this.TR_g_nakazeni.setLayout(new java.awt.BorderLayout());
        this.TR_g_nakazeni.add(oPanel);
        this.TR_g_nakazeni.validate();
        
        TRumrtia.add(pocetUmrti);
        XYSeries oSeries1 = new XYSeries("");
        for (int i = 0; i < TRumrtia.size(); i++) { oSeries1.add(i+1,TRumrtia.get(i));}
        XYSeriesCollection oDatabase1 = new XYSeriesCollection();
        oDatabase1.addSeries(oSeries1);
        JFreeChart oChart1 = ChartFactory.createXYLineChart("", "", "", oDatabase1,PlotOrientation.VERTICAL,false, false, false);
        oChart1.setBackgroundPaint(null);
        ChartPanel oPanel1 = new ChartPanel(oChart1);
        XYPlot plot1 = oChart1.getXYPlot();
        plot1.setBackgroundPaint(Color.WHITE);
        plot1.setRangeGridlinesVisible(false);
        plot1.setDomainGridlinesVisible(false);
        plot1.setOutlinePaint(null);//vypnutie bordera
        this.TR_g_pocetUmrti.setLayout(new java.awt.BorderLayout());
        this.TR_g_pocetUmrti.add(oPanel1);
        this.TR_g_pocetUmrti.validate();
        
        TRzaockovani.add(zaockovani);
        XYSeries oSeries12 = new XYSeries("");
        for (int i = 0; i < TRzaockovani.size(); i++) { oSeries12.add(i+1,TRzaockovani.get(i));}
        XYSeriesCollection oDatabase12 = new XYSeriesCollection();
        oDatabase12.addSeries(oSeries12);
        JFreeChart oChart12 = ChartFactory.createXYLineChart("", "", "", oDatabase12,PlotOrientation.VERTICAL,false, false, false);
        oChart1.setBackgroundPaint(null);
        ChartPanel oPanel2 = new ChartPanel(oChart12);
        XYPlot plot12 = oChart12.getXYPlot();
        plot12.setBackgroundPaint(Color.WHITE);
        plot12.setRangeGridlinesVisible(false);
        plot12.setDomainGridlinesVisible(false);
        plot12.setOutlinePaint(null);//vypnutie bordera
        this.TR_g_zaockovani.setLayout(new java.awt.BorderLayout());
        this.TR_g_zaockovani.add(oPanel2);
        this.TR_g_zaockovani.validate();
    }
     
     public void informacieOnitrianskomKraji(int noviNakazeni, int pocetUmrti, int zaockovani){
        this.NT_pocetNakazenych.setText(""+noviNakazeni);
        this.NT_pocetUmrti.setText(""+pocetUmrti);
        this.NT_pocetZaockovanych.setText(""+zaockovani);
        
        NTnakazeni.add(noviNakazeni);
        XYSeries oSeries = new XYSeries("");
        for (int i = 0; i < NTnakazeni.size(); i++) { oSeries.add(i+1,NTnakazeni.get(i));}
        XYSeriesCollection oDatabase = new XYSeriesCollection();
        oDatabase.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("", "", "", oDatabase,PlotOrientation.VERTICAL,false, false, false);
        oChart.setBackgroundPaint(null);
        ChartPanel oPanel = new ChartPanel(oChart);
        XYPlot plot = oChart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);
        plot.setOutlinePaint(null);//vypnutie bordera
        this.NT_g_nakazeni.setLayout(new java.awt.BorderLayout());
        this.NT_g_nakazeni.add(oPanel);
        this.NT_g_nakazeni.validate();
        
        NTumrtia.add(pocetUmrti);
        XYSeries oSeries1 = new XYSeries("");
        for (int i = 0; i < NTumrtia.size(); i++) { oSeries1.add(i+1,NTumrtia.get(i));}
        XYSeriesCollection oDatabase1 = new XYSeriesCollection();
        oDatabase1.addSeries(oSeries1);
        JFreeChart oChart1 = ChartFactory.createXYLineChart("", "", "", oDatabase1,PlotOrientation.VERTICAL,false, false, false);
        oChart1.setBackgroundPaint(null);
        ChartPanel oPanel1 = new ChartPanel(oChart1);
        XYPlot plot1 = oChart1.getXYPlot();
        plot1.setBackgroundPaint(Color.WHITE);
        plot1.setRangeGridlinesVisible(false);
        plot1.setDomainGridlinesVisible(false);
        plot1.setOutlinePaint(null);//vypnutie bordera
        this.NT_g_pocetUmrti.setLayout(new java.awt.BorderLayout());
        this.NT_g_pocetUmrti.add(oPanel1);
        this.NT_g_pocetUmrti.validate();
        
        NTzaockovani.add(zaockovani);
        XYSeries oSeries12 = new XYSeries("");
        for (int i = 0; i < NTzaockovani.size(); i++) { oSeries12.add(i+1,NTzaockovani.get(i));}
        XYSeriesCollection oDatabase12 = new XYSeriesCollection();
        oDatabase12.addSeries(oSeries12);
        JFreeChart oChart12 = ChartFactory.createXYLineChart("", "", "", oDatabase12,PlotOrientation.VERTICAL,false, false, false);
        oChart1.setBackgroundPaint(null);
        ChartPanel oPanel2 = new ChartPanel(oChart12);
        XYPlot plot12 = oChart12.getXYPlot();
        plot12.setBackgroundPaint(Color.WHITE);
        plot12.setRangeGridlinesVisible(false);
        plot12.setDomainGridlinesVisible(false);
        plot12.setOutlinePaint(null);//vypnutie bordera
        this.NT_g_zaockovani.setLayout(new java.awt.BorderLayout());
        this.NT_g_zaockovani.add(oPanel2);
        this.NT_g_zaockovani.validate();
    }
     
     public void informacieOzilinskomKraji(int noviNakazeni, int pocetUmrti, int zaockovani){
        this.ZA_pocetNakazenych.setText(""+noviNakazeni);
        this.ZA_pocetUmrti.setText(""+pocetUmrti);
        this.ZA_pocetZaockovanych.setText(""+zaockovani);
        
        ZAnakazeni.add(noviNakazeni);
        XYSeries oSeries = new XYSeries("");
        for (int i = 0; i < ZAnakazeni.size(); i++) { oSeries.add(i+1,ZAnakazeni.get(i));}
        XYSeriesCollection oDatabase = new XYSeriesCollection();
        oDatabase.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("", "", "", oDatabase,PlotOrientation.VERTICAL,false, false, false);
        oChart.setBackgroundPaint(null);
        ChartPanel oPanel = new ChartPanel(oChart);
        XYPlot plot = oChart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);
        plot.setOutlinePaint(null);//vypnutie bordera
        this.ZA_g_nakazeni.setLayout(new java.awt.BorderLayout());
        this.ZA_g_nakazeni.add(oPanel);
        this.ZA_g_nakazeni.validate();
        
        ZAumrtia.add(pocetUmrti);
        XYSeries oSeries1 = new XYSeries("");
        for (int i = 0; i < ZAumrtia.size(); i++) { oSeries1.add(i+1,ZAumrtia.get(i));}
        XYSeriesCollection oDatabase1 = new XYSeriesCollection();
        oDatabase1.addSeries(oSeries1);
        JFreeChart oChart1 = ChartFactory.createXYLineChart("", "", "", oDatabase1,PlotOrientation.VERTICAL,false, false, false);
        oChart1.setBackgroundPaint(null);
        ChartPanel oPanel1 = new ChartPanel(oChart1);
        XYPlot plot1 = oChart1.getXYPlot();
        plot1.setBackgroundPaint(Color.WHITE);
        plot1.setRangeGridlinesVisible(false);
        plot1.setDomainGridlinesVisible(false);
        plot1.setOutlinePaint(null);//vypnutie bordera
        this.ZA_g_pocetUmrti.setLayout(new java.awt.BorderLayout());
        this.ZA_g_pocetUmrti.add(oPanel1);
        this.ZA_g_pocetUmrti.validate();
        
        ZAzaockovani.add(zaockovani);
        XYSeries oSeries12 = new XYSeries("");
        for (int i = 0; i < ZAzaockovani.size(); i++) { oSeries12.add(i+1,ZAzaockovani.get(i));}
        XYSeriesCollection oDatabase12 = new XYSeriesCollection();
        oDatabase12.addSeries(oSeries12);
        JFreeChart oChart12 = ChartFactory.createXYLineChart("", "", "", oDatabase12,PlotOrientation.VERTICAL,false, false, false);
        oChart1.setBackgroundPaint(null);
        ChartPanel oPanel2 = new ChartPanel(oChart12);
        XYPlot plot12 = oChart12.getXYPlot();
        plot12.setBackgroundPaint(Color.WHITE);
        plot12.setRangeGridlinesVisible(false);
        plot12.setDomainGridlinesVisible(false);
        plot12.setOutlinePaint(null);//vypnutie bordera
        this.ZA_g_zaockovani.setLayout(new java.awt.BorderLayout());
        this.ZA_g_zaockovani.add(oPanel2);
        this.ZA_g_zaockovani.validate();
    }
     
     public void informacieObanskobystrickomKraji(int noviNakazeni, int pocetUmrti, int zaockovani){
        this.BB_pocetNakazenych.setText(""+noviNakazeni);
        this.BB_pocetUmrti.setText(""+pocetUmrti);
        this.BB_pocetZaockovanych.setText(""+zaockovani);
        
        BBnakazeni.add(noviNakazeni);
        XYSeries oSeries = new XYSeries("");
        for (int i = 0; i < BBnakazeni.size(); i++) { oSeries.add(i+1,BBnakazeni.get(i));}
        XYSeriesCollection oDatabase = new XYSeriesCollection();
        oDatabase.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("", "", "", oDatabase,PlotOrientation.VERTICAL,false, false, false);
        oChart.setBackgroundPaint(null);
        ChartPanel oPanel = new ChartPanel(oChart);
        XYPlot plot = oChart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);
        plot.setOutlinePaint(null);//vypnutie bordera
        this.BB_g_nakazeni.setLayout(new java.awt.BorderLayout());
        this.BB_g_nakazeni.add(oPanel);
        this.BB_g_nakazeni.validate();
        
        BBumrtia.add(pocetUmrti);
        XYSeries oSeries1 = new XYSeries("");
        for (int i = 0; i < BBumrtia.size(); i++) { oSeries1.add(i+1,BBumrtia.get(i));}
        XYSeriesCollection oDatabase1 = new XYSeriesCollection();
        oDatabase1.addSeries(oSeries1);
        JFreeChart oChart1 = ChartFactory.createXYLineChart("", "", "", oDatabase1,PlotOrientation.VERTICAL,false, false, false);
        oChart1.setBackgroundPaint(null);
        ChartPanel oPanel1 = new ChartPanel(oChart1);
        XYPlot plot1 = oChart1.getXYPlot();
        plot1.setBackgroundPaint(Color.WHITE);
        plot1.setRangeGridlinesVisible(false);
        plot1.setDomainGridlinesVisible(false);
        plot1.setOutlinePaint(null);//vypnutie bordera
        this.BB_g_pocetUmrti.setLayout(new java.awt.BorderLayout());
        this.BB_g_pocetUmrti.add(oPanel1);
        this.BB_g_pocetUmrti.validate();
        
        BBzaockovani.add(zaockovani);
        XYSeries oSeries12 = new XYSeries("");
        for (int i = 0; i < BBzaockovani.size(); i++) { oSeries12.add(i+1,BBzaockovani.get(i));}
        XYSeriesCollection oDatabase12 = new XYSeriesCollection();
        oDatabase12.addSeries(oSeries12);
        JFreeChart oChart12 = ChartFactory.createXYLineChart("", "", "", oDatabase12,PlotOrientation.VERTICAL,false, false, false);
        oChart1.setBackgroundPaint(null);
        ChartPanel oPanel2 = new ChartPanel(oChart12);
        XYPlot plot12 = oChart12.getXYPlot();
        plot12.setBackgroundPaint(Color.WHITE);
        plot12.setRangeGridlinesVisible(false);
        plot12.setDomainGridlinesVisible(false);
        plot12.setOutlinePaint(null);//vypnutie bordera
        this.BB_g_zaockovani.setLayout(new java.awt.BorderLayout());
        this.BB_g_zaockovani.add(oPanel2);
        this.BB_g_zaockovani.validate();
    }
     
     public void informacieOpresovskommKraji(int noviNakazeni, int pocetUmrti, int zaockovani){
        this.PR_pocetNakazenych.setText(""+noviNakazeni);
        this.PR_pocetUmrti.setText(""+pocetUmrti);
        this.PR_pocetZaockovanych.setText(""+zaockovani);
        
        PRnakazeni.add(noviNakazeni);
        XYSeries oSeries = new XYSeries("");
        for (int i = 0; i < PRnakazeni.size(); i++) { oSeries.add(i+1,PRnakazeni.get(i));}
        XYSeriesCollection oDatabase = new XYSeriesCollection();
        oDatabase.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("", "", "", oDatabase,PlotOrientation.VERTICAL,false, false, false);
        oChart.setBackgroundPaint(null);
        ChartPanel oPanel = new ChartPanel(oChart);
        XYPlot plot = oChart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);
        plot.setOutlinePaint(null);//vypnutie bordera
        this.PR_g_nakazeni.setLayout(new java.awt.BorderLayout());
        this.PR_g_nakazeni.add(oPanel);
        this.PR_g_nakazeni.validate();
        
        PRumrtia.add(pocetUmrti);
        XYSeries oSeries1 = new XYSeries("");
        for (int i = 0; i < PRumrtia.size(); i++) { oSeries1.add(i+1,PRumrtia.get(i));}
        XYSeriesCollection oDatabase1 = new XYSeriesCollection();
        oDatabase1.addSeries(oSeries1);
        JFreeChart oChart1 = ChartFactory.createXYLineChart("", "", "", oDatabase1,PlotOrientation.VERTICAL,false, false, false);
        oChart1.setBackgroundPaint(null);
        ChartPanel oPanel1 = new ChartPanel(oChart1);
        XYPlot plot1 = oChart1.getXYPlot();
        plot1.setBackgroundPaint(Color.WHITE);
        plot1.setRangeGridlinesVisible(false);
        plot1.setDomainGridlinesVisible(false);
        plot1.setOutlinePaint(null);//vypnutie bordera
        this.PR_g_pocetUmrti.setLayout(new java.awt.BorderLayout());
        this.PR_g_pocetUmrti.add(oPanel1);
        this.PR_g_pocetUmrti.validate();
        
        PRzaockovani.add(zaockovani);
        XYSeries oSeries12 = new XYSeries("");
        for (int i = 0; i < PRzaockovani.size(); i++) { oSeries12.add(i+1,PRzaockovani.get(i));}
        XYSeriesCollection oDatabase12 = new XYSeriesCollection();
        oDatabase12.addSeries(oSeries12);
        JFreeChart oChart12 = ChartFactory.createXYLineChart("", "", "", oDatabase12,PlotOrientation.VERTICAL,false, false, false);
        oChart1.setBackgroundPaint(null);
        ChartPanel oPanel2 = new ChartPanel(oChart12);
        XYPlot plot12 = oChart12.getXYPlot();
        plot12.setBackgroundPaint(Color.WHITE);
        plot12.setRangeGridlinesVisible(false);
        plot12.setDomainGridlinesVisible(false);
        plot12.setOutlinePaint(null);//vypnutie bordera
        this.PR_g_zaockovani.setLayout(new java.awt.BorderLayout());
        this.PR_g_zaockovani.add(oPanel2);
        this.PR_g_zaockovani.validate();
    }
     
     public void informacieOkosickomKraji(int noviNakazeni, int pocetUmrti, int zaockovani){
        this.KE_pocetNakazenych.setText(""+noviNakazeni);
        this.KE_pocetUmrti.setText(""+pocetUmrti);
        this.KE_pocetZaockovanych.setText(""+zaockovani);
        
        KEnakazeni.add(noviNakazeni);
        XYSeries oSeries = new XYSeries("");
        for (int i = 0; i < KEnakazeni.size(); i++) { oSeries.add(i+1,PRnakazeni.get(i));}
        XYSeriesCollection oDatabase = new XYSeriesCollection();
        oDatabase.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("", "", "", oDatabase,PlotOrientation.VERTICAL,false, false, false);
        oChart.setBackgroundPaint(null);
        ChartPanel oPanel = new ChartPanel(oChart);
        XYPlot plot = oChart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);
        plot.setOutlinePaint(null);//vypnutie bordera
        this.KE_g_nakazeni.setLayout(new java.awt.BorderLayout());
        this.KE_g_nakazeni.add(oPanel);
        this.KE_g_nakazeni.validate();
        
        KEumrtia.add(pocetUmrti);
        XYSeries oSeries1 = new XYSeries("");
        for (int i = 0; i < KEumrtia.size(); i++) { oSeries1.add(i+1,KEumrtia.get(i));}
        XYSeriesCollection oDatabase1 = new XYSeriesCollection();
        oDatabase1.addSeries(oSeries1);
        JFreeChart oChart1 = ChartFactory.createXYLineChart("", "", "", oDatabase1,PlotOrientation.VERTICAL,false, false, false);
        oChart1.setBackgroundPaint(null);
        ChartPanel oPanel1 = new ChartPanel(oChart1);
        XYPlot plot1 = oChart1.getXYPlot();
        plot1.setBackgroundPaint(Color.WHITE);
        plot1.setRangeGridlinesVisible(false);
        plot1.setDomainGridlinesVisible(false);
        plot1.setOutlinePaint(null);//vypnutie bordera
        this.KE_g_pocetUmrti.setLayout(new java.awt.BorderLayout());
        this.KE_g_pocetUmrti.add(oPanel1);
        this.KE_g_pocetUmrti.validate();
        
        KEzaockovani.add(zaockovani);
        XYSeries oSeries12 = new XYSeries("");
        for (int i = 0; i < KEzaockovani.size(); i++) { oSeries12.add(i+1,KEzaockovani.get(i));}
        XYSeriesCollection oDatabase12 = new XYSeriesCollection();
        oDatabase12.addSeries(oSeries12);
        JFreeChart oChart12 = ChartFactory.createXYLineChart("", "", "", oDatabase12,PlotOrientation.VERTICAL,false, false, false);
        oChart1.setBackgroundPaint(null);
        ChartPanel oPanel2 = new ChartPanel(oChart12);
        XYPlot plot12 = oChart12.getXYPlot();
        plot12.setBackgroundPaint(Color.WHITE);
        plot12.setRangeGridlinesVisible(false);
        plot12.setDomainGridlinesVisible(false);
        plot12.setOutlinePaint(null);//vypnutie bordera
        this.KE_g_zaockovani.setLayout(new java.awt.BorderLayout());
        this.KE_g_zaockovani.add(oPanel2);
        this.KE_g_zaockovani.validate();
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
    KRAJE,
    SPRAVY,
    NOTIFIKACIE
}
