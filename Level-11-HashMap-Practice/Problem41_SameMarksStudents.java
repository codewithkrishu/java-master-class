import java.util.*;

public class Problem41_SameMarksStudents {

    public static void main(String[] args) {

        // Problem 41 - Find Students Who Got Same Marks

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Aman", 80);
        students.put("Rohit", 75);
        students.put("Karan", 80);
        students.put("Neha", 90);
        students.put("Raj", 75);

        for (Map.Entry<String, Integer> s1
                : students.entrySet()) {

            for (Map.Entry<String, Integer> s2
                    : students.entrySet()) {

                if (!s1.getKey().equals(s2.getKey())
                        && s1.getValue().equals(s2.getValue())) {

                    System.out.println(
                        s1.getKey() + " -> " + s1.getValue()
                    );
                }
            }
        }
    }
}
