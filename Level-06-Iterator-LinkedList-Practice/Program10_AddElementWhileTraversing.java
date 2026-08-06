import java.util.ArrayList;
import java.util.ListIterator;

public class Program10_AddElementWhileTraversing {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");

        ListIterator<String> it = list.listIterator();

        while (it.hasNext()) {
            it.next();
        }

        while (it.hasPrevious()) {

            String language = it.previous();

            if (language.equals("Python")) {
                it.add("JavaScript");
            }
        }

        System.out.println(list);
    }
}
