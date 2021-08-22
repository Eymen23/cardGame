/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author EYMEN
 */
public class Oyuncu {

    private int oyuncuId;
    private String oyuncuAdi;
    private int skor;
    public ArrayList<Oyuncu> kartListesi (Oyuncu oyun){
       ArrayList<Oyuncu> oyuncu=new ArrayList<Oyuncu>();
       return oyuncu; 
    }

    public Oyuncu(int oyuncuId, String oyuncuAdi, int skor) {
        this.oyuncuId = oyuncuId;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }

    void skorGoster(int skor) {};
    void kartSec(Sporcu sporcu){};
}
