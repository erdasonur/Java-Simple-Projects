package dongulerle.atm.programi;

import java.util.Scanner;

public class DongulerleATMProgrami {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("1.Bakiye Sorgulama");
        System.out.println("2.Para Cekme");
        System.out.println("3.Para Yatirma");
        System.out.println("Cikis icin q'a basin");
        int bakiye = 2000;
        while(true){
            System.out.println("Islemlerden birini seciniz");
            String islem = s.nextLine();
            if(islem.equals("q"))
            {
                System.out.println("Cikis islemi gerceklestiriliyor");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz : " + bakiye);
            }
            else if(islem.equals("2")){
                System.out.println("Cekmek istediginiz tutari giriniz");
                int temp = s.nextInt();
                s.nextLine();//dummy
                if(temp > bakiye)
                    System.out.println("Hesabinizda bu kadar bakiye mevcut degil");
                else
                    bakiye -=temp;
            }
            else if(islem.equals("3")){
                System.out.println("Yatirmak istediginiz tutari giriniz");
                int temp = s.nextInt();
                s.nextLine();//dummy
                bakiye +=temp;
            }
            else
                System.out.println("Hatali Giris!!");
            
        }
        System.out.println("Cikis Yapilmistir");
    }
    
}
