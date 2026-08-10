import java.util.*;

public class Problem36_HashMapFrequencyCount {

    public static void main(String[] args) {

        // Problem 36 - HashMap Frequency Count

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("C");
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        languages.add("Java");

        HashMap<String, Integer> count = new HashMap<>();

        for (String language : languages) {

            if (count.containsKey(language)) {
                count.put(language, count.get(language) + 1);
            } else {
                count.put(language, 1);
            }
        }

        System.out.println("Frequency -> " + count);
    }
}
