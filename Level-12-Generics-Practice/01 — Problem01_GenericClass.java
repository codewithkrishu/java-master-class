class Box<T> {

    T value;

    Box(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class Problem01_GenericClass {

    public static void main(String[] args) {

        Box<Integer> values = new Box<>(89);
        Box<String> names = new Box<>("Krishu");

        System.out.println(values.getValue());
        System.out.println(names.getValue());
    }
}
