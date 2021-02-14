package Hra_GUI;

import Hra_Opatrenia.Opatrenia;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;

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
    
    private String aktualnyDatum ="2020-01-01";
    
    public HraciPanel(Opatrenia opatrenia, Hra hra) {
        this.nadtsaveniaJFrame();
        this.opatrenia = opatrenia;
        this.hra = hra;
        //this.pozadieUvod.setVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hlavnyPanel = new javax.swing.JPanel();
        start = new javax.swing.JLabel();
        pozadieUvod = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();
        pozadie = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hlavnyPanel.setPreferredSize(new java.awt.Dimension(1400, 750));
        hlavnyPanel.setLayout(null);

        start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startMouseClicked(evt);
            }
        });
        hlavnyPanel.add(start);
        start.setBounds(950, 610, 60, 50);

        pozadieUvod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/Pozadie_uvod.png"))); // NOI18N
        hlavnyPanel.add(pozadieUvod);
        pozadieUvod.setBounds(-1360, 570, 1400, 720);

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
        KR_Bratislavsky.setBounds(1020, 650, 40, 20);

        KR_Trnavsky.setForeground(new java.awt.Color(0, 0, 0));
        KR_Trnavsky.setText("0");
        hlavnyPanel.add(KR_Trnavsky);
        KR_Trnavsky.setBounds(1050, 680, 41, 16);

        KR_Trenciansky.setForeground(new java.awt.Color(0, 0, 0));
        KR_Trenciansky.setText("0");
        hlavnyPanel.add(KR_Trenciansky);
        KR_Trenciansky.setBounds(1080, 600, 50, 16);

        KR_Nitriansky.setForeground(new java.awt.Color(0, 0, 0));
        KR_Nitriansky.setText("0");
        hlavnyPanel.add(KR_Nitriansky);
        KR_Nitriansky.setBounds(1100, 660, 40, 16);

        KR_Zilinsky.setForeground(new java.awt.Color(0, 0, 0));
        KR_Zilinsky.setText("0");
        hlavnyPanel.add(KR_Zilinsky);
        KR_Zilinsky.setBounds(1160, 560, 60, 16);

        KR_BanskoBystricky.setForeground(new java.awt.Color(0, 0, 0));
        KR_BanskoBystricky.setText("0");
        hlavnyPanel.add(KR_BanskoBystricky);
        KR_BanskoBystricky.setBounds(1190, 620, 60, 16);

        KR_Presovsky.setForeground(new java.awt.Color(0, 0, 0));
        KR_Presovsky.setText("0");
        hlavnyPanel.add(KR_Presovsky);
        KR_Presovsky.setBounds(1300, 550, 50, 16);

        KR_Kosicky.setForeground(new java.awt.Color(0, 0, 0));
        KR_Kosicky.setText("0");
        hlavnyPanel.add(KR_Kosicky);
        KR_Kosicky.setBounds(1300, 590, 41, 16);
        hlavnyPanel.add(Hlasky);
        Hlasky.setBounds(220, 600, 330, 100);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(229, 229, 229));
        jLabel1.setText("jLabel1");
        hlavnyPanel.add(jLabel1);
        jLabel1.setBounds(270, 66, 460, 20);

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
            this.opatrenia.getHranice().zapnutie();
            if (!rusko) {
                BTNI_Rusko_Hranice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ruska_Ractive.png")));
            }else{
                BTNI_Rusko_Hranice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/ruska_active.png")));
            }
        }else{
            hranice = false;
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
            this.opatrenia.getZatvorenieKrajov().zapnutie();
            BTNI_ZavKraje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/kraje_active.png")));
        }else{
            uzavretieKrajov = false;
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
        this.menu = ENadstavenieMenu.SOCIALNE_SIETE;
        this.BTNI_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/menu_soc_siete.png")));
    }//GEN-LAST:event_M_Soc_sieteMouseClicked

    private void M_PrehladMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_PrehladMouseClicked
        this.menu = ENadstavenieMenu.PREHLAD;
        this.BTNI_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/menu_Prehlad.png")));
    }//GEN-LAST:event_M_PrehladMouseClicked

    private void M_SpravyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_SpravyMouseClicked
        this.menu = ENadstavenieMenu.SPRAVY;
        this.BTNI_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/menu_spravy.png")));
    }//GEN-LAST:event_M_SpravyMouseClicked

    private void M_NotifikacieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_NotifikacieMouseClicked
        this.menu = ENadstavenieMenu.NOTIFIKACIE;
        this.BTNI_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Kresbicky/menu_Notifikacie.png")));
    }//GEN-LAST:event_M_NotifikacieMouseClicked

    private void startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseClicked
        this.pozadieUvod.setVisible(false);  
        //this.hra.setHranie(true);
        //this.hra.zacniHru();
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
        this.P_nstavNemocnice.setText(""+pocet);
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
    private javax.swing.JLabel M_Notifikacie;
    private javax.swing.JLabel M_Prehlad;
    private javax.swing.JLabel M_Soc_siete;
    private javax.swing.JLabel M_Spravy;
    private javax.swing.JLabel P_nakazeniZaDen;
    private javax.swing.JLabel P_nstavNemocnice;
    private javax.swing.JLabel P_pocetUmrti;
    private javax.swing.JLabel P_pocetZaockovanych;
    private javax.swing.JLabel P_spoocenskaStabilita;
    private javax.swing.JLabel P_vsetciNakazeni;
    private javax.swing.JLabel T_Opatrenia;
    private javax.swing.JPanel hlavnyPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel pozadie;
    private javax.swing.JLabel pozadieUvod;
    private javax.swing.JLabel start;
    // End of variables declaration//GEN-END:variables

    public Hra getHra() {
        return hra;
    }
    
    public void BratislavskyPocet(int pocet){
        this.KR_Bratislavsky.setText(""+pocet);
    }
    
    public void TrnavskyPocet(int pocet){
        this.KR_Trnavsky.setText(""+pocet);
    }
    
    public void TrencianskyPocet(int pocet){
        this.KR_Trenciansky.setText(""+pocet);
    }
    
    public void NitrianskyPocet(int pocet){
        this.KR_Nitriansky.setText(""+pocet);
    }
    
    public void ZilinskyPocet(int pocet){
        this.KR_Zilinsky.setText(""+pocet);
    }
    
    public void BanskobystrickyPocet(int pocet){
        this.KR_BanskoBystricky.setText(""+pocet);
    }
    
    public void PresovskyPocet(int pocet){
        this.KR_Presovsky.setText(""+pocet);
    }
    
    public void KosickykyPocet(int pocet){
        this.KR_Kosicky.setText(""+pocet);
    }
    
    public void napisHlasku(String menoHlasky){
        this.Hlasky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRA_Hlasky_Upozornenia/"+menoHlasky+".png")));
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