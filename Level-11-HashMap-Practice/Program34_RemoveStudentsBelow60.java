import java.util.*;

public class Program34_RemoveStudentsBelow60 {

    public static void main(String[] args) {

        // Problem 34 - Remove All Students with Marks < 60

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Hari", 80);
        map.put("Komal", 45);
        map.put("Raj", 96);
        map.put("Prakash", 56);
        map.put("Anshu", 68);

        Iterator<Map.Entry<String, Integer>> it =
                map.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<String, Integer> student = it.next();

            if (student.getValue() < 60) {

                System.out.println(
                    "Remove Student -> " + student
                );

                it.remove();
            }
        }

        System.out.println("Final Map -> " + map);
    }
}
