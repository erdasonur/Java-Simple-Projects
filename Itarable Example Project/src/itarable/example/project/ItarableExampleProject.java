
package itarable.example.project;

import java.util.Scanner;


public class ItarableExampleProject {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String options = "Options\n"
                          + "1. Show Channels\n"
                          + "2. Add Channel\n"
                          + "3. Remove Channel\n"
                          + "4. Find out Number of Channels\n"
                          + "Press q to exit.";
        
        RemoteControl remoteControl = new RemoteControl();
        
        while (true) {
            System.out.println(options);
            System.out.print("Enter your option:");
            String option = scanner.nextLine();
            
            if (option.equals("q")) {
                System.out.println("Exiting..");
                break;
            }
            else if (option.equals("1")) {
                showChannels(remoteControl);
            }
            else if (option.equals("2")) {
                System.out.print("Channel to be added : ");
                String nameOfChannel = scanner.nextLine();
                remoteControl.addChannel(nameOfChannel);
            }
            else if (option.equals("3")) {
                System.out.print("Channel to be removed : ");
                String nameOfChannel = scanner.nextLine();
                remoteControl.removeChannel(nameOfChannel);
                
            }
            else if (option.equals("4")) {
                System.out.println("Number of Channels : " + remoteControl.numberOfChannels());
                
            }
            else {
                System.out.println(option);
                System.out.println("Unaccepted operation...");
            }
        }
    }
    
    public static void showChannels(RemoteControl remoteControl) {
        
        if (remoteControl.numberOfChannels()== 0) {
            System.out.println("There is no channel to be shown...");
        }
        else {
            for (String channel : remoteControl) {
                System.out.println("Channel : " + channel);
                
            }
            
        }
        
    }
}