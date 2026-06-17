package Rock_Paper_Scissors;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game extends InputLogic {
        public static void main(String[] args) {
    	List<String> yourOptions = new ArrayList<>();
        yourOptions.add("ROCK");
        yourOptions.add("PAPER");
        yourOptions.add("SCISSORS");

        for (int i = 0; i < yourOptions.size(); i++) {
            System.out.println((i + 1) + " --> " + yourOptions.get(i));
        }    	
        Scanner scanner = new Scanner(System.in);
        inputLogic(yourOptions,scanner);
    }
}