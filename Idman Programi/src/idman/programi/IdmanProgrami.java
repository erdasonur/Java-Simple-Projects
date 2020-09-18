/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idman.programi;

import java.util.Scanner;
/**
 *
 * @author onure
 */
public class IdmanProgrami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int bs,ps,ss,sqs;
        Scanner s = new Scanner(System.in);
        System.out.println("Idman Programi");
        System.out.println("Burpee\nPushup\nSitup\nSquat");
        System.out.println("Bir idman programi olusturun");
        System.out.print("Burpee sayisi : ");
        bs = s.nextInt();
        System.out.print("Pushup sayisi : ");
        ps = s.nextInt();
        System.out.print("Situp sayisi : ");
        ss = s.nextInt();
        System.out.print("Squat sayisi : ");
        sqs = s.nextInt();
        s.nextLine();
        
        Idman idman = new Idman(bs , ps , ss, sqs);
        
        System.out.println("Idman basliyor");
        
        while(idman.idmanKontrol()){
            System.out.println("Hareket turu(Burpee,Pushup,Situp,Squat)");
            String ad = s.nextLine();
            System.out.println("Kac adet");
            int sayi = s.nextInt();
            s.nextLine();
            idman.hareketYap(ad, sayi);
            
        }
    }
    
}
