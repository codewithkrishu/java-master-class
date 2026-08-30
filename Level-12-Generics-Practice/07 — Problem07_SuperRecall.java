import java.util.*;

class SuperRecall {

    static void addValue(List<? super Integer> list) {

        list.add(87);
        list.add(67);
        list.add(78);
        list.add(67);
        list.add(54);
    }
}

public class Problem07_SuperRecall {

    public static void main(String[] args) {

        List<Object> data = new ArrayList<>();

        SuperRecall.addValue(data);

        System.out.println(data);
    }
}
