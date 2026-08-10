import java.util.*;

public class Problem42_RemoveStudentsBelowAverage {

    public static void main(String[] args) {

        // Problem 42 - Remove Students Scoring Below Average

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Aman", 70);
        students.put("Rohit", 90);
        students.put("Karan", 60);
        students.put("Neha", 80);
        students.put("Raj", 50);

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

            if (student.getValue() < average) {
                it.remove();
            }
        }

        System.out.println("Final Map -> " + students);
    }
}
