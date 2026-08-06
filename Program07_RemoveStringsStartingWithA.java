import java.util.ArrayList;
import java.util.Iterator;

public class Program07_RemoveStringsStartingWithA {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Avocado");
        list.add("Mango");
        list.add("Apricot");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {

            String fruit = it.next();

            if (fruit.startsWith("A")) {
                it.remove();
            }
        }

        System.out.println(list);
    }
}
