import java.util.function.BiConsumer;

public class BiConsumerPractice {
    public static void main(String[] args) {

        BiConsumer<Integer, Integer> b2 =
            (a, b) -> System.out.println(a + "\n" + b);

        b2.accept(7, 3);
        b2.accept(50, 8);
    }
}
