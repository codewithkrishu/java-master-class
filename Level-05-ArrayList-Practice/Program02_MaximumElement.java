import java.util.ArrayList;

public class Program02_MaximumElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(700);
        list.add(40);
        list.add(50);
        list.add(500);

        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {

            int element = list.get(i);

            if (element > max) {
                max = element;
            }
        }

        System.out.println("Maximum Element = " + max);
    }
}
