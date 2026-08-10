import java.util.*;

public class Problem40_AverageMarks {

    public static void main(String[] args) {

        // Problem 40 - Find Average Marks

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Aman", 72);
        marks.put("Rohit", 85);
        marks.put("Karan", 91);
        marks.put("Neha", 68);
        marks.put("Raj", 88);

        int totalMarks = 0;
        int count = 0;

        for (Integer student : marks.values()) {

            totalMarks = totalMarks + student;
            count++;
        }

        double average = (double) totalMarks / count;

        System.out.println("Total Marks -> " + totalMarks);
        System.out.println("Total Students -> " + count);
        System.out.println("Average -> " + average);
    }
}
