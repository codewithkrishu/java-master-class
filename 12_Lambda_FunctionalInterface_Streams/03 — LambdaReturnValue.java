@FunctionalInterface
interface Calculator3 {
    int square(int n);
}

public class LambdaReturnValue {
    public static void main(String[] args) {

        Calculator3 c3 = n -> n * n;

        System.out.println("Square of 6 -> " + c3.square(6));
    }
}
