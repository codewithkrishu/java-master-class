import java.util.ArrayList;

public class Program01_SumOfElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            sum += num;

            System.out.println("Index " + i + " -> " + num + " | Running Sum = " + sum);
        }

        System.out.println("\nTotal Sum = " + sum);
    }
}
