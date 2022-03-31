package Unit5.ScrambledWordsLab;

public class Main {
    public static void main(String[] args) {
        WordScrambler words1 = new WordScrambler();
        WordScrambler words2 = new WordScrambler();

        String [] unMixedWords1 = {"apple", "pear", "this", "cat"};
        String [] unMixedWords2 = {"this", "that", "what", "where", "who", "how"};

        String [] mixedWords1 = words1.mixedWords(unMixedWords1);
        String [] mixedWords2 = words2.mixedWords(unMixedWords2);

        for (String mixedWord : unMixedWords1) {
            System.out.println(mixedWord);
        }
        for (String mixedWord : mixedWords1) {
            System.out.println(mixedWord);
        }

        for (String mixedWord : unMixedWords2) {
            System.out.println(mixedWord);
        }
        for (String mixedWord : mixedWords2) {
            System.out.println(mixedWord);
        }
    }
}
