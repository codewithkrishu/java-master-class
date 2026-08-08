import java.util.*;

public class Program26_UnionOfTwoSets {

    public static void main(String[] args) {

        // Problem 26 - Union of Two Sets

        HashSet<Integer> set1 = new HashSet<>();

        set1.add(10);
        set1.add(20);
        set1.add(30);

        HashSet<Integer> set2 = new HashSet<>();

        set2.add(30);
        set2.add(40);
        set2.add(50);

        System.out.println("Set 1 -> " + set1);
        System.out.println("Set 2 -> " + set2);

        set1.addAll(set2);

        System.out.println("Union of Set 1 and Set 2 -> " + set1);
    }
}
