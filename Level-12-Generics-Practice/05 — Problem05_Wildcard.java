import java.util.*;

class Lists {

    static void printList(List<?> list) {

        for (Object item : list) {
            System.out.println(item);
        }
    }
}

public class Problem05_Wildcard {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(78);
        nums.add(89);
        nums.add(67);

        List<String> names = new ArrayList<>();

        names.add("Karan");
        names.add("Raj");
        names.add("SP");

        Lists.printList(nums);
        Lists.printList(names);
    }
}
