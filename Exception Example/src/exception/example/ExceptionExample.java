
package exception.example;

import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args){
        
        int a;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter an age");
            a = s.nextInt();
            try{
                check(a);
            }
            catch(UnderAgeException e){
                //System.out.println("Age can't be lower than 18");
                //System.out.println(e);
                e.printStackTrace();
            }
            
        }
    }
    public static void check(int age) {
        if(age < 18)
            throw new UnderAgeException("Under Age Exception");
    }
    
}
