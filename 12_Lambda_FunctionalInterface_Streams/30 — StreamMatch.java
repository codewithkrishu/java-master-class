import java.util.*;

public class StreamMatch {
    public static void main(String[] args) {

        List<Integer> nums =
            Arrays.asList(5, 10, 15, 20, 25, 30);

        boolean result =
            nums.stream()
                .anyMatch(n -> n > 30);

        System.out.println("List -> " + nums);
        System.out.println(
            "Is any element greater than 30 -> " + result
        );

        boolean result2 =
            nums.stream()
                .allMatch(n -> n > 0);

        System.out.println(
            "Are all elements greater than 0 -> " + result2
        );

        boolean result3 =
            nums.stream()
                .noneMatch(n -> n < 0);

        System.out.println(
            "Are no elements less than 0 -> " + result3
        );
    }
}
