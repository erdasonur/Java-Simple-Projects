package emergency.service.example.with.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class EmergencyServiceExampleWithPriorityQueue {

    public static void main(String[] args) {
        Queue<Patient> queue = new PriorityQueue<Patient>();
        queue.offer(new Patient("Ahmet", "Headache"));
        queue.offer(new Patient("Mehmet", "Appendicitis"));
        queue.offer(new Patient("Ali", "Stomaache"));
        queue.offer(new Patient("Zeynep", "Appendicitis"));
        queue.offer(new Patient("Kemal", "Stomaache"));
        queue.offer(new Patient("Ayse", "Headache"));
        queue.offer(new Patient("Selin", "Stomaache"));
        
        int i = 1;
        
        while(!queue.isEmpty()){
            System.out.print( i + ".");
            System.out.println(queue.poll());
            i++;
        }
            
    }
    
}
