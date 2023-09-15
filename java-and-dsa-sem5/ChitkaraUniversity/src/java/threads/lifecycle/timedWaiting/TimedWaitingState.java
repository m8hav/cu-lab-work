package java.threads.lifecycle.timedWaiting;

class DemoTimeWaitingRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("> " + Thread.currentThread().getState());
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            ie.printStackTrace();
        }
    }
}

public class TimedWaitingState {
    public static void main(String[] args) throws InterruptedException {
        DemoTimeWaitingRunnable runnable = new DemoTimeWaitingRunnable();

        Thread t1 = new Thread(runnable);
        t1.start();

//        The following sleep will give enough time for Thread-Scheduler to start processing of thread t1
        Thread.sleep(1000);
        System.out.println("Current State: " + t1.getState());

        System.out.println("Thread Alive?: " + t1.isAlive());
    }
}
