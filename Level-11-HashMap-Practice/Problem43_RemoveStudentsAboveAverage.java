import java.util.*;

public class Problem43_RemoveStudentsAboveAverage {

    public static void main(String[] args) {

        // Problem 43 - Remove Students Scoring Above Average

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Aman", 72);
        students.put("Rohit", 88);
        students.put("Karan", 65);
        students.put("Neha", 95);
        students.put("Raj", 60);

        int total = 0;
        int count = 0;

        for (Integer marks : students.values()) {

            total = total + marks;
            count++;
        }

        double average = (double) total / count;

        System.out.println("Average -> " + average);

        Iterator<Map.Entry<String, Integer>> it =
                students.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<String, Integer> student = it.next();

            if (student.getValue() > average) {

                System.out.println(
                    "Removed Student -> " + student
                );

                it.remove();
            }
        }

        System.out.println("Final Map -> " + students);
    }
}
