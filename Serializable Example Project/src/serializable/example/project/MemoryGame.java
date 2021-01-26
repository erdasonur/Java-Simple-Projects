/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializable.example.project;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author onure
 */
public class MemoryGame {

    private static Card[][] Cards = new Card[4][4];
    
    public static void getFromSavedGame() {
        Scanner s = new Scanner(System.in);
        File file = new File("record.bin");
        
        if(file.exists()){
            System.out.println("You have saved game. To  continue with it enter yes");
            String str = s.nextLine();
            if(str.equalsIgnoreCase("yes")){
                Cards = RecordGame.getSavedGame();
                return;
            }
        }
        
        Cards[0][0] = new Card('A');
        Cards[0][1] = new Card('F');
        Cards[0][2] = new Card('C');
        Cards[0][3] = new Card('D');
        Cards[1][0] = new Card('H');
        Cards[1][1] = new Card('B');
        Cards[1][2] = new Card('E');
        Cards[1][3] = new Card('G');
        Cards[2][0] = new Card('E');
        Cards[2][1] = new Card('G');
        Cards[2][2] = new Card('F');
        Cards[2][3] = new Card('B');
        Cards[3][0] = new Card('C');
        Cards[3][1] = new Card('A');
        Cards[3][2] = new Card('D');
        Cards[3][3] = new Card('H');
        
        
    }
    
    public static void main(String[] args) {
        
        
        
        try{
            
            Scanner s = new Scanner(System.in);
            getFromSavedGame();
            gameBoard();
            while(isGameOver() == false){
                System.out.println("Enter 'q' to exit");
                String exit = s.nextLine();
                if(exit.equalsIgnoreCase("q"))
                {
                    System.out.println("Enter 'Yes' to save the game");
                    String e = s.nextLine();
                    if(e.equalsIgnoreCase("Yes")){
                        RecordGame.saveTheGame(Cards);
                    }
                    else
                        System.out.println("Game wasn't saved");
                    System.out.println("Exiting from game");
                    break;
                }
                estimation();
            }
        }
        catch(Exception e){
            System.out.println("Something went wrong!! Try it again..");
        }
        
    }
    
    public static void estimation(){
        Scanner s = new Scanner(System.in);
        System.out.println("First Estimation (Enter i and j values with a space)");
        int i1 = s.nextInt();
        int j1 = s.nextInt();
        Cards[i1][j1].setEstimation(true);
        gameBoard();
        System.out.println("Second Estimation (Enter i and j values with a space)");
        int i2 = s.nextInt();
        int j2 = s.nextInt();
        
        if(Cards[i1][j1].getValue() == Cards[i2][j2].getValue()){
            Cards[i2][j2].setEstimation(true);
        }
        else{
            Cards[i1][j1].setEstimation(false);
        }
        
    }
    
    public static boolean isGameOver(){
        for(int i = 0; i < 4; i++){
            
            for(int j = 0; j < 4; j++){
                if(Cards[i][j].isEstimation() == false){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void gameBoard(){
        System.out.println(" ==================");
        for(int i = 0; i < 4; i++){
            
            for(int j = 0; j < 4; j++){
                if(Cards[i][j].isEstimation()){
                    System.out.print(" |" + Cards[i][j].getValue() + "| ");
                }
                else{
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
        System.out.println(" ==================");
    }
    
}
