import java.util.*;

public class StreamReduce {
    public static void main(String[] args) {

        List<Integer> nums =
            Arrays.asList(56, 87, 32, 78, 67, 74);

        int sum =
            nums.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("List -> " + nums);
        System.out.println("Total Sum -> " + sum);
    }
}
