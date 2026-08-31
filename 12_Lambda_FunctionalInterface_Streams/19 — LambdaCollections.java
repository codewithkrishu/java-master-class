import java.util.*;

public class LambdaCollections {
    public static void main(String[] args) {

        List<Integer> nums =
            new ArrayList<>(
                Arrays.asList(10, 15, 20, 25, 30)
            );

        nums.removeIf(n -> n % 2 == 0);

        System.out.println(nums);
    }
}
