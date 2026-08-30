class Pair<T, U> {

    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    void display() {
        System.out.println(first + " -> " + second);
    }
}

public class Problem03_GenericPair {

    public static void main(String[] args) {

        Pair<String, Integer> student =
                new Pair<>("Krishu", 92);

        Pair<Integer, String> studentId =
                new Pair<>(1, "Krishu");

        Pair<Integer, Double> actualMarks =
                new Pair<>(92, 92.9);

        student.display();
        studentId.display();
        actualMarks.display();
    }
}
