import java.util.*;

public class Problem44_IncreaseMarksBelow60 {

    public static void main(String[] args) {

        // Problem 44 - Increase 10 Marks if Less Than 60

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Aman", 55);
        students.put("Rohit", 72);
        students.put("Karan", 48);
        students.put("Neha", 85);
        students.put("Raj", 63);

        System.out.println("Old Map -> " + students);

        for (Map.Entry<String, Integer> student
                : students.entrySet()) {

            if (student.getValue() < 60) {

                student.setValue(student.getValue() + 10);
            }
        }

        System.out.println("New Updated Map -> " + students);
    }
}
