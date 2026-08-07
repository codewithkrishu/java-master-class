import java.util.*;

public class Program18_PeekAndPopPractice {

    public static void main(String[] args) {

        // Program 18 - Peek & Pop Practice

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println("Original Stack -> " + st);

        System.out.println("Pop -> " + st.pop());

        System.out.println("Stack After Pop -> " + st);

        System.out.println("Peek -> " + st.peek());

        System.out.println("Index Of 20 -> " + st.indexOf(20));

        System.out.println("Index Of 30 -> " + st.indexOf(30));

        System.out.println("Peek Again -> " + st.peek());

        System.out.println("Pop Again -> " + st.pop());

        System.out.println("Peek After Pop -> " + st.peek());

        System.out.println("Final Stack -> " + st);
    }
}
