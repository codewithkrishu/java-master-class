import java.util.*;

public class Program19_BrowserBackSimulation {

    public static void main(String[] args) {

        // Program 19 - Browser Back Simulation Using Stack

        Stack<String> st = new Stack<>();

        st.push("Google");
        st.push("YouTube");
        st.push("GitHub");

        System.out.println("Current Stack -> " + st);

        System.out.println("Back -> " + st.pop());

        System.out.println("Back -> " + st.pop());

        System.out.println("Current Page -> " + st.peek());

        System.out.println("Remaining Stack -> " + st);
    }
}
