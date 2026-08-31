@FunctionalInterface
interface Calculator4 {
    int calculate(int n);
}

public class LambdaMultipleStatements {
    public static void main(String[] args) {

        Calculator4 c4 = n -> {
            System.out.println(n);
            return n * n;
        };

        System.out.println(c4.calculate(7));
    }
}
