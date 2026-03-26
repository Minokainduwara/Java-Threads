package Thread_theory.Thread_Class;

public class TCDemo {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        MyThreads t1 = new MyThreads("Thread 1");
        MyThreads t2 = new MyThreads("Thread 2");
        t1.start();
        t2.start();
        System.out.println("Main thread ended");
    }
}
