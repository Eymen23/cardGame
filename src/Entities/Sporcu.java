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
public class Sporcu {
     private String sporcuİsim;
     private String sporcuTakim;

    public Sporcu(String sporcuİsim, String sporcuTakim) {
        this.sporcuİsim = sporcuİsim;
        this.sporcuTakim = sporcuTakim;
    }

//    public Sporcu() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public String getSporcuİsim() {
        return sporcuİsim;
    }

    public void setSporcuİsim(String sporcuİsim) {
        this.sporcuİsim = sporcuİsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }
     
     void sporcuPuaniGoster(int puan){};
}
