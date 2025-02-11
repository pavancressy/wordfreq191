import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
    System.out.println("Type a sentence: ");
    Scanner keyInput = new Scanner(System.in);
    String inputText = keyInput.nextLine();
    String[] setWL = inputText.split(" ");
    int freq = 0;
    for (int i = 0; i < (setWL.length); i++) {
        freq = getWordFrequency(setWL, setWL.length, setWL[i]);
        System.out.println(setWL[i] + ": " + freq + " times.");
    }

    }

    public static int getWordFrequency
            (String[] wordsList, int listSize, String currWord) {
        int wordFrequency = 0;
        Pattern word = Pattern.compile(currWord, Pattern.CASE_INSENSITIVE);
        for (int i = 0; i < listSize; i++) {
            Matcher textInput = word.matcher(wordsList[i]);
            boolean matchFound = textInput.find();
            if (matchFound) {
                wordFrequency++;
            }
        }
        return wordFrequency;
    }
}