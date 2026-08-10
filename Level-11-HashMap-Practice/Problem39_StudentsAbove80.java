import java.util.*;

public class Problem39_StudentsAbove80 {

    public static void main(String[] args) {

        // Problem 39 - Students Who Scored Above 80

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Aman", 72);
        marks.put("Rohit", 85);
        marks.put("Karan", 91);
        marks.put("Neha", 68);
        marks.put("Raj", 88);

        System.out.println("Students Above 80:");

        for (Map.Entry<String, Integer> student
                : marks.entrySet()) {

            if (student.getValue() > 80) {

                System.out.println(
                    student.getKey() + " -> " + student.getValue()
                );
            }
        }
    }
}
