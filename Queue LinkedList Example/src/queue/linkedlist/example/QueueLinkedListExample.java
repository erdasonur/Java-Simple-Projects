
package queue.linkedlist.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListExample {

    public static void main(String[] args) throws InterruptedException {
        
        Queue<String> queue = new LinkedList<String>();
        int random = (int)(Math.random() * 10 +1);
        queue.offer("Ali");
        queue.offer("Ayse");
        queue.offer("Ahmet");
        queue.offer("Asli");
        queue.offer("Mehmet");
        queue.offer("Mevlude");
        queue.offer("Meral");
        queue.offer("Mahmut");
        queue.offer("Kemal");
        queue.offer("Kadriye");
        Thread.sleep(3000);
        function(queue, random);
    }
    public static void function(Queue<String> q, int r) throws InterruptedException{
        System.out.println("Everyone is on queue to get his/her item");
        while(r > 0){
            System.out.println(q.poll() + " got his/her item.");
            Thread.sleep(1000);
            r--;
        }
        System.out.println("No more item left");
    }
    
}
