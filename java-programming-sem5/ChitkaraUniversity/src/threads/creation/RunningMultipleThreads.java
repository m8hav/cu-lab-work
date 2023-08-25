package threads.creation;

public class RunningMultipleThreads extends Thread {
    public RunningMultipleThreads() {
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Multiple Threads");

        RunningMultipleThreads obj = new RunningMultipleThreads();

        Thread T1 = new Thread(obj);
        Thread T2 = new Thread(obj);
        Thread T3 = new Thread(obj);

//        outputs: Thread[Thread-1,5,main]
//            Thread-1 - thread name
//            5 - thread priority number
//            main - thread group

        System.out.println("Thread Names:");
        System.out.println(T1.getName());
        System.out.println(T2.getName());
        System.out.println(T3.getName());
        System.out.println();

        System.out.println("Thread Priorities:");
        System.out.println(T1.getPriority());
        System.out.println(T2.getPriority());
        System.out.println(T3.getPriority());
        System.out.println();

        System.out.println("Thread Group Names:");
        System.out.println(T1.getThreadGroup());
        System.out.println(T2.getThreadGroup());
        System.out.println(T3.getThreadGroup());
        System.out.println();

//        Multiple threads run in uncontrolled order, decided by the Thread Scheduler
        T1.start();
        T2.start();
        T3.start();
        System.out.println();
    }
}
