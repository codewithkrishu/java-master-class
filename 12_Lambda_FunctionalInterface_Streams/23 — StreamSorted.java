import java.util.*;

public class StreamSorted {
    public static void main(String[] args) {

        List<Integer> nums =
            Arrays.asList(40, 10, 30, 20);

        nums.stream()
            .sorted()
            .forEach(n -> System.out.println(n));

        System.out.println(
            "====================\nDescending Order"
        );

        nums.stream()
            .sorted((a, b) -> b - a)
            .forEach(n -> System.out.println(n));
    }
}
