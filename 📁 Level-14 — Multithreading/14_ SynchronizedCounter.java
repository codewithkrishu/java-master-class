class Counter {

    int count = 0;

    synchronized void increment() {
        count++;
    }
}

public class SynchronizedCounter {

    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable test = () -> {

            for (int i = 1; i <= 100; i++) {
                c.increment();

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("interrupted!");
                }
            }
        };

        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
