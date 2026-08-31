import java.util.*;

public class StreamFilterMap {
    public static void main(String[] args) {

        List<Integer> nums =
            Arrays.asList(5, 10, 15, 20, 25, 30);

        nums.stream()
            .filter(n -> n > 10)
            .map(n -> n * 2)
            .forEach(n -> System.out.println(n));

        System.out.println("===============================");

        List<Integer> evenNumbers =
            Arrays.asList(10, 15, 20, 25, 30, 35);

        evenNumbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * 3)
            .forEach(n -> System.out.println(n));
    }
}
