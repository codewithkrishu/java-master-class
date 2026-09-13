public class MultipleCatch {

    public static void main(String[] args) {

        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error");
        }


        // Second Example

        try {
            int a = 10, b = 0;
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");

        } catch (Exception e) {
            System.out.println("Some Other Error");
        }
    }
}
