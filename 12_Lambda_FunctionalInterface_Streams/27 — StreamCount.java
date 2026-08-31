import java.util.*;

public class StreamCount {
    public static void main(String[] args) {

        List<Integer> nums =
            Arrays.asList(10, 20, 30, 40, 50);

        long count =
            nums.stream()
                .filter(n -> n > 20)
                .count();

        System.out.println("List -> " + nums);

        System.out.println(
            "Elements greater than 20 -> " + count
        );

        List<Integer> totalEven =
            Arrays.asList(10, 67, 34, 87, 32, 20, 50);

        count =
            totalEven.stream()
                     .filter(n -> n % 2 == 0)
                     .count();

        System.out.println("Actual List -> " + totalEven);

        System.out.println(
            "Total Even Elements -> " + count
        );
    }
}
