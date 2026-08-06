import java.util.ArrayList;

public class Program04_EvenOddCount {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(700);
        list.add(40);
        list.add(5);
        list.add(50);
        list.add(500);
        list.add(17);
        list.add(33);

        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < list.size(); i++) {

            int element = list.get(i);

            if (element % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println("Total Even = " + countEven);
        System.out.println("Total Odd = " + countOdd);
    }
}
