package Unit2.TranslatorLab;

public class Translator {
    // Instance variables
    String word;
    String temp = "";

    // Constructor
    public Translator(String w) {
        word = w;
    }

    // Methods
    public boolean isVowel(char c) {
        if (Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'i' || Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'u') {
            return true;
        }
        return false;
    }

    public String pigLatin() {
        // Check if first character is a vowel
        if (isVowel(word.charAt(0)) == true) {
            // Return current word and "way" concatenated together
            return word + "way";
        }
        for (int i = 0; i < word.length(); i++) {
            // Check if current character is a vowel
            if (isVowel(word.charAt(i)) == true) {
                // Concatenate remaining word, temp variable, and "ay" and return that String
                return word.substring(i) + temp + "ay";
            }
            // Add current character to temp variable
            temp += word.charAt(i);
        }
        return "Invalid word";
    }

    public String mySecretLanguage() {
        // Return reversed string
        for (int i = 0; i < word.length(); i++) {
            // Take each character and put it at the front of the temp variable
            temp = word.charAt(i) + temp;
        }
        String reversedWord = temp;
        return reversedWord;
    }
}