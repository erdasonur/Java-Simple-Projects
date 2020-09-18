

package armstrong.sayisi.tespiti;

import java.util.Scanner;

public class ArmstrongSayisiTespiti {

    public static void main(String[] args) {
        int sayi,basamak = 0,armstrong = 0, i = 0;
        System.out.println("Tespit edilecek sayiyi giriniz");
        Scanner s = new Scanner(System.in);
        sayi = s.nextInt();
        int temp = sayi;
        do
        {
            temp /= 10;
            basamak++;
        }while( temp > 0);
        temp = sayi;
        while(i < basamak){
            int mod = temp % 10;
            armstrong += Math.pow(mod, basamak);
            temp /=10;
            i++;
        }
        if(armstrong == sayi)
            System.out.println("Girilen sayi bir Armstrong sayisidir.");
        else 
            System.out.println("Girilen sayi bir Armstrong sayisi degildir.");
    }
    
}
