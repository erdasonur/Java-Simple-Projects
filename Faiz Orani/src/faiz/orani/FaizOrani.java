/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faiz.orani;

import java.util.Scanner;
/**
 *
 * @author onure
 */
public class FaizOrani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double anapara,faiz_orani=0.06;
        int vade;
        Scanner s = new Scanner(System.in);
        System.out.print("Anapara : ");
        anapara = s.nextDouble();
        System.out.print("Vade : ");
        vade = s.nextInt();
        
        for(int i = 1; i <= vade ; i++){
            anapara += anapara * faiz_orani;
            System.out.println(i +". yilin sonunda toplam paraniz " + anapara);
        }
        
        
        
    }
    
}
