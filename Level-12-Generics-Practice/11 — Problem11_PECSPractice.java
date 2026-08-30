import java.util.*;

class PECS {

    static void copyNumber(
            List<? extends Number> source,
            List<? super Number> destination) {

        for (Number n : source) {
            destination.add(n);
        }
    }
}

public class Problem11_PECSPractice {

    public static void main(String[] args) {

        List<Integer> source =
                Arrays.asList(78, 56, 54);

        List<Number> destination =
                new ArrayList<>();

        PECS.copyNumber(source, destination);

        System.out.println(destination);
    }
}
