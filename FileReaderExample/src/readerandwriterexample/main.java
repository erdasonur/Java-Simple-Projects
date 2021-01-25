
package readerandwriterexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class main {

    public static void main(String[] args) {
        //File Reader reads by character
        /*try(Scanner s = new Scanner(new FileReader("file.txt"))){
            while (s.hasNextLine()) {
                //System.out.println("Read " + s.nextLine());
                String[] array = s.nextLine().split(",");
                if (array[1].equals(" Computer Science")){
                    System.out.println("Students : " + array[0]);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReaderExample.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        //Bufferred Reader reads by line
        try(Scanner s = new Scanner(new BufferedReader(new FileReader("file.txt")))){
            while (s.hasNextLine()) {
                //System.out.println("Read " + s.nextLine());
                String[] array = s.nextLine().split(",");
                if (array[1].equals(" Computer Science")){
                    System.out.println("Students : " + array[0]);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt",true))){
            writer.write("\nUtku Yaman, Computer Science");
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
