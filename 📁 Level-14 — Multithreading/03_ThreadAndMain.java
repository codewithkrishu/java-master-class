class MyThread extends Thread {

    public void run() {

        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread: " + i);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class ThreadAndMain {

    public static void main(String[] args) throws InterruptedException {

        MyThread t3 = new MyThread();

        t3.start();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Main: " + i);
        }
    }
}
