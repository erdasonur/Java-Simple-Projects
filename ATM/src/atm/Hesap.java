/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author onure
 */
public class Hesap {
    private String kullanici_adi;
    private String sifre;
    private int bakiye;
    
    Hesap(){
        kullanici_adi = "onur";
        sifre = "1234";
        bakiye=1000;
    }
    public String getKulanniciAdi(){
        return kullanici_adi;
    }
    public String getSifre(){
        return sifre;
    }
    public void setBakiye(int bakiye){
        this.bakiye = bakiye;
    }
    public int getBakiye(){
        return bakiye;
    }
    public void paraYatirma(int miktar){
        bakiye += miktar;
        System.out.println("Para yatirma islemi basarili\nCekilen tutar : "+miktar);
    }
    public void paraCekme(int miktar){
        if(miktar > 1500)
            System.out.println("Gunluk para cekme limiti 1500 Tl");
        else if(miktar > bakiye)
            System.out.println("Hesabinizda bu kadar para bulunmamaktadir");
        else
        {
            bakiye -= miktar;
            System.out.println("Para cekme islemi basarili\nCekilen tutar : "+miktar);
        }
    }
}
