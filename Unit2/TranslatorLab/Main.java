package Unit2.TranslatorLab;
import java.util.Scanner;

/*This program will test the Translator class by asking for input from a user and then using the Class's methods to obfuscate the user's input*/

public class Main {
    public static void main(String[] args) {
        // Initialize Scanner object
        Scanner kboard = new Scanner(System.in);

        // Prompt user for word and collect response
        System.out.print("Enter the word you want translated: ");

        String word = kboard.nextLine();

        // Prompt user for choice between methods
        System.out.print("Enter 1 for pigLatin() and 2 for mySecretLanguage(): ");

        int choice = kboard.nextInt();

        // Close Scanner object
        kboard.close();

        // Initialize Translator object
        Translator translator = new Translator(word);

        // Pick method based on user choice
        if (choice == 1) {
            System.out.println(translator.pigLatin());
        } else if (choice == 2) {
            System.out.println(translator.mySecretLanguage());
        }
    }
}
