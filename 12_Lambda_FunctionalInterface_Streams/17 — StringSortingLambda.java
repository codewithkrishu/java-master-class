import java.util.*;

public class StringSortingLambda {
    public static void main(String[] args) {

        List<String> alphabetDesc =
            new ArrayList<>(
                Arrays.asList("E", "D", "C", "B", "A")
            );

        List<String> alphabetAsc =
            new ArrayList<>(
                Arrays.asList("A", "B", "C", "D", "E")
            );

        System.out.println("Normal List -> " + alphabetDesc);

        alphabetDesc.sort((a, b) -> a.compareTo(b));

        System.out.println(
            "Ascending Order -> " + alphabetDesc
        );

        System.out.println("Normal List 2 -> " + alphabetAsc);

        alphabetAsc.sort((a, b) -> b.compareTo(a));

        System.out.println(
            "Descending Order -> " + alphabetAsc
        );
    }
}
