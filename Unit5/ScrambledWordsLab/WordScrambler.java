package Unit5.ScrambledWordsLab;

public class WordScrambler {
    public WordScrambler() {}

    public String recombine(String str1, String str2) {
        String p1 = str1.substring(0, str1.length() / 2);
        String p2 = str2.substring(str2.length() / 2, str2.length());

        return p1 + p2;
    }

    public String[] mixedWords(String[] arr) {
        String [] mixedWords = new String[arr.length];
        
        for (int i = 0; i < arr.length; i += 2) {
            mixedWords[i] = recombine(arr[i], arr[i+1]);
            mixedWords[i+1] = recombine(arr[i+1], arr[i]);
        }

        return mixedWords;
    }
}
