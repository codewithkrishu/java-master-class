public class RunnableThread {

    public static void main(String[] args) {

        Runnable t2 = new Thread(() -> {
            System.out.println("Task Is running....");
        });

        Thread tr = new Thread(t2);

        tr.start();
    }
}
