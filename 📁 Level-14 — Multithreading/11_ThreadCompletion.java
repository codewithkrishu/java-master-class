public class ThreadCompletion {

    public static void main(String[] args) throws InterruptedException {

        Runnable test2 = () -> {

            for (int i = 1; i <= 5; i++) {
                System.out.println(i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                }
            }
        };

        Thread t1 = new Thread(test2);

        t1.start();

        t1.join();

        System.out.println("Main Thread Completed!");
    }
}
