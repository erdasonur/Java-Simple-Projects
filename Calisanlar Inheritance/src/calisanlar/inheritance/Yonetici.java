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
public class Yonetici extends Calisan{
    
    private int sorumlu_kisi_sayisi;
    
    public Yonetici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Yoneticinin sorumlu oldugu kisi sayisi : " + sorumlu_kisi_sayisi);
    }
    public void zamYap(int zam_miktari){
        System.out.println(getAd()+ " kisisi "+zam_miktari + " tl zam aldi");
    }
    
}
