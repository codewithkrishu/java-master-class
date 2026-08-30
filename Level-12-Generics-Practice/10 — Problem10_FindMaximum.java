class FindMaximum {

    static <T extends Comparable<T>> T findMax(T a, T b) {

        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }
}

public class Problem10_FindMaximum {

    public static void main(String[] args) {

        System.out.println(
                FindMaximum.findMax(10, 20)
        );

        System.out.println(
                FindMaximum.findMax(5.5, 2.3)
        );

        System.out.println(
                FindMaximum.findMax("Apple", "Mango")
        );
    }
}
