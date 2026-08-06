import java.util.ArrayList;
import java.util.ListIterator;

public class Program08_ReversePrintArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        ListIterator<Integer> it = list.listIterator();

        while (it.hasNext()) {
            it.next();
        }

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
