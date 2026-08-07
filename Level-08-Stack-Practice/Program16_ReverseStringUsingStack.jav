import java.util.*;

public class Program16_ReverseStringUsingStack {

    public static void main(String[] args) {

        Stack<Character> st = new Stack<>();

        String str = "Java";

        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        System.out.print("Reversed String -> ");

        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}
