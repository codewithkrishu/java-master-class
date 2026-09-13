class Counter {

    int count = 0;

    synchronized void increment() {
        count++;

        System.out.println(
            Thread.currentThread().getName() + " -> " + count
        );
    }
}

public class ThreadNames {

    public static void main(String[] args) throws InterruptedException {

        Counter c2 = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                c2.increment();
            }
        }, "Thread-A");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                c2.increment();
            }
        }, "Thread-B");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c2.count);
    }
}
