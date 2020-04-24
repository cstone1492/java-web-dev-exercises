package exercises;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;

public class ControlFlowStudio {
    public static void main (String[] args) {
        /*String sentenceToParse = "If the product of two terms is zero then " +
                "common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence or word to parse:");
        String sentenceToParse = input.nextLine();

        HashMap<Character, Integer> characterCounts = new HashMap<>();

        char[] charArray = sentenceToParse.toCharArray();

        for (char c: charArray) {
            if (!characterCounts.containsKey(c)) {
                characterCounts.put(c, 1);
            } else {
                characterCounts.put(c, characterCounts.get(c) + 1);
            }
        };

        for(Map.Entry<Character, Integer> count : characterCounts.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }
}
