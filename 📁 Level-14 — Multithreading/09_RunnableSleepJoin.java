public class RunnableSleepJoin {

    public static void main(String[] args) throws InterruptedException {

        Runnable test = () -> {

            for (int i = 1; i <= 3; i++) {
                System.out.println(i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                }
            }
        };

        Thread t1 = new Thread(test);

        t1.start();

        t1.join();

        System.out.println("Main Done");
    }
}
