package Thread_theory.Runnable_int;

public class RunnableThreadDemo {
    public static void main(String[] args) {
        RunnableThread rt = new RunnableThread();

        // initializing Thread Object
        Thread t1 = new Thread(rt);
        Thread t2 = new Thread(rt);

        //Running Thread
        t1.start();
        t2.start();
    }
}
