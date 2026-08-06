import java.util.LinkedList;

public class Program11_LinkedListOperations {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.push("Apple");
        list.push("Banana");
        list.push("Mango");
        list.push("Orange");

        System.out.println("First Element : " + list.getFirst());
        System.out.println(list);

        System.out.println("Last Element : " + list.getLast());
        System.out.println(list);

        System.out.println("Removed First : " + list.removeFirst());
        System.out.println(list);

        System.out.println("Removed Last : " + list.removeLast());
        System.out.println(list);

        list.push("Orange");
        System.out.println(list);

        list.addLast("Apple");
        System.out.println(list);

        list.pollLast();
        System.out.println(list);

        list.pollFirst();
        System.out.println(list);

        System.out.println("Peek Last : " + list.peekLast());
    }
}
