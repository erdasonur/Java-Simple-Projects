/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package girilen.pkg3.sayidan.max.bulma;
import java.util.Scanner;
/**
 *
 * @author onure
 */
public class Girilen3SayidanMaxBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s1,s2,s3,max;
        Scanner s = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz");
        s1 = s.nextInt();
        System.out.print("Ikinci sayiyi giriniz");
        s2 = s.nextInt();
        System.out.print("Ucuncu sayiyi giriniz");
        s3 = s.nextInt();
        if(s1 > s2 && s1 > s3){
            max = s1;
        }
        else if(s2 > s1 && s2 >s3){
            max = s2;
        }
        else
            max = s3;
        System.out.println("Max eleman : " + max);
    }
    
}
