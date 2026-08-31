import java.util.*;

public class StreamLimitSkip {
    public static void main(String[] args) {

        List<Integer> nums =
            Arrays.asList(10, 20, 30, 40, 50);

        System.out.println(nums + " After limit(3)");

        nums.stream()
            .limit(3)
            .forEach(n -> System.out.println(n));

        System.out.println(nums + " skip(2) in starting:");

        nums.stream()
            .skip(2)
            .forEach(n -> System.out.println(n));

        List<Integer> nums2 =
            Arrays.asList(10, 20, 30, 40, 50, 60);

        nums2.stream()
             .skip(2)
             .limit(3)
             .forEach(n -> System.out.println(n));
    }
}
