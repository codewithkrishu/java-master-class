import java.util.*;

public class Program29_SearchByKeyAndValue {

    public static void main(String[] args) {

        // Problem 29 - Search by Key & Value

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Madhav", 95);
        map.put("Krishna", 90);
        map.put("Krishu", 92);
        map.put("Govind", 80);

        System.out.println(map);

        System.out.println("Krishna Key Present -> "
                + map.containsKey("Krishna"));

        System.out.println("Value 90 Present -> "
                + map.containsValue(90));

        System.out.println("Govind Key Present -> "
                + map.containsKey("Govind"));

        System.out.println("Value 80 Present -> "
                + map.containsValue(80));
    }
}
