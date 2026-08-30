class NumberBox<T extends Number> {

    T value;

    NumberBox(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class Problem04_BoundedGeneric {

    public static void main(String[] args) {

        NumberBox<Integer> box1 =
                new NumberBox<>(89);

        NumberBox<Double> box2 =
                new NumberBox<>(67.7);

        System.out.println(box1.getValue());
        System.out.println(box2.getValue());

        // NumberBox<String> box3 =
        //        new NumberBox<>("Krishu");
        // Not allowed because String is not a Number.
    }
}
