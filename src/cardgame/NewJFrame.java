/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import Entities.Basketbolcu;
import Entities.Bilgisayar;
import Entities.Futbolcu;
import Entities.Oyuncu;
import Entities.Sporcu;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;

/**
 *
 * @author EYMEN
 */
//basketbolcu tayfa kontrol  
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    //hataların düzenlenmesi
    private int bilgisayarSkor = 0;
    private int oyuncuSkor = 0;
    private int kartSayisi = 0;
    ArrayList<JButton> buttons = new ArrayList<JButton>();//kullanılan butonlar için
    ArrayList<Sporcu> sporcular = new ArrayList<Sporcu>();//kullanılan kartlar için
    Oyuncu oyuncu = new Oyuncu(1, "Eymen", 0);
    Bilgisayar bilgisayar = new Bilgisayar(1, "Bilgisayar", 0);
    Futbolcu futbolcu1 = new Futbolcu(80, 80, 80, "Alex", "Fenerbahçe", "/icons/alex.png");
    Futbolcu futbolcu2 = new Futbolcu(85, 95, 90, "Sergen", "Beşiktaş", "/icons/sergen.png");
    Futbolcu futbolcu3 = new Futbolcu(95, 90, 95, "Pascal", "Beşiktaş", "/icons/pascal.png");
    Futbolcu futbolcu4 = new Futbolcu(75, 70, 75, "Feyyaz", "Beşiktaş", "/icons/feyyaz.png");
    Futbolcu futbolcu5 = new Futbolcu(80, 85, 80, "Hagi", "Galatasaray", "/icons/hagi.png");
    Futbolcu futbolcu6 = new Futbolcu(85, 75, 80, "Ali", "Beşiktaş", "/icons/ali.png");
    Futbolcu futbolcu7 = new Futbolcu(80, 90, 95, "Metin", "Galatasaray", "/icons/metin.png");
    Futbolcu futbolcu8 = new Futbolcu(95, 75, 80, "Yattara", "Trabzonspor", "/icons/yattara.png");
    Basketbolcu basketbolcu1 = new Basketbolcu(75, 85, 75, "Hidayet", "Türkiye", "/icons/hidayet.png");
    Basketbolcu basketbolcu2 = new Basketbolcu(70, 90, 80, "Jordan", "America", "/icons/jordan.png");
    Basketbolcu basketbolcu3 = new Basketbolcu(75, 85, 80, "Curry", "America", "/icons/curry.png");
    Basketbolcu basketbolcu4 = new Basketbolcu(95, 80, 90, "Kareem ", "America", "/icons/kareem.png");
    Basketbolcu basketbolcu5 = new Basketbolcu(80, 75, 80, "Neil", "England", "/icons/neil.png");
    Basketbolcu basketbolcu6 = new Basketbolcu(85, 85, 75, "Pops", "England", "/icons/pops.png");
    Basketbolcu basketbolcu7 = new Basketbolcu(85, 85, 85, "LeBron", "England", "/icons/lebron.png");
    Basketbolcu basketbolcu8 = new Basketbolcu(80, 85, 75, "Cedi", "Türkiye", "/icons/cedi.png");
    ArrayList<Futbolcu> oyuncununf = new ArrayList<Futbolcu>();
    ArrayList<Basketbolcu> oyuncununb = new ArrayList<Basketbolcu>();
    ArrayList<Futbolcu> bilgisayarinf = new ArrayList<Futbolcu>();
    ArrayList<Basketbolcu> bilgisayarinb = new ArrayList<Basketbolcu>();

    public NewJFrame() {
        this.setLocation(320, 160);
        initComponents();
        ArrayList<Futbolcu> fkart = new ArrayList<Futbolcu>();
        ArrayList<Basketbolcu> bkart = new ArrayList<Basketbolcu>();
        fkart.add(futbolcu1);
        fkart.add(futbolcu2);
        fkart.add(futbolcu3);
        fkart.add(futbolcu4);
        fkart.add(futbolcu5);
        fkart.add(futbolcu6);
        fkart.add(futbolcu7);
        fkart.add(futbolcu8);
        bkart.add(basketbolcu1);
        bkart.add(basketbolcu2);
        bkart.add(basketbolcu3);
        bkart.add(basketbolcu4);
        bkart.add(basketbolcu5);
        bkart.add(basketbolcu6);
        bkart.add(basketbolcu7);
        bkart.add(basketbolcu8);

        gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
        gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
        //bunu constructora ekle//  fbutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcu1.getImage())));
//        for (Basketbolcu basket : bkart) {
//            System.out.println(basket.getSporcuİsim());
//        }
//        System.out.println("***");
//        for (Futbolcu futbol : fkart) {
//            System.out.println(futbol.getSporcuİsim());
//        }
//        System.out.println("---------");
        Collections.shuffle(bkart);
        Collections.shuffle(fkart);
//        for (Basketbolcu basket : bkart) {
//            System.out.println(basket.getSporcuİsim());
//        }
//        System.out.println("***");
//        for (Futbolcu futbol : fkart) {
//            System.out.println(futbol.getSporcuİsim());
//
//        }

        System.out.println("////////////////////oyuncunun futbolcuları/////////");
        for (int i = 0; i < 4; i++) {
            oyuncununf.add(fkart.get(i));

        }
        for (Futbolcu futbolcular : oyuncununf) {
            System.out.println(futbolcular.getSporcuİsim());
        }

        fbutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncununf.get(0).getImage())));
        fbutton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncununf.get(1).getImage())));
        fbutton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncununf.get(2).getImage())));
        fbutton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncununf.get(3).getImage())));

        System.out.println("////////////////////oyuncunun basketbolcuları/////////");
        for (int i = 0; i < 4; i++) {
            oyuncununb.add(bkart.get(i));
        }
        for (Basketbolcu basketbolcular : oyuncununb) {
            System.out.println(basketbolcular.getSporcuİsim());
        }
        bbutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncununb.get(0).getImage())));
        bbutton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncununb.get(1).getImage())));
        bbutton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncununb.get(2).getImage())));
        bbutton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncununb.get(3).getImage())));

        System.out.println("////////////////////bilgisayarın futbolcuları/////////");
        for (int i = 0; i < 4; i++) {
            bilgisayarinf.add(fkart.get(7 - i));

        }
        for (Futbolcu futbolcular : bilgisayarinf) {
            System.out.println(futbolcular.getSporcuİsim());
        }

        System.out.println("////////////////////bilgisayarın basketbolcuları/////////");
        for (int i = 0; i < 4; i++) {
            bilgisayarinb.add(bkart.get(7 - i));

        }
        for (Basketbolcu basketbolcular : bilgisayarinb) {
            System.out.println(basketbolcular.getSporcuİsim());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ccard2 = new javax.swing.JLabel();
        ccard3 = new javax.swing.JLabel();
        ccard4 = new javax.swing.JLabel();
        ccard5 = new javax.swing.JLabel();
        ccard6 = new javax.swing.JLabel();
        ccard7 = new javax.swing.JLabel();
        ccard1 = new javax.swing.JLabel();
        ccard8 = new javax.swing.JLabel();
        gamecard = new javax.swing.JLabel();
        gamecard2 = new javax.swing.JLabel();
        oyunculabel = new javax.swing.JLabel();
        bilgisayarlabel = new javax.swing.JLabel();
        bilgi = new javax.swing.JLabel();
        fbutton1 = new javax.swing.JButton();
        fbutton2 = new javax.swing.JButton();
        fbutton3 = new javax.swing.JButton();
        bbutton1 = new javax.swing.JButton();
        bbutton2 = new javax.swing.JButton();
        bbutton4 = new javax.swing.JButton();
        bbutton3 = new javax.swing.JButton();
        fbutton4 = new javax.swing.JButton();
        pozisyonBilgisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ccard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/questionmark.png"))); // NOI18N

        ccard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/questionmark.png"))); // NOI18N

        ccard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/questionmark.png"))); // NOI18N

        ccard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/questionmark.png"))); // NOI18N

        ccard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/questionmark.png"))); // NOI18N

        ccard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/questionmark.png"))); // NOI18N

        ccard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/questionmark.png"))); // NOI18N

        ccard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/questionmark.png"))); // NOI18N

        oyunculabel.setForeground(new java.awt.Color(255, 51, 51));
        oyunculabel.setText("Oyuncu Skor:");

        bilgisayarlabel.setForeground(new java.awt.Color(255, 51, 51));
        bilgisayarlabel.setText("Bilgisayar skor:");

        bilgi.setForeground(new java.awt.Color(0, 0, 255));
        bilgi.setText("basla");

        fbutton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbutton1ActionPerformed(evt);
            }
        });

        fbutton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbutton2ActionPerformed(evt);
            }
        });

        fbutton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbutton3ActionPerformed(evt);
            }
        });

        bbutton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbutton1ActionPerformed(evt);
            }
        });

        bbutton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbutton2ActionPerformed(evt);
            }
        });

        bbutton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbutton4ActionPerformed(evt);
            }
        });

        bbutton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbutton3ActionPerformed(evt);
            }
        });

        fbutton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbutton4ActionPerformed(evt);
            }
        });

        pozisyonBilgisi.setText("Pozisyon:  Oyuncu: Bilgisayar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fbutton1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fbutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bbutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oyunculabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bilgisayarlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ccard1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ccard2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bilgi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pozisyonBilgisi, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ccard3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(ccard4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(gamecard, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gamecard2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ccard5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(ccard6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ccard7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ccard8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ccard1, ccard2, ccard3, ccard4, ccard5, ccard6, ccard7, ccard8, fbutton1, gamecard, gamecard2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bilgi, pozisyonBilgisi});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccard2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccard3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccard4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccard1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccard5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccard6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccard7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccard8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gamecard, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gamecard2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bilgisayarlabel)
                        .addGap(48, 48, 48)
                        .addComponent(bilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pozisyonBilgisi)
                        .addGap(38, 38, 38)))
                .addComponent(oyunculabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fbutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ccard1, fbutton1});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bilgi, pozisyonBilgisi});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbutton1ActionPerformed
        // TODO add your handling code here:
        int rastgelePozisyon = (int) (Math.random() * 3) + 1;   //1 ise ikilik 2 ise ucluk 3 ise serbest
        int rastgele = (int) (Math.random() * 4);
        System.out.println(rastgele);

        if (buttons.contains(bbutton1)) {
            bilgi.setText("bu kart kullanılmış.");
        } else if (sporcular.contains(bilgisayarinb.get(rastgele))) {
            bilgi.setText("bilgisayar yeni kart seçiyor");
        } else {
            gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncununb.get(0).getImage())));
            gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayarinb.get(rastgele).getImage())));
            if (rastgelePozisyon == 1) {
                pozisyonBilgisi.setText("İkilik Oyuncu: " + oyuncununb.get(0).getIkilik() + " Bilgisayar: " + bilgisayarinb.get(rastgele).getIkilik());
                if (oyuncununb.get(0).getIkilik() > bilgisayarinb.get(rastgele).getIkilik()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);

                    bilgi.setText("Oyuncu kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton1);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                } else if (oyuncununb.get(0).getIkilik() == bilgisayarinb.get(rastgele).getIkilik()) {
                    this.bbutton1.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Basketbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        basketbolEnableFalse();
                    }

                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton1);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                }
            }
            if (rastgelePozisyon == 2) {
                pozisyonBilgisi.setText("Ucluk Oyuncu: " + oyuncununb.get(0).getUcluk() + " Bilgisayar: " + bilgisayarinb.get(rastgele).getUcluk());
                if (oyuncununb.get(0).getUcluk() > bilgisayarinb.get(rastgele).getUcluk()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Oyuncu kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton1);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                } else if (oyuncununb.get(0).getUcluk() == bilgisayarinb.get(rastgele).getUcluk()) {
                    this.bbutton1.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Basketbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        basketbolEnableFalse();
                    }
                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton1);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                }
            }
            if (rastgelePozisyon == 3) {
                pozisyonBilgisi.setText("Serbest A. Oyuncu: " + oyuncununb.get(0).getSerbestAtis() + " Bilgisayar: " + bilgisayarinb.get(rastgele).getSerbestAtis());
                if (oyuncununb.get(0).getSerbestAtis() > bilgisayarinb.get(rastgele).getSerbestAtis()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);

                    bilgi.setText("Oyuncu kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton1);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                } else if (oyuncununb.get(0).getSerbestAtis() == bilgisayarinb.get(rastgele).getSerbestAtis()) {
                    this.bbutton1.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Basketbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        basketbolEnableFalse();
                    }
                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:basketbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton1);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                }
            }
        }

    }//GEN-LAST:event_bbutton1ActionPerformed

    private void bbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbutton2ActionPerformed
        // TODO add your handling code here:
        int rastgelePozisyon = (int) (Math.random() * 3) + 1;   //1 ise ikilik 2 ise ucluk 3 ise serbest
        int rastgele = (int) (Math.random() * 4);
        System.out.println(rastgele);

        if (buttons.contains(bbutton2)) {
            bilgi.setText("bu kart kullanılmış.");
        } else if (sporcular.contains(bilgisayarinb.get(rastgele))) {
            bilgi.setText("bilgisayar yeni kart seçiyor");
        } else {
            gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncununb.get(1).getImage())));
            gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayarinb.get(rastgele).getImage())));
            if (rastgelePozisyon == 1) {
                pozisyonBilgisi.setText("İkilik Oyuncu: " + oyuncununb.get(1).getIkilik() + " Bilgisayar: " + bilgisayarinb.get(rastgele).getIkilik());

                if (oyuncununb.get(1).getIkilik() > bilgisayarinb.get(rastgele).getIkilik()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);

                    bilgi.setText("Oyuncu kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton2);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                } else if (oyuncununb.get(1).getIkilik() == bilgisayarinb.get(rastgele).getIkilik()) {
                    this.bbutton2.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Basketbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        basketbolEnableFalse();
                    }

                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton2);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                }
            }
            if (rastgelePozisyon == 2) {
                pozisyonBilgisi.setText("Ucluk Oyuncu: " + oyuncununb.get(1).getUcluk() + " Bilgisayar: " + bilgisayarinb.get(rastgele).getUcluk());
                if (oyuncununb.get(1).getUcluk() > bilgisayarinb.get(rastgele).getUcluk()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Oyuncu kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton2);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                } else if (oyuncununb.get(1).getUcluk() == bilgisayarinb.get(rastgele).getUcluk()) {
                    this.bbutton2.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Basketbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        basketbolEnableFalse();
                    }
                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton2);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                }
            }
            if (rastgelePozisyon == 3) {
                pozisyonBilgisi.setText("Serbest A. Oyuncu: " + oyuncununb.get(1).getSerbestAtis() + " Bilgisayar: " + bilgisayarinb.get(rastgele).getSerbestAtis());
                if (oyuncununb.get(1).getSerbestAtis() > bilgisayarinb.get(rastgele).getSerbestAtis()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);

                    bilgi.setText("Oyuncu kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton2);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                } else if (oyuncununb.get(1).getSerbestAtis() == bilgisayarinb.get(rastgele).getSerbestAtis()) {
                    this.bbutton2.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Basketbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        basketbolEnableFalse();
                    }
                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:basketbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton2);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                }
            }
        }


    }//GEN-LAST:event_bbutton2ActionPerformed

    private void bbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbutton4ActionPerformed
        // TODO add your handling code here:
        int rastgelePozisyon = (int) (Math.random() * 3) + 1;   //1 ise ikilik 2 ise ucluk 3 ise serbest
        int rastgele = (int) (Math.random() * 4);
        System.out.println(rastgele);

        if (buttons.contains(bbutton4)) {
            bilgi.setText("bu kart kullanılmış.");
        } else if (sporcular.contains(bilgisayarinb.get(rastgele))) {
            bilgi.setText("bilgisayar yeni kart seçiyor");
        } else {
            gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncununb.get(3).getImage())));
            gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayarinb.get(rastgele).getImage())));
            if (rastgelePozisyon == 1) {
                pozisyonBilgisi.setText("İkilik Oyuncu: " + oyuncununb.get(3).getIkilik() + " Bilgisayar: " + bilgisayarinb.get(rastgele).getIkilik());
                if (oyuncununb.get(3).getIkilik() > bilgisayarinb.get(rastgele).getIkilik()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);

                    bilgi.setText("Oyuncu kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton4);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                } else if (oyuncununb.get(3).getIkilik() == bilgisayarinb.get(rastgele).getIkilik()) {
                    this.bbutton4.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Basketbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        basketbolEnableFalse();
                    }

                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton4);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                }
            }
            if (rastgelePozisyon == 2) {
                pozisyonBilgisi.setText("Ucluk Oyuncu: " + oyuncununb.get(3).getUcluk() + " Bilgisayar: " + bilgisayarinb.get(rastgele).getUcluk());
                if (oyuncununb.get(3).getUcluk() > bilgisayarinb.get(rastgele).getUcluk()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Oyuncu kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton4);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                } else if (oyuncununb.get(3).getUcluk() == bilgisayarinb.get(rastgele).getUcluk()) {
                    this.bbutton4.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Basketbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        basketbolEnableFalse();
                    }
                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton4);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                }
            }
            if (rastgelePozisyon == 3) {
                pozisyonBilgisi.setText("Serbest A. Oyuncu: " + oyuncununb.get(2).getSerbestAtis() + " Bilgisayar: " + bilgisayarinb.get(rastgele).getSerbestAtis());
                if (oyuncununb.get(3).getSerbestAtis() > bilgisayarinb.get(rastgele).getSerbestAtis()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);

                    bilgi.setText("Oyuncu kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton4);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                } else if (oyuncununb.get(3).getSerbestAtis() == bilgisayarinb.get(rastgele).getSerbestAtis()) {
                    this.bbutton4.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Basketbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        basketbolEnableFalse();
                    }
                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton4);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                }
            }
        }

    }//GEN-LAST:event_bbutton4ActionPerformed

    private void bbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbutton3ActionPerformed
        // TODO add your handling code here:
        int rastgelePozisyon = (int) (Math.random() * 3) + 1;   //1 ise ikilik 2 ise ucluk 3 ise serbest
        int rastgele = (int) (Math.random() * 4);
        System.out.println(rastgele);

        if (buttons.contains(bbutton3)) {
            bilgi.setText("bu kart kullanılmış.");
        } else if (sporcular.contains(bilgisayarinb.get(rastgele))) {
            bilgi.setText("bilgisayar yeni kart seçiyor");
        } else {
            gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncununb.get(2).getImage())));
            gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayarinb.get(rastgele).getImage())));
            if (rastgelePozisyon == 1) {
                pozisyonBilgisi.setText("İkilik Oyuncu: " + oyuncununb.get(2).getIkilik() + " Bilgisayar: " + bilgisayarinb.get(rastgele).getIkilik());
                if (oyuncununb.get(2).getIkilik() > bilgisayarinb.get(rastgele).getIkilik()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);

                    bilgi.setText("Oyuncu kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton3);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                } else if (oyuncununb.get(2).getIkilik() == bilgisayarinb.get(rastgele).getIkilik()) {
                    this.bbutton3.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Basketbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        basketbolEnableFalse();
                    }

                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton3);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                }
            }
            if (rastgelePozisyon == 2) {
                pozisyonBilgisi.setText("Ucluk Oyuncu: " + oyuncununb.get(2).getUcluk() + " Bilgisayar: " + bilgisayarinb.get(rastgele).getUcluk());
                if (oyuncununb.get(2).getUcluk() > bilgisayarinb.get(rastgele).getUcluk()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Oyuncu kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton3);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                } else if (oyuncununb.get(2).getUcluk() == bilgisayarinb.get(rastgele).getUcluk()) {
                    this.bbutton3.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Basketbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        basketbolEnableFalse();
                    }
                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton3);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();

                    }

                }
            }
            if (rastgelePozisyon == 3) {
                pozisyonBilgisi.setText("Serbest A. Oyuncu: " + oyuncununb.get(2).getSerbestAtis() + " Bilgisayar: " + bilgisayarinb.get(rastgele).getSerbestAtis());
                if (oyuncununb.get(0).getSerbestAtis() > bilgisayarinb.get(rastgele).getSerbestAtis()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);

                    bilgi.setText("Oyuncu kazandı kart sırası:Futbolcu");

                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton3);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();
                    }

                } else if (oyuncununb.get(2).getSerbestAtis() == bilgisayarinb.get(rastgele).getSerbestAtis()) {
                    this.bbutton3.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Basketbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        basketbolEnableFalse();
                    }
                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:basketbolcu");
                    if (Basketbolcu.kartKullanildiMi()) {
                        basketbolEnableFalse();
                        kartSayisi++;
                        buttons.add(bbutton3);
                        sporcular.add(bilgisayarinb.get(rastgele));
                        bbitis();
                    }

                }
            }
        }

    }//GEN-LAST:event_bbutton3ActionPerformed

    private void fbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbutton4ActionPerformed
        // TODO add your handling code here:
        int rastgelePozisyon = (int) (Math.random() * 3) + 1;   //1 ise kaleci 2 ise penaltı 3 ise serbest
        int rastgele = (int) (Math.random() * 4);//rastgele bilgisayar  kartı indexi
        System.out.println(rastgele);

        if (buttons.contains(fbutton4)) {
            bilgi.setText("bu kart kullanılmış.");
        } else if (sporcular.contains(bilgisayarinf.get(rastgele))) {
            bilgi.setText("bilgisayar yeni kart seçiyor");
        } else {
            gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncununf.get(0).getImage())));
            gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayarinf.get(rastgele).getImage())));
            if (rastgelePozisyon == 1) {
                pozisyonBilgisi.setText("Penaltı Oyuncu: " + oyuncununf.get(3).getPenalti() + " Bilgisayar: " + bilgisayarinf.get(rastgele).getPenalti());
                if (oyuncununf.get(3).getPenalti() > bilgisayarinf.get(rastgele).getPenalti()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);

                    bilgi.setText("Oyuncu kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();

                        kartSayisi++;
                        buttons.add(fbutton4);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();

                    }

                } else if (oyuncununf.get(3).getPenalti() == bilgisayarinf.get(rastgele).getPenalti()) {
                    this.fbutton4.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere sıra:Basketbolcu");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Futbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        futbolEnableFalse();

                    }

                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();

                        kartSayisi++;
                        buttons.add(fbutton4);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();

                    }

                }
            }
            if (rastgelePozisyon == 2) {
                pozisyonBilgisi.setText("Kaleciyle KK Oyuncu: " + oyuncununf.get(3).getKaleciyleKarsiKarsiya() + " Bilgisayar: " + bilgisayarinf.get(rastgele).getKaleciyleKarsiKarsiya());
                if (oyuncununf.get(3).getKaleciyleKarsiKarsiya() > bilgisayarinf.get(rastgele).getKaleciyleKarsiKarsiya()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Oyuncu kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();

                        kartSayisi++;
                        buttons.add(fbutton4);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();

                    }

                } else if (oyuncununf.get(3).getKaleciyleKarsiKarsiya() == bilgisayarinf.get(rastgele).getKaleciyleKarsiKarsiya()) {
                    this.fbutton4.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere sıra:Basketbolcu");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Futbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        futbolEnableFalse();

                    }
                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();

                        kartSayisi++;
                        buttons.add(fbutton4);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();

                    }

                }
            }
            if (rastgelePozisyon == 3) {
                pozisyonBilgisi.setText("Serbest Oyuncu: " + oyuncununf.get(3).getSerbest() + " Bilgisayar: " + bilgisayarinf.get(rastgele).getSerbest());
                if (oyuncununf.get(3).getSerbest() > bilgisayarinf.get(rastgele).getSerbest()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);

                    bilgi.setText("Oyuncu kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();

                        kartSayisi++;
                        buttons.add(fbutton4);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();

                    }

                } else if (oyuncununf.get(3).getSerbest() == bilgisayarinf.get(rastgele).getSerbest()) {
                    this.fbutton1.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere sıra:Basketbolcu");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Futbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        futbolEnableFalse();

                    }
                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();
                        kartSayisi++;
                        buttons.add(fbutton4);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();
                    }

                }
            }
        }
    }//GEN-LAST:event_fbutton4ActionPerformed

    private void fbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbutton1ActionPerformed
        // TODO add your handling code here:
        //this.fbutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/questionmark.png")));

        //bilgisayar kart kontrolü dizi ile *// ve kartbittimi kontrolü
        //kullanılan butonu tekrar kullanmama dizi ile
        //burada rastgele. index kullanıldı
        int rastgele = (int) (Math.random() * 4);//rastgele bilgisayar  kartı indexi
        int rastgelePozisyon = (int) (Math.random() * 3) + 1;   //1 ise penaltı 2 ise kaleci 3 ise serbest

        System.out.println(rastgele);

        if (buttons.contains(fbutton1)) {
            bilgi.setText("bu kart kullanılmış.");
        } else if (sporcular.contains(bilgisayarinf.get(rastgele))) {
            bilgi.setText("bilgisayar yeni kart seçiyor");
        } else {
            gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncununf.get(0).getImage())));
            gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayarinf.get(rastgele).getImage())));
            if (rastgelePozisyon == 1) {
                pozisyonBilgisi.setText("Penaltı Oyuncu: " + oyuncununf.get(0).getPenalti() + " Bilgisayar: " + bilgisayarinf.get(rastgele).getPenalti());
                if (oyuncununf.get(0).getPenalti() > bilgisayarinf.get(rastgele).getPenalti()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);

                    bilgi.setText("Oyuncu kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();

                        kartSayisi++;
                        buttons.add(fbutton1);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();

                    }

                } else if (oyuncununf.get(0).getPenalti() == bilgisayarinf.get(rastgele).getPenalti()) {
                    this.fbutton1.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere sıra:Basketbolcu");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Futbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        futbolEnableFalse();

                    }

                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();

                        kartSayisi++;
                        buttons.add(fbutton1);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();

                    }

                }
            }
            if (rastgelePozisyon == 2) {
                pozisyonBilgisi.setText("Kaleciyle KK Oyuncu: " + oyuncununf.get(0).getKaleciyleKarsiKarsiya() + " Bilgisayar: " + bilgisayarinf.get(rastgele).getKaleciyleKarsiKarsiya());
                if (oyuncununf.get(0).getKaleciyleKarsiKarsiya() > bilgisayarinf.get(rastgele).getKaleciyleKarsiKarsiya()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Oyuncu kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();

                        kartSayisi++;
                        buttons.add(fbutton1);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();

                    }

                } else if (oyuncununf.get(0).getKaleciyleKarsiKarsiya() == bilgisayarinf.get(rastgele).getKaleciyleKarsiKarsiya()) {
                    this.fbutton1.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere sıra:Basketbolcu");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Futbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        futbolEnableFalse();

                    }
                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();

                        kartSayisi++;
                        buttons.add(fbutton1);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();

                    }

                }
            }
            if (rastgelePozisyon == 3) {
                pozisyonBilgisi.setText("Serbest Oyuncu: " + oyuncununf.get(0).getSerbest() + " Bilgisayar: " + bilgisayarinf.get(rastgele).getSerbest());
                if (oyuncununf.get(0).getSerbest() > bilgisayarinf.get(rastgele).getSerbest()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);

                    bilgi.setText("Oyuncu kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();
                        kartSayisi++;
                        buttons.add(fbutton1);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();
                    }

                } else if (oyuncununf.get(0).getSerbest() == bilgisayarinf.get(rastgele).getSerbest()) {
                    this.fbutton1.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere sıra:Basketbolcu");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Futbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        futbolEnableFalse();

                    }
                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();

                        kartSayisi++;
                        buttons.add(fbutton1);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();

                    }

                }
            }
        }

    }//GEN-LAST:event_fbutton1ActionPerformed

    private void fbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbutton2ActionPerformed
        // TODO add your handling code here:
        int rastgelePozisyon = (int) (Math.random() * 3) + 1;   //1 ise penaltı 2 ise kaleci 3 ise serbest
        int rastgele = (int) (Math.random() * 4);
        System.out.println(rastgele);

        if (buttons.contains(fbutton2)) {
            bilgi.setText("bu kart kullanılmış.");

        } else if (sporcular.contains(bilgisayarinf.get(rastgele))) {
            bilgi.setText("bilgisayar yeni kart seçiyor");
        } else {
            gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncununf.get(1).getImage())));
            gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayarinf.get(rastgele).getImage())));
            if (rastgelePozisyon == 1) {
                pozisyonBilgisi.setText("Penaltı Oyuncu: " + oyuncununf.get(1).getPenalti() + " Bilgisayar: " + bilgisayarinf.get(rastgele).getPenalti());
                if (oyuncununf.get(1).getPenalti() > bilgisayarinf.get(rastgele).getPenalti()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);

                    bilgi.setText("Oyuncu kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();

                        kartSayisi++;
                        buttons.add(fbutton2);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();

                    }

                } else if (oyuncununf.get(1).getPenalti() == bilgisayarinf.get(rastgele).getPenalti()) {
                    this.fbutton2.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere sıra:Basketbolcu");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Futbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        futbolEnableFalse();

                    }

                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();
                        kartSayisi++;
                        buttons.add(fbutton2);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();
                    }

                }
            }
            if (rastgelePozisyon == 2) {
                pozisyonBilgisi.setText("Kaleciyle KK Oyuncu: " + oyuncununf.get(1).getKaleciyleKarsiKarsiya() + " Bilgisayar: " + bilgisayarinf.get(rastgele).getKaleciyleKarsiKarsiya());

                if (oyuncununf.get(1).getKaleciyleKarsiKarsiya() > bilgisayarinf.get(rastgele).getKaleciyleKarsiKarsiya()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Oyuncu kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();

                        kartSayisi++;
                        buttons.add(fbutton2);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();
                    }

                } else if (oyuncununf.get(1).getKaleciyleKarsiKarsiya() == bilgisayarinf.get(rastgele).getKaleciyleKarsiKarsiya()) {
                    this.fbutton2.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere sıra:Basketbolcu");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Futbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        futbolEnableFalse();

                    }
                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();

                        kartSayisi++;
                        buttons.add(fbutton2);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();

                    }

                }
            }
            if (rastgelePozisyon == 3) {
                pozisyonBilgisi.setText("Serbest Oyuncu: " + oyuncununf.get(1).getSerbest() + " Bilgisayar: " + bilgisayarinf.get(rastgele).getSerbest());
                if (oyuncununf.get(1).getSerbest() > bilgisayarinf.get(rastgele).getSerbest()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);

                    bilgi.setText("Oyuncu kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();

                        kartSayisi++;
                        buttons.add(fbutton2);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();

                    }

                } else if (oyuncununf.get(1).getSerbest() == bilgisayarinf.get(rastgele).getSerbest()) {
                    this.fbutton2.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere sıra:Basketbolcu");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Futbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        futbolEnableFalse();

                    }
                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();

                        kartSayisi++;
                        buttons.add(fbutton2);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();
                    }

                }
            }
        };

    }//GEN-LAST:event_fbutton2ActionPerformed

    private void fbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbutton3ActionPerformed
        // TODO add your handling code here:
        int rastgelePozisyon = (int) (Math.random() * 3) + 1;   //1 ise penaltı 2 ise kaleci 3 ise serbest
        int rastgele = (int) (Math.random() * 4);
        System.out.println(rastgele);

        if (buttons.contains(fbutton3)) {
            bilgi.setText("bu kart kullanılmış.");
        } else if (sporcular.contains(bilgisayarinf.get(rastgele))) {
            bilgi.setText("bilgisayar yeni kart seçiyor");
        } else {
            gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncununf.get(0).getImage())));
            gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayarinf.get(rastgele).getImage())));
            if (rastgelePozisyon == 1) {
                pozisyonBilgisi.setText("Penaltı Oyuncu: " + oyuncununf.get(2).getPenalti() + " Bilgisayar: " + bilgisayarinf.get(rastgele).getPenalti());
                if (oyuncununf.get(2).getPenalti() > bilgisayarinf.get(rastgele).getPenalti()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);

                    bilgi.setText("Oyuncu kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();
                        kartSayisi++;
                        buttons.add(fbutton3);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();
                    }

                } else if (oyuncununf.get(2).getPenalti() == bilgisayarinf.get(rastgele).getPenalti()) {
                    this.fbutton3.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere sıra:Basketbolcu");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Futbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        futbolEnableFalse();
                    }

                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();
                        kartSayisi++;
                        buttons.add(fbutton3);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();
                    }

                }
            }
            if (rastgelePozisyon == 2) {
                pozisyonBilgisi.setText("Kaleciyle KK Oyuncu: " + oyuncununf.get(2).getKaleciyleKarsiKarsiya() + " Bilgisayar: " + bilgisayarinf.get(rastgele).getKaleciyleKarsiKarsiya());
                if (oyuncununf.get(2).getKaleciyleKarsiKarsiya() > bilgisayarinf.get(rastgele).getKaleciyleKarsiKarsiya()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Oyuncu kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();
                        kartSayisi++;
                        buttons.add(fbutton3);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();
                    }

                } else if (oyuncununf.get(2).getKaleciyleKarsiKarsiya() == bilgisayarinf.get(rastgele).getKaleciyleKarsiKarsiya()) {
                    this.fbutton3.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere sıra:Basketbolcu");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Futbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        futbolEnableFalse();

                    }
                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();
                        kartSayisi++;
                        buttons.add(fbutton3);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();
                    }

                }
            }
            if (rastgelePozisyon == 3) {
                pozisyonBilgisi.setText("Serbest Oyuncu: " + oyuncununf.get(2).getSerbest() + " Bilgisayar: " + bilgisayarinf.get(rastgele).getSerbest());
                if (oyuncununf.get(2).getSerbest() > bilgisayarinf.get(rastgele).getSerbest()) {
                    oyuncuSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);

                    bilgi.setText("Oyuncu kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();
                        kartSayisi++;
                        buttons.add(fbutton3);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();
                    }

                } else if (oyuncununf.get(2).getSerbest() == bilgisayarinf.get(rastgele).getSerbest()) {
                    this.fbutton3.setEnabled(true);
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("berabere sıra:Basketbolcu");
                    gamecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    gamecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ball.png")));
                    if (Futbolcu.kartKullanildiMi() && kartSayisi < 7) {
                        futbolEnableFalse();

                    }
                } else {
                    bilgisayarSkor += 10;
                    oyunculabel.setText("Oyuncu skor: " + oyuncuSkor);
                    bilgisayarlabel.setText("Bilgisayar skor: " + bilgisayarSkor);
                    bilgi.setText("Bilgisayar kazandı kart sırası:basketbolcu");

                    if (Futbolcu.kartKullanildiMi()) {
                        futbolEnableFalse();
                        kartSayisi++;
                        buttons.add(fbutton3);
                        sporcular.add(bilgisayarinf.get(rastgele));
                        fBitis();
                    }

                }
            }
        }
    }//GEN-LAST:event_fbutton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbutton1;
    private javax.swing.JButton bbutton2;
    private javax.swing.JButton bbutton3;
    private javax.swing.JButton bbutton4;
    private javax.swing.JLabel bilgi;
    private javax.swing.JLabel bilgisayarlabel;
    private javax.swing.JLabel ccard1;
    private javax.swing.JLabel ccard2;
    private javax.swing.JLabel ccard3;
    private javax.swing.JLabel ccard4;
    private javax.swing.JLabel ccard5;
    private javax.swing.JLabel ccard6;
    private javax.swing.JLabel ccard7;
    private javax.swing.JLabel ccard8;
    private javax.swing.JButton fbutton1;
    private javax.swing.JButton fbutton2;
    private javax.swing.JButton fbutton3;
    private javax.swing.JButton fbutton4;
    private javax.swing.JLabel gamecard;
    private javax.swing.JLabel gamecard2;
    private javax.swing.JLabel oyunculabel;
    private javax.swing.JLabel pozisyonBilgisi;
    // End of variables declaration//GEN-END:variables

    private void allEnabledFalse() {
        this.bbutton1.setEnabled(false);
        this.bbutton2.setEnabled(false);
        this.bbutton3.setEnabled(false);
        this.bbutton4.setEnabled(false);
        this.fbutton1.setEnabled(false);
        this.fbutton2.setEnabled(false);
        this.fbutton3.setEnabled(false);
        this.fbutton4.setEnabled(false);

    }

    private void futbolEnableFalse() {
        this.fbutton1.setEnabled(false);
        this.fbutton2.setEnabled(false);
        this.fbutton3.setEnabled(false);
        this.fbutton4.setEnabled(false);
        this.bbutton1.setEnabled(true);
        this.bbutton2.setEnabled(true);
        this.bbutton3.setEnabled(true);
        this.bbutton4.setEnabled(true);
    }

    private void basketbolEnableFalse() {
        this.bbutton1.setEnabled(false);
        this.bbutton2.setEnabled(false);
        this.bbutton3.setEnabled(false);
        this.bbutton4.setEnabled(false);
        this.fbutton1.setEnabled(true);
        this.fbutton2.setEnabled(true);
        this.fbutton3.setEnabled(true);
        this.fbutton4.setEnabled(true);
    }

    private void futbolEnableTrue() {
        this.fbutton1.setEnabled(true);
        this.fbutton2.setEnabled(true);
        this.fbutton3.setEnabled(true);
        this.fbutton4.setEnabled(true);
    }

    private void basketbolEnableTrue() {
        this.bbutton1.setEnabled(true);
        this.bbutton2.setEnabled(true);
        this.bbutton3.setEnabled(true);
        this.bbutton4.setEnabled(true);
    }

    private void fBitis() {
        if (kartSayisi == 8) {
            futbolEnableTrue();
            if (bilgisayarSkor > oyuncuSkor) {
                bilgi.setText("Oyun bitti kazanan Bilgisayar");
                allEnabledFalse();
            } else if (bilgisayarSkor == oyuncuSkor) {
                bilgi.setText("Oyun Berabere Bitti.");
                allEnabledFalse();
            } else {
                bilgi.setText("Oyun bitti kazanan Oyuncu");
                allEnabledFalse();
            }
        }
    }

    private void bbitis() {
        if (kartSayisi == 8) {
            basketbolEnableTrue();
            if (bilgisayarSkor > oyuncuSkor) {
                bilgi.setText("Oyun bitti kazanan Bilgisayar");
                allEnabledFalse();
            } else if (bilgisayarSkor == oyuncuSkor) {
                bilgi.setText("Oyun Berabere Bitti.");
                allEnabledFalse();
            } else {
                bilgi.setText("Oyun bitti kazanan Oyuncu");
                allEnabledFalse();
            }
        }
    }

}
