/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;
/**
 *
 * @author onure
 */
public class Giris {
    
    public boolean GirisYap(){
    String kullanici_adi,sifre;
    Scanner s = new Scanner(System.in);
    System.out.print("Kullanici Adi : ");
    Hesap h = new Hesap();
    kullanici_adi = s.nextLine();
    System.out.print("Sifre : ");
    sifre = s.nextLine();
    if(kullanici_adi.equals(h.getKulanniciAdi()))
        if(sifre.equals(h.getSifre()))
            return true;
    return false;
    }
    
}
