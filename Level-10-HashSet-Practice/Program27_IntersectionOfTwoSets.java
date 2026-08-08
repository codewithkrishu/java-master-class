import java.util.*;

public class Program27_IntersectionOfTwoSets {

    public static void main(String[] args) {

        // Problem 27 - Intersection of Two Sets

        HashSet<Integer> set1 = new HashSet<>();

        set1.add(10);
        set1.add(30);
        set1.add(20);
        set1.add(40);

        HashSet<Integer> set2 = new HashSet<>();

        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);

        System.out.println("Set 1 -> " + set1);
        System.out.println("Set 2 -> " + set2);

        set1.retainAll(set2);

        System.out.println("Intersection of Two Sets -> " + set1);
    }
}
