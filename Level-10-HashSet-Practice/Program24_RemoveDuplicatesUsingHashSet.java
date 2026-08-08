import java.util.*;

public class Program24_RemoveDuplicatesUsingHashSet {

    public static void main(String[] args) {

        // Problem 24 - Remove Duplicates using HashSet

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(10);
        set.add(50);
        set.add(40);

        System.out.println("Duplicate values are ignored by HashSet.");

        System.out.println("Size After Ignoring Duplicates -> " + set.size());

        System.out.println("HashSet -> " + set);
    }
}
