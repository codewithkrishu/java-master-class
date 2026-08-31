import java.util.*;

public class StreamFindFirstAny {
    public static void main(String[] args) {

        List<Integer> nums =
            Arrays.asList(10, 20, 30, 40);

        Optional<Integer> result =
            nums.stream().findFirst();

        System.out.println("List 1 -> " + nums);
        System.out.println(
            "First Element -> " + result.get()
        );

        List<Integer> nums2 =
            Arrays.asList(50, 30, 40, 20);

        Optional<Integer> result2 =
            nums2.stream().findAny();

        System.out.println("List 2 -> " + nums2);
        System.out.println(
            "Any Element -> " + result2.get()
        );
    }
}
