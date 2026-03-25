package Thread_theory.Thread_Class;

public class TCDemo {
    public static void main(String[] args) {
        MyThreads t1 = new MyThreads();
        MyThreads t2 = new MyThreads();
        t1.start();
        t2.start();
    }
}
