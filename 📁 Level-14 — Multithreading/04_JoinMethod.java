class MyThread extends Thread {

    public void run() {

        for (int i = 0; i <= 3; i++) {
            System.out.println("Thread: " + i);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }
}

public class JoinMethod {

    public static void main(String[] args) throws InterruptedException {

        MyThread t4 = new MyThread();

        t4.start();

        t4.join();

        System.out.println("Main Finished");
    }
}
