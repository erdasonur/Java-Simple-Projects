/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.ArrayList;

/**
 *
 * @author onure
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {2,3,5,5,2,7};
        System.out.println(array[0]);
        for(int i=1; i < array.length ; i++ ){
            int flag = 0;
            for(int j=0; j < i ; j++ ){
            if(array[i] == array[j] ){
                flag = 1;
            }
        }
            if(flag == 0){
                System.out.println(array[i]);
            }
        }
    }
    
}
