import java.util.*;

public class LambdaMethodReference {
    public static void main(String[] args) {

        List<String> names =
            Arrays.asList("Krishu", "Rashi", "Rakhi");

        List<Integer> marks =
            Arrays.asList(78, 65, 34);

        names.forEach(System.out::println);
        marks.forEach(System.out::println);
    }
}
