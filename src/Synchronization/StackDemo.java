package Synchronization;

public class StackDemo {

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        // Thread 1 → PUSH elements
        Thread t1 = new Thread(() -> {
            int count = 0;
            while (count < 5) {
                boolean pushed = stack.push(count);
                if (pushed) {
                    System.out.println("Pushed: " + count);
                    count++;
                }
            }
        });

        // Thread 2 → POP elements
        Thread t2 = new Thread(() -> {
            int count = 0;
            while (count < 5) {
                int value = stack.pop();
                if (value != Integer.MIN_VALUE) {
                    System.out.println("Popped: " + value);
                    count++;
                }
            }
        });

        // Start threads
        t1.start();
        t2.start();
    }
}