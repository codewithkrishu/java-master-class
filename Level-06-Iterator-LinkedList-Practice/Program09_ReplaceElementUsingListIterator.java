import java.util.ArrayList;
import java.util.ListIterator;

public class Program09_ReplaceElementUsingListIterator {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("PHP");

        ListIterator<String> it = list.listIterator();

        while (it.hasNext()) {
            it.next();
        }

        while (it.hasPrevious()) {

            String language = it.previous();

            if (language.equals("Python")) {
                it.set("Kotlin");
            }
        }

        System.out.println(list);
    }
}
