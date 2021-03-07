package thread.creation.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Printer extends Thread{
    private String name;
    public Printer(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is running..");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(name + " is typing : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Thread is interrupted for some reason.. ");
            }
        }
        System.out.println(name + " is done");
    }
    
}
