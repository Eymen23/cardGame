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
public class Kullanici extends Oyuncu {

    public Kullanici(int oyuncuId, String oyuncuAdi, int skor) {
        super(oyuncuId, oyuncuAdi, skor);
    }

   

    @Override
    void kartSec(Sporcu sporcu) {
        super.kartSec(sporcu); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void skorGoster(int skor) {
        super.skorGoster(skor); //To change body of generated methods, choose Tools | Templates.
    }
    
}
