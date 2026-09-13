public class ThrowKeyword {

    public static void main(String[] args) {

        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or Above");
        }

        System.out.println("Eligible");
    }
}
