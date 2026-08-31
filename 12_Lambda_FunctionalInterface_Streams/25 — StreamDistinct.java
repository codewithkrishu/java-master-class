import java.util.*;

public class StreamDistinct {
    public static void main(String[] args) {

        List<Integer> nums =
            Arrays.asList(10, 20, 10, 30, 20, 40);

        nums.stream()
            .distinct()
            .forEach(n -> System.out.println(n));

        System.out.println("============================");

        List<Integer> nums2 =
            Arrays.asList(5, 10, 5, 10, 20, 15);

        System.out.println("Actual List -> " + nums2);

        nums2.stream()
             .distinct()
             .forEach(n ->
                 System.out.println("Unique Number:\n" + n)
             );
    }
}
