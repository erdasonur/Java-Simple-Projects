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



public class ATM {

    public static void Fonksiyon(){
        Hesap hesap = new Hesap();
        while(true){
            System.out.println("++++++++++++++++++++++");
            System.out.println("1.Bakiye goruntuleme");
            System.out.println("2.Para Cekme");
            System.out.println("3.Para Yatirma");
            System.out.println("4.Cikis");
            System.out.println("----------------------");
            Scanner s = new Scanner(System.in); 
            String secim = s.nextLine();
            int bitir = 0;
            switch(secim){
                case "1":
                    System.out.println("Bakiyeniz : " + hesap.getBakiye());
                    break;
                case "2":
                    System.out.println("Cekmek isteginiz miktari giriniz");
                    int miktar = s.nextInt();
                    hesap.paraCekme(miktar);
                    break;
                case "3":
                    System.out.println("Yatirmak isteginiz miktari giriniz");
                    int miktarr = s.nextInt();
                    hesap.paraYatirma(miktarr);
                    break;
                case "4":
                    bitir = 1;
                    System.out.println("Cikis yapilmistir..");
                    break;
                default:
                    System.out.println("Yanlis secim");
            }
            if(bitir==1)
                break;
        }
        
    }
    public static void main(String[] args) {
    
        Giris g = new Giris();
        int girisHakki=3;
        while(girisHakki>0){
            
            if(g.GirisYap())
            {
                Fonksiyon();
                break;   
            }
            else
            {
                girisHakki--;
                System.out.println(girisHakki+" giris hakkiniz kalmistir");
            }
            
        }
        if(girisHakki==0)
            System.out.println("Giris hakki bitmistir\nProgram sonlandiriliyor..");
        

    }
    
}
