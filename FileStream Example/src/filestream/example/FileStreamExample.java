package filestream.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileStreamExample {

    private static ArrayList<Integer> content = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        readFile();
        copy("copy.mp3");
        System.out.println("done!");
    }

    public static void readFile() throws IOException {

        FileInputStream file = new FileInputStream("Adele - Hello.mp3");

        int index;
        while ((index = file.read()) != -1) {
            content.add(index);
        }
        file.close();
    }
    
    public static void copy(String fileName) throws FileNotFoundException, IOException {
        FileOutputStream file = new FileOutputStream(fileName);
        
        for (int value : content) {  
            file.write(value);
        }
        file.close();
    }
}
