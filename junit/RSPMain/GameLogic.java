
package Rock_Paper_Scissors;

public class GameLogic {

    public String gameLogic(int userInput, int compInput) {
    	int uc=0,sc=0;
        // Draw
        if (userInput == compInput) {
            return "Match Draw";
        }

        // User wins
        if ((userInput == 0 && compInput == 2) ||   // ROCK beats SCISSORS
            (userInput == 1 && compInput == 0) ||   // PAPER beats ROCK
            (userInput == 2 && compInput == 1)) {   // SCISSORS beats PAPER
        	uc++;
        	System.out.println("You score = > "+uc);
            return "You Win with score "+uc;
        }
        sc++;
        System.out.println("System score = > "+sc);
        return "You Lose\n\n System won with score "+sc;
    }
}
