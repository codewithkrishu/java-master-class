import java.util.*;

public class Problem38_HighestMarksStudent {

    public static void main(String[] args) {

        // Problem 38 - Find Student with Highest Marks

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Aman", 82);
        students.put("Rohit", 91);
        students.put("Karan", 76);
        students.put("Neha", 95);
        students.put("Raj", 88);

        int highest = 0;
        String topStudent = "";

        for (Map.Entry<String, Integer> student
                : students.entrySet()) {

            if (student.getValue() > highest) {

                highest = student.getValue();
                topStudent = student.getKey();
            }
        }

        System.out.println("Top Student -> " + topStudent);
        System.out.println("Highest Marks -> " + highest);
    }
}
