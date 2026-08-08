import java.util.*;

public class Program31_HashMapTraversalUsingKeySet {

    public static void main(String[] args) {

        // Problem 31 - HashMap Traversal using keySet()

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("A", 89);
        marks.put("B", 78);
        marks.put("C", 56);
        marks.put("D", 85);

        for (String name : marks.keySet()) {

            System.out.println(name + " = " + marks.get(name));
        }
    }
}
