/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beden.kutle.endeksi;
import java.util.Scanner;
/**
 *
 * @author onure
 */
public class BedenKutleEndeksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int kilo;
        double endeks,boy;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Boy bilgisi giriniz");
        boy = scanner.nextDouble();
        System.out.println("Kilo bilgisi giriniz");
        kilo = scanner.nextInt();
        endeks = kilo / (boy * boy);
        System.out.println("Girilen kilo ve boya gore endeks : "+endeks);
        if(endeks<16.5)
            System.out.println("Zayif");
        else if(endeks<25)
            System.out.println("Normal");
        else if(endeks < 30)
            System.out.println("Kilolu");
        else
            System.out.println("Obez");
    }
    
}
