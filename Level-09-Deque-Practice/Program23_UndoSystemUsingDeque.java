import java.util.*;

public class Program23_UndoSystemUsingDeque {

    public static void main(String[] args) {

        Deque<String> dq = new LinkedList<>();

        dq.addLast("Type A");
        dq.addLast("Type B");
        dq.addLast("Type C");

        System.out.println("Current Actions -> " + dq);

        dq.removeLast();

        System.out.println("After Undo -> " + dq);
    }
}
