import java.util.ArrayList;
import java.util.Iterator;

public class Program06_RemoveEvenNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(35);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {

            int element = it.next();

            if (element % 2 == 0) {
                it.remove();
            }
        }

        System.out.println(list);
    }
}
