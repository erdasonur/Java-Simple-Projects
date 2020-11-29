
package beybladeexample;
import java.util.Scanner;
public class BeybladeExample {

    public static void main(String[] args) {
        
        System.out.println("Beyblade programina hosgeldiniz");
        System.out.println("Cikis icin q'ya basiniz ");
        
        Scanner s = new Scanner(System.in);
        
        while(true){
            System.out.println("Hangi beyblade uretmek istiyorsunuz");
            String islem = s.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan cikiliyor");
                break;
            }
            else{
                BeybladeFabrikasi f = new BeybladeFabrikasi();
                Beyblade b = f.beybladeUret(islem);
                if(b == null){
                    System.out.println("Gecerli bir beyblade ismi girin..");
                }
                else{
                    b.bilgileriGoster();
                    b.saldir();
                    b.kutsalCanavarOrtayaCikar();
                    
                }
            }
        }
    }
    
}
