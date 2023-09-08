package threads.lifecycle;

class DemoBlockedRunnable implements Runnable {
//    private void commonResource() {
//        while (true) {
//            System.out.println(Thread.currentThread().getName());
////            Infinite loop to mimic heavy processing
////            't1' won't leave this method when 't2' tries to enter this
//        }
//    }
    public static synchronized void commonResource() {
        while (true) {
//            System.out.println(Thread.currentThread().getName());
//            Infinite loop to mimic heavy processing
//            't1' won't leave this method when 't2' tries to enter this
        }
    }

    @Override
    public void run() {
        commonResource();
    }
}

public class BlockedState {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new DemoBlockedRunnable());
        Thread t2 = new Thread(new DemoBlockedRunnable());

        t1.start();
        t2.start();
//        both states go to RUNNABLE state

        Thread.sleep(2000);
//        Both threads go to sleep
//        when they wake again, the Thread-Scheduler doesn't know which one went to sleep first, so it picks either of these and runs its processes.
//        if the running process calls a synchronized method and then the other wakes later and comes to call the same synchronized method, the other one gets BLOCKED

//        WHY DOES MY t2 THREAD NEVER BECOME RUNNABLE

        System.out.println(t1.getState());
        System.out.println(t2.getState());

        System.exit(0);
    }
}
