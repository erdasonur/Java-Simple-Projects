/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisanlar.inheritance;
import java.util.Scanner;
public class CalisanlarInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try
        {
            System.out.println("Calisanlar Programi");
            System.out.println("Islemler\n1.Yazilimci Islemleri\n2.Yonetici Islemleri\n3.Cikis");
            while(true){
                System.out.print("Islemi seciniz : ");
                int islem = s.nextInt();
                s.nextLine();
                if(islem == 1)
                {
                    Yazilimci y = new Yazilimci("Merhmet","Aras",1,"Java");
                    System.out.println("1.Format At\n2.Bilgileri Goster");
                    System.out.println("Islemi giriniz");
                    int islem2 = s.nextInt();
                    s.nextLine();
                    if(islem2 == 1)
                    {
                        System.out.print("Isletim sistemi : ");
                        String isletim_sistemi = s.nextLine();
                        y.formatAt(isletim_sistemi);
                    }
                    else if(islem2 == 2)
                    {
                        y.bilgileriGoster();
                    }
                    else
                    {
                        System.out.println("Hatali islem secimi");
                    }

                }
                else if(islem == 2)
                {
                    Yonetici y = new Yonetici("Kamil","Arslan",2,100);
                    System.out.println("1.Zam yap\n2.Bilgileri Goster");
                    System.out.println("Islemi giriniz");
                    int islem2 = s.nextInt();
                    s.nextLine();
                    if(islem2 == 1)
                    {
                        System.out.print("Zam miktari : ");
                        int miktar = s.nextInt();
                        y.zamYap(miktar);
                    }
                    else if(islem2 == 2)
                    {
                        y.bilgileriGoster();
                    }
                    else
                    {
                        System.out.println("Hatali islem secimi");
                    }
                }
                else if(islem == 3)
                {
                    System.out.println("Programdan cikiliyor");
                    break;
                }
                else
                {
                    System.out.println("Yanlis islem secildi");
                }
            }
        }
        catch(Exception e){
            System.out.println("Hatali giris");
        }
    }
    
}
