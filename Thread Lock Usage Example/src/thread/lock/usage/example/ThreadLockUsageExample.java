package thread.lock.usage.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadLockUsageExample {

    Random random = new Random();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    Object lock1 = new Object();
    Object lock2 = new Object();
    
    public void addToList1(){
        synchronized(lock1) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadLockUsageExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        list1.add(random.nextInt(100));
        }
    }
    
    public void addToList2(){
        synchronized(lock2) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadLockUsageExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        list2.add(random.nextInt(100));
        }
    }
    
    public void init(){
        for (int i = 0; i < 1000; i++) {           
            addToList1();
            addToList2();
        }
    }
    
    public void runThread() throws InterruptedException{
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                init();
            }
        });
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                init();
            }
        });
        
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        
        System.out.println("Size of List1 : " + list1.size() + " Size of List2 : " + list2.size());
    }
    
    public static void main(String[] args) throws InterruptedException {
        ThreadLockUsageExample tlue = new ThreadLockUsageExample();
        long time = System.nanoTime();
        tlue.runThread();
        System.out.println("Run time takes " + (System.nanoTime() - time) + " nanosecond");
    }
    
}
