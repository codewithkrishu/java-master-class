import java.util.*;

public class Program32_SumOfAllValues {

    public static void main(String[] args) {

        // Problem 32 - Sum of All Values

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Raghav", 90);
        marks.put("Sunil", 50);
        marks.put("Pinku", 96);
        marks.put("Arun", 70);
        marks.put("Pathak", 80);

        int sum = 0;

        for (Integer mark : marks.values()) {

            System.out.println(mark + " + " + sum);

            sum += mark;
        }

        System.out.println("Total Marks -> " + sum);
    }
}
