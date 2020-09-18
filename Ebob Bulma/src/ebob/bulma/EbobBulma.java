/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebob.bulma;

import java.util.Scanner;
/**
 *
 * @author onure
 */
public class EbobBulma {

    
    public static int Ebob(int s1, int s2){
        int ebob = 1;
        for(int i=1; i < s1 ; i++){
            if(s1 % i == 0 && s2 % i == 0)
                ebob = i;
        }
        
        return ebob;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int s1,s2;
        System.out.println("Birinci sayiyi giriniz");
        s1 = s.nextInt();
        System.out.println("Ikinci sayiyi giriniz");
        s2 = s.nextInt();
        System.out.println("Ebob : " + Ebob(s1,s2));
    }
    
}
