import java.util.*;

public class Problem35_PutIfAbsent {

    public static void main(String[] args) {

        // Problem 35 - putIfAbsent()

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Aman", 80);
        marks.put("Rohit", 75);
        marks.put("Karan", 90);

        System.out.println(
            "Already Exists -> " + marks.putIfAbsent("Aman", 95)
        );

        marks.putIfAbsent("Neha", 85);

        System.out.println("Final Map -> " + marks);
    }
}
