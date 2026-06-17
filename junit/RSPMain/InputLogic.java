package Rock_Paper_Scissors;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class InputLogic{
	
public static void inputLogic(List<String> yourOptions,Scanner scanner) {
    	
        
        do { 
        try {
        	       	    		
            System.out.println("Enter your Choice:");
            int userInput = scanner.nextInt();

            if (userInput < 1 || userInput > yourOptions.size()) {
                System.out.println("Invalid Choice");
                continue;
            }

            String userChoice = yourOptions.get(userInput - 1);

            Random random = new Random();
            int randomIndex = random.nextInt(yourOptions.size());
            String systemChoice = yourOptions.get(randomIndex);

            System.out.println("You chose: " + userChoice);
            System.out.println("I chose: " + systemChoice);
            GameLogic logic = new GameLogic();
            String result = logic.gameLogic(userInput - 1, randomIndex);

            System.out.println(result);

        	}
        catch (Exception e) {
            System.out.println("Sorry Invalid choice ");
            scanner.nextLine();   // clear invalid input
            continue;
        }
//               
        char ch;

        while (true) {
            System.out.println("Do you want to continue ?? \ny -> yes\n n -> no");

            ch = scanner.next().charAt(0);

            if (ch == 'y' || ch == 'Y' || ch == 'n' || ch == 'N') {
                break;   // valid input received
            }

            System.out.println("Please enter Y or N.");
        }

        if (ch == 'n' || ch == 'N') {
            break;   // exit the game
        }
        }while(true);
    }
}
