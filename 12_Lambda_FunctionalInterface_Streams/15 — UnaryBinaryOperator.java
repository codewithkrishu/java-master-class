import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public class UnaryBinaryOperator {
    public static void main(String[] args) {

        // UnaryOperator -> T -> T

        UnaryOperator<Integer> square =
            n -> {
                System.out.println(n + " x " + n);
                return n * n;
            };

        UnaryOperator<Integer> op =
            n -> {
                System.out.println(n + " x " + 3);
                return n * 3;
            };

        System.out.println("Square -> " + square.apply(7));
        System.out.println("Square -> " + square.apply(6));

        System.out.println(
            "After multiply by 3 -> " + op.apply(7)
        );


        // BinaryOperator -> T -> T -> T

        BinaryOperator<Integer> num =
            (a, b) -> Math.max(a, b);

        System.out.println(num.apply(10, 20));
        System.out.println(num.apply(50, 30));
    }
}
