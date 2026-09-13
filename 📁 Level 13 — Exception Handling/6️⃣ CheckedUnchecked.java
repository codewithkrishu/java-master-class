import java.io.IOException;
import java.io.FileReader;

public class CheckedUnchecked {

    public static void main(String[] args) {

        // Checked Exception

        try {
            FileReader file = new FileReader("abc.txt");
        } catch (IOException e) {
            System.out.println("File Error");
        }


        // Unchecked Exception

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero");
        }
    }
}
