import java.util.*;

public class Program28_HashMapBasic {

    public static void main(String[] args) {

        // Problem 28 - HashMap Basic

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Krishu", 80);
        map.put("Rohit", 75);
        map.put("Karan", 90);
        map.put("Neha", 85);

        System.out.println("Karan Marks -> " + map.get("Karan"));
        System.out.println("Rohit Marks -> " + map.get("Rohit"));

        map.put("Rohit", 91);

        System.out.println("Rohit Marks Updated -> " + map.get("Rohit"));
    }
}
