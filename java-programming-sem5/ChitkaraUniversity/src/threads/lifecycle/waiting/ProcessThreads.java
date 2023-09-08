package threads.lifecycle.waiting;

public class ProcessThreads implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Thread started: " + t.getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("Thread ended: " + t.getName());
    }
}
