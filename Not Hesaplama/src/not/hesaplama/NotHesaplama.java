/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package not.hesaplama;

import java.util.Scanner;

public class NotHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v1,v2,f;
        double gno;
        Scanner s = new Scanner(System.in);
        System.out.print("Vize1 notunuzu giriniz");
        v1 = s.nextInt();
        System.out.print("Vize2 notunuzu giriniz");
        v2 = s.nextInt();
        System.out.print("Final notunuzu giriniz");
        f = s.nextInt();
        System.out.println("Genel ortalama notunuzu giriniz");
        gno = s.nextDouble();
        
        double not = (double) (v1 * 0.3) + (v2 * 0.3) + (f * 0.4);
        
        if(not >= 90)
            System.out.println("AA");
        else if(not >= 85)
            System.out.println("BA");
        else if(not >= 80)
            System.out.println("BB");
        else if(not >= 75)
            System.out.println("CB");
        else if(not >= 70)
            System.out.println("CC");
        else if(not >= 65)
            System.out.println("DC");
        else if(not >= 60)
            System.out.println("DD");
        else if(not >= 55)
            System.out.println("FD");
        else
            System.out.println("FF");
        
        if(not >= 70)
            System.out.println("Dersi Gectiniz");
        else if(not>=65 && gno >= 2.0)
            System.out.println("Dersi Sartli Gectiniz");
        else if(not >= 60 && gno >= 2.5 )
            System.out.println("Dersi Sartli Gectiniz");
        else
            System.out.println("Dersten Kaldiniz");
        

    }
}