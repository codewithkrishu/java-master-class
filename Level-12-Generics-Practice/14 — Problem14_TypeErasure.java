import java.util.*;

public class Problem14_TypeErasure {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Krishu");
        names.add("Java");

        System.out.println(names);

        /*
         * Generics are mainly a compile-time feature.
         *
         * At runtime, generic type information is erased
         * in many ordinary generic types.
         */
    }
}
