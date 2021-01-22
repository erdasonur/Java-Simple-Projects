
package exception.example;

public class UnderAgeException extends RuntimeException{
    public UnderAgeException(String message){
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println("Under age exception!");
    }
    
}
