import java.util.*;

class Super {

    static void addIntegers(List<? super Integer> list) {

        list.add(78);
        list.add(87);
        list.add(67);
    }
}

public class Problem06_SuperInteger {

    public static void main(String[] args) {

        List<Number> nums = new ArrayList<>();

        Super.addIntegers(nums);

        System.out.println(nums);
    }
}
