import java.util.*;

public class Program25_CheckDuplicatesUsingHashSet {

    public static void main(String[] args) {

        // Problem 25 - Check Duplicate Exists

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.add("Mango");

        HashSet<String> set = new HashSet<>();

        for (String fruit : list) {

            if (!set.add(fruit)) {
                System.out.println("Duplicate Found -> " + fruit);
            }
        }

        System.out.println("\nFinal HashSet -> " + set);
    }
}
