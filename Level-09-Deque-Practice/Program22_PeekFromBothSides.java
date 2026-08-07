import java.util.*;

public class Program22_PeekFromBothSides {

    public static void main(String[] args) {

        Deque<Integer> dq = new LinkedList<>();

        dq.addFirst(100);
        dq.addLast(200);
        dq.addLast(300);
        dq.addLast(400);

        System.out.println("Deque -> " + dq);

        System.out.println("Peek First -> " + dq.peekFirst());
        System.out.println("Peek Last -> " + dq.peekLast());
    }
}
