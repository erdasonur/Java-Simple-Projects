/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisanlar.inheritance;

/**
 *
 * @author onure
 */
public class Yazilimci extends Calisan{
    private String diller;
    Yazilimci(String ad, String soyad, int id, String diller){
        super(ad,soyad,id);
        this.diller = diller;
    }
    public void formatAt(String isletim_sistemi){
        System.out.println(getAd() + " " + isletim_sistemi + "'ni yukluyor");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Yazilimcinin bildigi diller : " + diller);
    }
    
    
}
