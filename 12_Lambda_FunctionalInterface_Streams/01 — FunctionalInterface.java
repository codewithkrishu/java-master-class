@FunctionalInterface
interface Greeting {
    void greet();

    default void show() {
        System.out.println("hey");
    }

    static void display() {
        System.out.println("Java user");
    }
}

public class FunctionalInterface {
    public static void main(String[] args) {

        Greeting g = () -> System.out.println("Hello Krishu");

        g.greet();
        g.show();
        Greeting.display();
    }
}
