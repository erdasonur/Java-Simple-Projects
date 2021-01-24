/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idman.programi.log.olusturma;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        int i = 1;
        try(FileWriter file = new FileWriter("log.txt")){
                
            file.write("Idman Programi..\n");
            file.write("Burpee sayisi : " + idman.getBurpee_sayisi());
            file.write("\nPush up sayisi : " + idman.getPushup_sayisi());
            file.write("\nSit up sayisi" + idman.getSitup_sayisi());
            file.write("\nSquat sayisi : " + idman.getSquat_sayisi());
        while(idman.idmanKontrol()){
               
            System.out.println("Hareket turu(Burpee,Pushup,Situp,Squat)");
            String ad = s.nextLine();
            System.out.println("Kac adet");
            int sayi = s.nextInt();
            s.nextLine();
            idman.hareketYap(ad, sayi);
            
            file.write("\n" +  i + ". islem -------------->  Hareket : " + ad + " Sayi : " + sayi);
            i++;
            } 
            
        } catch (IOException ex) {
                Logger.getLogger(IdmanProgrami.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
