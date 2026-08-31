import java.util.function.BiPredicate;

public class BiPredicatePractice {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> p =
            (a, b) -> {
                System.out.print("Value of A -> " + a);
                System.out.println(" Value of B -> " + b);

                return a == b;
            };

        System.out.println(p.test(10, 10));
        System.out.println(p.test(5, 10));
    }
}
