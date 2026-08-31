import java.util.*;

public class ComparatorLambda {
    public static void main(String[] args) {

        List<Integer> nums =
            new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50)
            );

        List<Integer> nums2 =
            new ArrayList<>(
                Arrays.asList(50, 40, 30, 20, 10)
            );

        nums.sort((a, b) -> b - a);
        nums2.sort((a, b) -> a - b);

        System.out.println("Descending -> " + nums);
        System.out.println("Ascending -> " + nums2);
    }
}
