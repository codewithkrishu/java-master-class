import java.util.LinkedList;
import java.util.Queue;

public class Program13_SumOfOddNumbersInQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);
        queue.offer(15);
        queue.offer(18);
        queue.offer(21);
        queue.offer(24);
        queue.offer(27);

        int sum = 0;

        while (!queue.isEmpty()) {

            int number = queue.poll();

            if (number % 2 != 0) {
                sum += number;
            }
        }

        System.out.println("Sum of Odd Numbers -> " + sum);
    }
}
