import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {

        try (FileReader file = new FileReader("abc.txt")) {

            System.out.println("File opened successfully");

        } catch (IOException e) {

            System.out.println("File Error");
        }
    }
}
