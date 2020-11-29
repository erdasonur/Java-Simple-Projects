/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citytour;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author onure
 */
public class CityTour {

    public static void process(){
        System.out.println("0-Show processes");
        System.out.println("1-Go to the next city");
        System.out.println("2-Go to the previous city");
        System.out.println("3-Exit");
    }
    
    public static void cityTour(LinkedList<String> cities){
        
        ListIterator<String> iterator = cities.listIterator();
        Scanner s = new Scanner(System.in);
        boolean exit = false;
        process();
        while(!exit){
            int selection = s.nextInt();
            switch(selection){
                case 0:
                    process();
                    break;
                case 1:
                    if(iterator.hasNext()){
                        System.out.println("Going to the next city : " + iterator.next());
                    }
                    else
                        System.out.println("There is no city to go");
                    break;
                case 2:
                    if(iterator.hasPrevious()){
                        System.out.println("Going to the previous city : " + iterator.previous());
                    }
                    else
                        System.out.println("There is no city to go");
                    break;  
                    
                case 3:
                    exit = true;
                    System.out.println("Exit");
                    
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<String>();
        
        cities.add("Istanbul");
        cities.add("Ankara");
        cities.add("Izmir");
        
        cityTour(cities);
        
    }
    
}
