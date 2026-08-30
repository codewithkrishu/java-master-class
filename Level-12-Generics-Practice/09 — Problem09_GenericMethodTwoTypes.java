class GenericMethodTwoTypes {

    static <T, U> void printPair(T first, U second) {

        System.out.println(first + " -> " + second);
    }
}

public class Problem09_GenericMethodTwoTypes {

    public static void main(String[] args) {

        GenericMethodTwoTypes.printPair("Krishu", 78);

        GenericMethodTwoTypes.printPair(1, 78.8);

        GenericMethodTwoTypes.printPair("Java", "Krishu");
    }
}
