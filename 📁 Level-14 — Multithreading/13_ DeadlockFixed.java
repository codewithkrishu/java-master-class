public class DeadlockFixed {

    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {

        Thread t3 = new Thread(() -> {

            synchronized (lock1) {

                synchronized (lock2) {
                    System.out.println("T1 worked!");
                }
            }
        });

        Thread t4 = new Thread(() -> {

            synchronized (lock1) {

                synchronized (lock2) {
                    System.out.println("T2 worked!");
                }
            }
        });

        t3.start();
        t4.start();
    }
}
