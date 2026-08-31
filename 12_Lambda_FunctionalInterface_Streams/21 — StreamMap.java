import java.util.*;

public class StreamMap {
    public static void main(String[] args) {

        List<Integer> value =
            Arrays.asList(1, 2, 3, 4, 5);

        value.stream()
             .map(n -> n * 2)
             .forEach(n -> System.out.println(n));

        System.out.println("=============================");

        List<Integer> nums =
            Arrays.asList(10, 20, 30, 40);

        nums.stream()
            .map(n -> n * n)
            .forEach(n ->
                System.out.println("Square -> " + n)
            );
    }
}
