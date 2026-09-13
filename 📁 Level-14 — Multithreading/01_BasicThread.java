class MyThread extends Thread {

    public void run() {
        System.out.println("Hello from Thread");
    }
}

public class BasicThread {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        t1.start();
    }
}
