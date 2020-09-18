/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method.overloading;

/**
 *
 * @author onure
 */

public class MethodOverloading {

    /**
     * @param args the command line arguments
     */
    
    public static void func(int a, int b){
        System.out.println("Toplam : " +(a+b));
    }
    public static void func(double a, double b){
        System.out.println("Toplam : " + (double)(a+b));
    }
    public static void func(int a, int b, int c){
        System.out.println("Toplam : " +(a+b+c));
    }
    public static void func(String a, String b){
        System.out.println("Metin : " +a+" "+b);
    }
    public static void func(String a, int b){
        System.out.println("Metin : " +a+" "+b);
    }
    public static void main(String[] args) {
        System.out.println("Method Overloading Example");
        func(2,3);
        func(2.14,3.15);
        func(1,2,3);
        func("hi","it's me");
        func("hi",7);
        
    }
    
}
