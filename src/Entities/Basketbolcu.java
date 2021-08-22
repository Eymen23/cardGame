/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author EYMEN
 */
public class Basketbolcu extends Sporcu {

    private int ikilik, ucluk, serbestAtis;
    private String image;
    public Basketbolcu(int ikilik, int ucluk, int serbestAtis, String sporcuİsim, String sporcuTakim,String image) {
        super(sporcuİsim, sporcuTakim);
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbestAtis = serbestAtis;
        this.image=image;
    }

    @Override
    void sporcuPuaniGoster(int puan) {
        super.sporcuPuaniGoster(puan); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean kartKullanildiMi() {
        return true;
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
