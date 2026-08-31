import java.util.function.Predicate;

public class PredicatePractice {
    public static void main(String[] args) {

        Predicate<Integer> p = n -> n % 2 == 0;

        System.out.println(p.test(13));
        System.out.println(p.test(20));
    }
}
