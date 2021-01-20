package treemap.example;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Cumle giriniz");
        String cumle = s.nextLine();
        Map<Character,Integer> frekans = new TreeMap<>();
        for(int i = 0; i < cumle.length(); i++){
            char c = cumle.charAt(i);
            if(frekans.containsKey(c)){
                frekans.replace(c, frekans.get(c) + 1);
            }
            else
                frekans.put(c, 1);
        }
        
        for(Map.Entry<Character, Integer> entry : frekans.entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue() + " tane var");
        }
    }
    
}
