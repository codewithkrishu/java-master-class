import java.util.*;

public class LambdaForEach {
    public static void main(String[] args) {

        List<String> names =
            Arrays.asList("Aman", "Krishu", "Rohit");

        List<Integer> id =
            Arrays.asList(1, 2, 3);

        names.forEach(name -> System.out.println(name));

        id.forEach(student -> System.out.println(student));
    }
}
