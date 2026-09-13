class Counter {

    int count = 0;

    void increment() {

        synchronized (this) {
            count++;
        }
    }
}

public class SynchronizedBlock {

    public static void main(String[] args) throws InterruptedException {

        Counter c3 = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c3.increment();
            }
        }, "Thread-A");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c3.increment();
            }
        }, "Thread-B");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count -> " + c3.count);
    }
}
