// Define a class that implements Runnable
class MyThread implements Runnable {
    private String message;

    public MyThread(String message) {
        this.message = message;
    }

    // Code to run in the thread
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " - Count: " + i);
            try {
                Thread.sleep(500); // Pause for 500ms to simulate processing
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

// Main class to start threads
public class ThreadExample {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new Thread(new MyThread("Thread 1"));
        Thread thread2 = new Thread(new MyThread("Thread 2"));

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
