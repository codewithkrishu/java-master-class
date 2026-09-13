public class NestedTryCatch {

    public static void main(String[] args) {

        try {

            System.out.println("Outer try");

            try {

                int x = 10 / 0;

            } catch (ArithmeticException e) {

                System.out.println("Inner catch");
            }

            System.out.println("Outer Try continues.....");

        } catch (Exception e) {

            System.out.println("Outer catch");
        }
    }
}
