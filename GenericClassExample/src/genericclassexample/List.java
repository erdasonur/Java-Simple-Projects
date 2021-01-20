/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclassexample;

/**
 *
 * @author onure
 */
public class List<E> {
    public static <E> void print(E[] array){
        for(E e : array){
            System.out.println(e);
        }
    }
}
