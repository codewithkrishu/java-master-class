import java.util.function.Consumer;

public class ConsumerPractice {
    public static void main(String[] args) {

        Consumer<Integer> val =
            n -> System.out.println(n * n);

        Consumer<String> names =
            name -> System.out.println("Hello " + name);

        val.accept(5);
        val.accept(10);

        names.accept("Krishu");
        names.accept("Akshu");
    }
}
