package studios.class2;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> abcTally = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphaArr = alphabet.toCharArray();
        for (char letter : alphaArr){
            abcTally.put(letter, 0);
        }

//        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//        quote.toLowerCase();
//        char[] quoteArr = quote.toCharArray();

        Scanner input = new Scanner(System.in);
        System.out.println("We will count the characters of a string you enter. Please enter a string: ");
        String userQuote = input.nextLine();
        char[] quoteArr = userQuote.toCharArray();

        for (char quoteLtr : quoteArr){
            for (char alphaLtr : alphaArr){
                if (quoteLtr == alphaLtr){
                    abcTally.put(alphaLtr, abcTally.get(alphaLtr)+1);
                }
            }
        }

        for (char finalLetter : abcTally.keySet()){
            System.out.println(finalLetter + ": " + abcTally.get(finalLetter));
        }



        //map.put(key, map.get(key) + 1);
    }
}
