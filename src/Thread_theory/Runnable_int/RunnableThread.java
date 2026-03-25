package Thread_theory.Runnable_int;

public class RunnableThread implements Runnable {
    public void run(){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);

        String str = "Thread is Running";
        System.out.println(str);
    }
}
