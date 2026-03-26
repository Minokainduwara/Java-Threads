package Thread_theory.Thread_Class;

public class MyThreads extends Thread {
    public MyThreads(String s) {
        super(s);
    }

    public void run(){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);

        String str = "Thread is Running";
        System.out.println(str);
    }
}
