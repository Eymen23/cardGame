/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import javax.swing.Icon;

/**
 *
 * @author EYMEN
 */
public class Futbolcu extends Sporcu {

    private int penalti, serbest, kaleciyleKarsiKarsiya;
    private String image;

    public Futbolcu(int penalti, int serbest, int kaleciyleKarsiKarsiya, String sporcuİsim, String sporcuTakim, String image) {
        super(sporcuİsim, sporcuTakim);
        this.penalti = penalti;
        this.serbest = serbest;
        this.kaleciyleKarsiKarsiya = kaleciyleKarsiKarsiya;
        this.image = image;
    }

    @Override
    void sporcuPuaniGoster(int puan) {
        super.sporcuPuaniGoster(puan); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean kartKullanildiMi() {
        return true;
    }

    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getSerbest() {
        return serbest;
    }

    public void setSerbest(int serbest) {
        this.serbest = serbest;
    }

    public int getKaleciyleKarsiKarsiya() {
        return kaleciyleKarsiKarsiya;
    }

    public void setKaleciyleKarsiKarsiya(int kaleciyleKarsiKarsiya) {
        this.kaleciyleKarsiKarsiya = kaleciyleKarsiKarsiya;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
