package Unit4.HiddenWordLab;

/* Create the HiddenWord class with a hiddenWord instance variable and a getHiddenWord and getHint method */

public class HiddenWord {
    // Instance variables
    String hiddenWord;
    String hint;

    // Constructor
    public HiddenWord(String hw) {
        hiddenWord = hw;
    }

    // getHiddenWord method
    public String getHiddenWord() {
        return hiddenWord;
    }

    // getHint method
    public String getHint(String guess) {
        hint = "";
            
        for(int i = 0; i < hiddenWord.length(); i++) {
            if (guess.charAt(i) == hiddenWord.charAt(i)) {
                hint += hiddenWord.charAt(i);
            } else if (hiddenWord.contains(Character.toString(guess.charAt(i)))) {
                hint += "+";
            } else {
                hint += "*";
            }
        }

        return hint;
    }
}
