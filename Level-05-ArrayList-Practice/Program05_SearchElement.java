import java.util.ArrayList;
import java.util.Scanner;

public class Program05_SearchElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        list.add(20);
        list.add(700);
        list.add(40);
        list.add(5);
        list.add(50);
        list.add(500);
        list.add(17);
        list.add(33);

        boolean found = false;

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == num) {
                System.out.println("Element Found at Index : " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}
