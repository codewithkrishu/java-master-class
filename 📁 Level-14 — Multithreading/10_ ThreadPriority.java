public class ThreadPriority {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.println("Low Priority");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("High Priority");
        });

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("T1: " + t1.getPriority());
        System.out.println("T2: " + t2.getPriority());

        t1.start();
        t2.start();
    }
}
