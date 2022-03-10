package Unit4.HiddenWordLab;
import java.util.Scanner;

/* Create a main class to test the HiddenWord class by prompting user for input and playing a guessing game */

public class Main {
    public static void main(String[] args) {
        HiddenWord puzzle1 = new HiddenWord("TEST");
        
        int hiddenWordLength = puzzle1.getHiddenWord().length();
        String hint = "";
        String guess = "";

        Scanner kboard = new Scanner(System.in);

        while (guess != hint || guess.length() == 0) {
            System.out.print("Guess a word: ");
            guess = kboard.next();

            if (guess.length() != hiddenWordLength) {
                System.out.println("Guess is not the correct amount of characters.");
                continue;
            }
            
            hint = puzzle1.getHint(guess);

            if (hint.equals(guess)) {
                break;
            }

            System.out.println("Hint: " + hint);
        }

        System.out.println("Congratulations!");
    }
}
