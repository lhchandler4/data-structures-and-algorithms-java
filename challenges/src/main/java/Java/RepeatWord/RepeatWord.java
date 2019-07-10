package Java.RepeatWord;

import java.util.HashMap;

public class RepeatWord {
    public static String repeatWord(String input) {
        String indivWord[] = input.split(" ");
        String current = "";
        HashMap<String, Integer> wordsHash = new HashMap<>();
        for (String palabra: indivWord) {
            current = palabra.toLowerCase().replaceAll("[^a-zA-Z]+$", "");
            if (wordsHash.containsKey(current)) {
                return current;
            } else if (input == "") {
                return ("Namaste");
            } else {
                wordsHash.put(current, 1);
            }
        }
        return null;
    }
}
