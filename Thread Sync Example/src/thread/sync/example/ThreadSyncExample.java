package thread.sync.example;

public class ThreadSyncExample {
    private int count = 0;
    
    public synchronized void increaseCount(){
        count++;
    }
    
    public void runThreads() throws InterruptedException{
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    //count++;
                    increaseCount();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    //count++;
                    increaseCount();
                }
            }
        });
        
        thread.start();
        thread2.start();
        
        thread.join();
        thread2.join();
        
        System.out.println("Count is : " + count);
    }
    
    public static void main(String[] args) throws InterruptedException {
        ThreadSyncExample tse = new ThreadSyncExample();
        tse.runThreads();
    }
    
}