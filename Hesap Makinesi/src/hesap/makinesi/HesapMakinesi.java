/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesap.makinesi;

/**
 *
 * @author onure
 */

import java.util.Scanner;
public class HesapMakinesi {
    
    public static void main(String[] args) {
        int s1,s2;
        double sonuc = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Islem icin asagidakilerden birini giriniz");
        System.out.println("1.Toplama");
        System.out.println("2.Cikarma");
        System.out.println("3.Carpma");
        System.out.println("4.Bolme");
        String secim = s.nextLine();
        switch(secim){
            case "1":
                System.out.print("Birinci Sayi : ");
                s1 = s.nextInt();
                System.out.print("Ikinci Sayi : ");
                s2 = s.nextInt();
                sonuc = s1 + s2;
                System.out.println("Sonuc : " + sonuc);
                break;
            case "2":
                System.out.print("Birinci Sayi : ");
                s1 = s.nextInt();
                System.out.print("Ikinci Sayi : ");
                s2 = s.nextInt();
                sonuc = s1 - s2;
                System.out.println("Sonuc : " + sonuc);
                break;
            case "3":
                System.out.print("Birinci Sayi : ");
                s1 = s.nextInt();
                System.out.print("Ikinci Sayi : ");
                s2 = s.nextInt();
                sonuc = s1 * s2;
                System.out.println("Sonuc : " + sonuc);
                break;
            case "4":
                System.out.print("Birinci Sayi : ");
                s1 = s.nextInt();
                System.out.print("Ikinci Sayi : ");
                s2 = s.nextInt();
                if(s2!=0)
                    sonuc = (double)s1/s2;
                else
                    System.out.println("Sifira bolme hatasi");
                System.out.println("Sonuc : " + sonuc);
                break;
            default:
                System.out.println("Yanlis giris yapildi");
        }
                
    }
    
}
