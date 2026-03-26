package Volatile;

public class TestDatabase {
    public static void main(String[] args) {

        Runnable task = () -> {
            Database db = Database.getInstance();
            System.out.println(Thread.currentThread().getName() + " got instance: " + db);
        };

        // Create multiple threads
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");
        Thread t4 = new Thread(task, "Thread-4");

        // Start threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}