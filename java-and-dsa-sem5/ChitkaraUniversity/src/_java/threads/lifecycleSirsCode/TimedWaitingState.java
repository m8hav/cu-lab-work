package _java.threads.lifecycleSirsCode;


class DemoTimeWaitingRunnable implements Runnable {

    @Override
    public void run() {

        try {

            Thread.sleep(5000);
            System.out.println("> " + Thread.currentThread().getState());

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();
            e.printStackTrace();

        }

    }

}


public class TimedWaitingState {

    public static void main(String[] args) throws InterruptedException {

        DemoTimeWaitingRunnable runnable = new DemoTimeWaitingRunnable();

        Thread t1 = new Thread(runnable);
        t1.start();


        // The following sleep will give enough time for ThreadScheduler to start processing of thread t1                
        //Inside the main thread
        Thread.sleep(1000);
        System.out.println(t1.getState());


        System.out.println(t1.isAlive());

    }

}

