import java.util.*;

public class Program17_CountVowelsUsingStack {

    public static void main(String[] args) {

        // Program 17 - Count Vowels Using Stack

        Stack<Character> st = new Stack<>();

        String str = "Programming";
        int countVowels = 0;

        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        while (!st.isEmpty()) {

            char ch = Character.toLowerCase(st.pop());

            if (ch == 'a' ||
                ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u') {

                countVowels++;
            }
        }

        System.out.println("Total Vowels -> " + countVowels);
    }
}
