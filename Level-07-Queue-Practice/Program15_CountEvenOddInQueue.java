import java.util.LinkedList;
import java.util.Queue;

public class Program15_CountEvenOddInQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(11);
        queue.offer(22);
        queue.offer(33);
        queue.offer(44);
        queue.offer(55);
        queue.offer(66);

        int evenCount = 0;
        int oddCount = 0;

        while (!queue.isEmpty()) {

            int number = queue.poll();

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total Even Numbers -> " + evenCount);
        System.out.println("Total Odd Numbers -> " + oddCount);
    }
}
