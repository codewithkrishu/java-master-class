import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {

        Function<Integer, Integer> doubleReturn =
            n -> n * 2;

        System.out.println(doubleReturn.apply(10));
        System.out.println(doubleReturn.apply(7));
    }
}
