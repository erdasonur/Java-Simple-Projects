package thread.creation.example;


public class ThreadCreationExample {

    
    public static void main(String[] args) {
        
        //createThread1();
        //createThread2();
        //createThread3();
        createThread4();
        
        System.out.println("Main thread is working");
    }
    public static void createThread1(){
        //extends Thread
        Printer printer1 = new Printer("printer1");
        Printer printer2 = new Printer("printer2");
        
        printer1.start();
        printer2.start();
    }
    public static void createThread2(){
        //implements Runnable
        Thread printer1 = new Thread(new Printer2("printer1"));
        Thread printer2 = new Thread(new Printer2("printer2"));
        
        printer1.start();
        printer2.start();
    }
    public static void createThread3(){
        Thread printer1 = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("Thread is running..");
                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.println("Thread is typing : " + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println("Thread is interrupted for some reason.. ");
                    }
                }
                System.out.println("Thread is done");
            }
        });
        printer1.start();
    }
    public static void createThread4(){
        new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("Thread is running..");
                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.println("Thread is typing : " + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println("Thread is interrupted for some reason.. ");
                    }
                }
                System.out.println("Thread is done");
            }
        }).start();
    }
}
