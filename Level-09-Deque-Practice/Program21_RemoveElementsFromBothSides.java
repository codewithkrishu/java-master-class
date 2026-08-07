import java.util.*;

public class Program21_RemoveElementsFromBothSides {

    public static void main(String[] args) {

        Deque<Integer> dq = new LinkedList<>();

        dq.addLast(40);
        dq.addLast(50);
        dq.addFirst(30);
        dq.addFirst(20);
        dq.addFirst(10);

        System.out.println("Original Deque -> " + dq);

        System.out.println("Remove Last -> " + dq.removeLast());
        System.out.println("Remove First -> " + dq.removeFirst());

        System.out.println("Updated Deque -> " + dq);
    }
}
