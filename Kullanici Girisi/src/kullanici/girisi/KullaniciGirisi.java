/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullanici.girisi;

import java.util.Scanner;
/**
 *
 * @author onure
 */
public class KullaniciGirisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String kullanici,sifre;
        Scanner s = new Scanner(System.in);
        
        int giris_hakki = 3;
        while(giris_hakki>0)
        {
            System.out.println("------------------------");
            System.out.print("Kullanici adi : ");
            kullanici = s.nextLine();
            System.out.print("Sifre : ");
            sifre = s.nextLine();
            System.out.println("************************");
            if(kullanici.equals("onur") && sifre.equals("1234"))
            {
                System.out.println("Giris Basarili");
                break;
            }
            else if(!kullanici.equals("onur") && sifre.equals("1234"))
            {
                System.out.println("Kullanici adi hatali");
                giris_hakki--;
                System.out.println("Kalan giris hakki : "+ giris_hakki);
            }
            else if(kullanici.equals("onur") && !sifre.equals("1234"))
            {
                System.out.println("Sifre Hatali");
                giris_hakki--;
                System.out.println("Kalan giris hakki : "+ giris_hakki);
            }
            else
            {
                System.out.println("Kullanici adi ve sifre hatali");
                giris_hakki--;
                System.out.println("Kalan giris hakki : "+ giris_hakki);
            }
        }
    }
    
}
