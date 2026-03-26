import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SpellChecker {
    private ArrayList<String> dictionary;

    public SpellChecker() {
        dictionary = new ArrayList<>();
        importDictionary();
    }

    public ArrayList<String> getDictionary() {
        return dictionary;
    }

    /** This uses LINEAR search to find a word in dictionary and returns
     *  true if the word is in dictionary and false otherwise.
     *
     *  It also tracks the number of words checked (loop iterations) and
     *  prints that value out before returning.
     */
    public boolean linearSpellCheck(String word) {
        int loopCounter = 0; // for testing
        for (String s : dictionary) {
            loopCounter++; // for testing
            if (word.equals(s)) {
                System.out.println("-- LINEAR SEARCH: Number of words checked (loop iterations): " + loopCounter);
                return true;
            }
        }
        System.out.println("-- LINEAR SEARCH: Number of words checked (loop iterations): " + loopCounter);
        return false;
    }

    /** This uses BINARY search to find a word in dictionary and returns
     *  true if the word is in dictionary and false otherwise.
     *
     *  It also tracks the number of words checked (loop iterations) and
     *  prints that value out before returning.
     */
    public boolean binarySpellCheck(String word) {
        int loopCounter = 0; // for testing
        int leftIdx = 0;
        int rightIdx = dictionary.size() - 1;

        while (rightIdx >= leftIdx){
            loopCounter++;
            int middleIdx = (rightIdx + leftIdx) / 2;
            String curWord = dictionary.get(middleIdx);
            if (curWord.equals(word)){
                System.out.println("-- BINARY SEARCH: Number of words checked (loop iterations): " + loopCounter);
                return true;
            } else {
                if (curWord.compareTo(word) > 0){
                    rightIdx = middleIdx - 1;
                }
                if (curWord.compareTo(word) < 0){
                    leftIdx = middleIdx + 1;
                }
            }
        }
        System.out.println("-- BINARY SEARCH: Number of words checked (loop iterations): " + loopCounter);
        return false;
    }

    // private helper method, called in the constructor, which loads the words
    // from the dictionary.txt text file into the "dictionary" instance variable!
    private void importDictionary() {
        try {
            File myFile = new File("src/dictionary.txt");
            Scanner fileScanner = new Scanner(myFile);
            while (fileScanner.hasNext()){
                String word = fileScanner.nextLine();
                dictionary.add(word);
            }
            System.out.println("\ndictionary.txt file imported successfully!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}