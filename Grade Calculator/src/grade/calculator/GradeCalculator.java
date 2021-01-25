
package grade.calculator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GradeCalculator {

    public static void main(String[] args) {
        try(Scanner s = new Scanner(new BufferedReader(new FileReader("file.txt")));
                BufferedWriter writer = new BufferedWriter(new FileWriter("outputFile.txt"))){
            while (s.hasNextLine()) {
                String str = s.nextLine();
                String[] grades = str.split(",");
                int g1 = Integer.parseInt(grades[1]);
                int g2 = Integer.parseInt(grades[2]);
                int g3 = Integer.parseInt(grades[3]);
                String output = calculateGrade(grades[0], g1, g2, g3);
                writer.write(output + "\n");
            }
           
            
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GradeCalculator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GradeCalculator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static String calculateGrade(String name,int exam1,int exam2,int finalExam) {
    
        String output = "";
        
        double totalGrade = (exam1 * 3 / 10.0) + (exam2 * 3 / 10.0) + (finalExam * 4 / 10.0);
        
        if (totalGrade >= 90) {
            output = name + " letter grade is  AA ...";
        }
        else if (totalGrade >= 85) {
            output = name + "\'s letter grade is BA ...";
            
        }
        else if (totalGrade >= 80) {
            output = name + "\'s letter grade is BB...";
            
        }
        else if (totalGrade >= 75) {
            output = name + "\'s letter grade is CB ...";
            
        }
        else if (totalGrade >= 70) {
            output = name + "\'s letter grade is CC ...";
            
        }
        else if (totalGrade >= 65) {
            output = name + "\'s letter grade is DC ...";
            
        }
        else if (totalGrade >= 60) {
            output = name + "\'s letter grade is DD ...";
            
        }
        else if (totalGrade >= 55) {
            output = name + "\'s letter grade is FD ...";
            
        }
        else {
            output = name + "\'s letter grade is FF ...";
        }
       return output;
       
    
    }
    
}
