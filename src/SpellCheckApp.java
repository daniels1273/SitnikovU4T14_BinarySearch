import java.util.Scanner;

public class SpellCheckApp {
    public static void main(String[] args) {
        System.out.println("----------------------------- SPELL CHECKER -------------------------------");
        SpellChecker checker = new SpellChecker(); // create SpellChecker object
        System.out.println("The spell checker dictionary has " + checker.getDictionary().size() + " words in it!");
        System.out.println("Enter a word to look up; if the word is not found, it is not");
        System.out.print("spelled correctly (or is simply not a word), or type q to quit: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        while (!word.equals("q")) {
            if (checker.linearSpellCheck(word)) {
                System.out.println("-- " + word + " WAS found in the dictionary (so it's spelled correctly)");
            } else {
                System.out.println("-- " + word + " was NOT found in the dictionary (so it's not spelled correctly)");
            }
            System.out.print("Enter a word to look up or q to quit: ");
            word = scan.nextLine();
        }
        scan.close();
    }
}