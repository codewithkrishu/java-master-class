class Parent<T> {

    T value;

    Parent(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

class Child<T extends Number> extends Parent<T> {

    Child(T value) {
        super(value);
    }
}

public class Problem12_GenericInheritance {

    public static void main(String[] args) {

        Child<Integer> c1 =
                new Child<>(67);

        Child<Double> c2 =
                new Child<>(6.8);

        System.out.println(c1.getValue());
        System.out.println(c2.getValue());
    }
}
