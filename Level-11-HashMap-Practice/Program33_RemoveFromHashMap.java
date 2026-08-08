import java.util.*;

public class Program33_RemoveFromHashMap {

    public static void main(String[] args) {

        // Problem 33 - Remove from HashMap

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Hari", 80);
        map.put("Komal", 90);
        map.put("Raj", 96);
        map.put("Prakash", 87);
        map.put("Anshu", 68);

        map.remove("Raj");

        System.out.println("Final Map -> " + map);

        System.out.println("Raj Present? "
                + map.containsKey("Raj"));
    }
}
