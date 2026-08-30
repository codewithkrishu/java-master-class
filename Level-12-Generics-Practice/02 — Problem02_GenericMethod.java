class PrintArrays {

    static <T> void printArray(T[] arr) {

        for (T element : arr) {
            System.out.println(element);
        }
    }
}

public class Problem02_GenericMethod {

    public static void main(String[] args) {

        Integer[] values = {87, 78, 65, 78};
        String[] names = {"Aman", "Rohit", "Karan"};

        PrintArrays.printArray(values);
        PrintArrays.printArray(names);
    }
}
