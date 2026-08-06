import java.util.LinkedList;
import java.util.Queue;

public class Program14_MaximumElementInQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(45);
        queue.offer(12);
        queue.offer(89);
        queue.offer(23);
        queue.offer(67);

        int max = Integer.MIN_VALUE;

        while (!queue.isEmpty()) {

            int number = queue.poll();

            if (number > max) {
                max = number;
            }
        }

        System.out.println("Maximum Element -> " + max);
    }
}
