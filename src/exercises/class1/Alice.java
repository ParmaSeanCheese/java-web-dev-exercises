package exercises.class1;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without" +
                " pictures or conversation?'";
        aliceQuote = aliceQuote.toLowerCase();

        System.out.println("Please enter a term to search for within Alice's Adventures in Wonderland's first sentence:");
        String term = input.next();
        term = term.toLowerCase();

        if (aliceQuote.contains(term)) {
            Integer index = aliceQuote.indexOf(term);
            Integer length = term.length();
            System.out.println("Your search term first appeared at index " + index + ". Your term is "
                    + length + " character long.");
            String modifiedQuote = aliceQuote.replace(term, "");
            System.out.println(modifiedQuote);
        } else {
            System.out.println("false");
        }
    }
}
