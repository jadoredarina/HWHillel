package nabirslov;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class unikalni {

    public static void main(String[] args) {
        processString("масло, масло, ковбаса, молоко");
    }

    public static void processString(String input) {
        String[] words = input.split("[,\\s]+");

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        Set<String> result = new HashSet<>();
        for (String word : uniqueWords) {
            result.add(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());
        }

        for (String word : result) {
            System.out.println(word);
        }
    }
}
