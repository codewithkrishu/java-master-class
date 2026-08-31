import java.util.*;

public class StreamMinMax {
    public static void main(String[] args) {

        List<Integer> nums =
            Arrays.asList(67, 34, 98, 67, 19, 54);

        int min =
            nums.stream()
                .min(Integer::compare)
                .get();

        System.out.println(
            "Elements In Stream -> " + nums
        );

        System.out.println(
            "Smallest Value -> " + min
        );

        int max =
            nums.stream()
                .max(Integer::compare)
                .get();

        System.out.println(
            "Largest Value -> " + max
        );
    }
}
