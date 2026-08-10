import java.util.*;

public class Problem37_HashMapDuplicateKeys {

    public static void main(String[] args) {

        // Problem 37 - Duplicate Keys in HashMap

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Aman", 80);
        students.put("Rohit", 75);

        // Same key: value will be updated
        students.put("Aman", 80);

        students.put("Karan", 90);

        // Same key again
        students.put("Rohit", 75);

        students.put("Neha", 85);

        System.out.println("Aman Marks -> " + students.get("Aman"));

        students.put("Rohit", 80);

        System.out.println("Rohit Updated Marks -> "
                + students.get("Rohit"));

        System.out.println("Final Data -> " + students);
    }
}
