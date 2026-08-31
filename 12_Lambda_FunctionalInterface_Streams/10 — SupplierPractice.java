import java.util.function.Supplier;

public class SupplierPractice {
    public static void main(String[] args) {

        Supplier<Integer> s = () -> 100;
        Supplier<String> s2 = () -> "I am Krishu";

        System.out.println(s.get());
        System.out.println(s2.get());
    }
}
