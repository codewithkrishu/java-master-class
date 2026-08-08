import java.util.*;

public class Program30_HashMapTraversalUsingEntrySet {

    public static void main(String[] args) {

        // Problem 30 - HashMap Traversal using entrySet()

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Vipin", 70);
        map.put("Preet", 86);
        map.put("Rohan", 89);
        map.put("Sawan", 78);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            System.out.println(
                entry.getKey() + " = " + entry.getValue()
            );
        }
    }
}
