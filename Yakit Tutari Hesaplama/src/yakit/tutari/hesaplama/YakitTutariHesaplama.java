/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yakit.tutari.hesaplama;
import java.util.Scanner;
/**
 *
 * @author onure
 */
public class YakitTutariHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double kurus;
        int km;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Arabaniz kilometrede kac kurus yakmaktadir? ");
        kurus = scanner.nextDouble();
        System.out.print("Kac kilometre yol yaptiniz? ");
        km = scanner.nextInt();
        double tutar = km * kurus;
        System.out.println("Toplam Yakit Tutari " + tutar);
    }
    
}
