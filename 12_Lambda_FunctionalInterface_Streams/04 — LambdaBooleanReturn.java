@FunctionalInterface
interface CheckNumber {
    boolean check(int n);
}

public class LambdaBooleanReturn {
    public static void main(String[] args) {

        CheckNumber value = n -> n % 2 == 0;

        System.out.println("Is 8 even -> " + value.check(8));
        System.out.println("Is 5 even -> " + value.check(5));
    }
}
