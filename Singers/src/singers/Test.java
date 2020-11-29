
package singers;

import java.util.Scanner;

public class Test {
    
    private static Singers singers = new Singers();
    private static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        try{
            int operation;
            while(true){
                operations();
                System.out.println("Choise an operation");
                operation = s.nextInt();
                s.nextLine();
                if(operation == 0){
                    operations();
                }
                else if(operation == 1){
                    singers.showSingers();
                }
                else if(operation == 2){
                    System.out.println("Enter a singer name to add");
                    String name = s.nextLine();
                    singers.addSinger(name);
                }
                else if(operation == 3){
                    System.out.println("Enter the singer position you would like to update");
                    int position = s.nextInt();
                    s.nextLine();
                    System.out.println("Enter a singer name");
                    String name = s.nextLine();
                    singers.updateSinger(name, position);
                }
                else if(operation == 4){
                    System.out.println("Enter a singer position to delete");
                    int position = s.nextInt();
                    s.nextLine();
                    singers.removeSinger(position);
                }
                else if(operation == 5){
                    System.out.println("Enter a singer name to search");
                    String name = s.nextLine();
                    singers.searchSinger(name);
                }
                else if(operation == 6){
                    break;
                }
                else
                    System.out.println("Wrong choise");
            }
        }
        catch(Exception e){
            System.out.println("Wrong enterance");
        }
        
        
    }
    public static void operations(){
        System.out.println("0 - Show operations");
        System.out.println("1 - Show singers");
        System.out.println("2 - Add singer");
        System.out.println("3 - Update singer");
        System.out.println("4 - Remove singer");
        System.out.println("5 - Search singer");
        System.out.println("6 - Exit");
    }
}
