package functional.pkginterface.example;

/**
 *
 * @author onure
 */
public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Greetings " + name);
            }
        };
        gm.greet("Onur");
        
        GreetingMessage gm2 = (String name) -> {
            System.out.println("Greeting " + name);
        };
        
        gm2.greet("Onur");
        
        Message m = () -> {
            System.out.println("Message");
        };
        
        m.printMessage();
    }
    
}
