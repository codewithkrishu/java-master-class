import java.util.*;
import java.util.stream.Collectors;

public class StreamCollect {
    public static void main(String[] args) {

        List<Integer> nums =
            Arrays.asList(5, 10, 15, 20, 25, 30);

        List<Integer> result =
            nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("New List -> " + result);

        System.out.println("===============================");

        List<Integer> value =
            Arrays.asList(10, 15, 20, 25, 30, 35);

        List<Integer> newList =
            value.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("New List 2 -> " + newList);
    }
}
