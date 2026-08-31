import java.util.*;

public class StreamFilter {
    public static void main(String[] args) {

        List<Integer> nums =
            Arrays.asList(10, 15, 20, 25, 30);

        nums.stream()
            .filter(n -> n % 2 == 0)
            .forEach(n -> System.out.println(n));

        System.out.println("==============================");

        List<Integer> value =
            Arrays.asList(5, 10, 15, 20, 25, 30);

        value.stream()
            .filter(n -> n > 15)
            .forEach(n -> System.out.println(n));
    }
}
