@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

@FunctionalInterface
interface Calculator2 {
    int multiply(int a, int b);
}

public class LambdaParameter {
    public static void main(String[] args) {

        Calculator c = (a, b) -> a + b;

        System.out.println("Addition of 6 and 5 -> " + c.add(6, 5));

        Calculator2 c2 = (a, b) -> a * b;

        System.out.println("Multiply of 7 and 6 -> " + c2.multiply(7, 6));
    }
}
