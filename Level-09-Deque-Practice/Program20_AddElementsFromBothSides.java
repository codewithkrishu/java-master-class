import java.util.*;

public class Program20_AddElementsFromBothSides {

    public static void main(String[] args) {

        Deque<Integer> dq = new LinkedList<>();

        dq.addFirst(20);
        dq.addLast(30);
        dq.addFirst(10);
        dq.addLast(40);

        System.out.println("Deque -> " + dq);
    }
}
