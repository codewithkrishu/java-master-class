import java.util.function.Supplier;

class Student {
    Student() {
        System.out.println("Student Created");
    }
}

public class ConstructorReference {
    public static void main(String[] args) {

        Supplier<Student> s = Student::new;

        Student text = s.get();

        System.out.println(text);
    }
}
