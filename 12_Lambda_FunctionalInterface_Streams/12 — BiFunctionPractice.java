import java.util.function.BiFunction;

public class BiFunctionPractice {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add =
            (a, b) -> {
                System.out.println(a + " + " + b);
                return a + b;
            };

        System.out.println("Add -> " + add.apply(13, 7));

        BiFunction<Integer, Integer, Integer> multiply =
            (a, b) -> {
                System.out.println(a + " x " + b);
                return a * b;
            };

        System.out.println("Multiply -> " + multiply.apply(5, 4));
        System.out.println("Multiply -> " + multiply.apply(10, 3));
    }
}
