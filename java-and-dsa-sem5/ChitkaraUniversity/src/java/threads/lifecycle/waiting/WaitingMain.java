package java.threads.lifecycle.waiting;

public class WaitingMain {
    public static void main(String[] args) throws InterruptedException {
        Thread processThread1 = new Thread(new ProcessThreads(), "ProcessThread_01");
        Thread processThread2 = new Thread(new ProcessThreads(), "ProcessThread_02");
        Thread processThread3 = new Thread(new ProcessThreads(), "ProcessThread_03");

        processThread1.start();
        processThread2.start();
        processThread3.start();

//        System.out.println(processThread1.getState());
//        System.out.println(processThread2.getState());
//        System.out.println(processThread3.getState());

//        Thread.sleep(5000);

//        System.out.println(processThread1.getState());
//        System.out.println(processThread2.getState());
//        System.out.println(processThread3.getState());


        processThread1.start();
        processThread1.join();

        processThread2.start();
        processThread2.join();

        processThread3.start();
        processThread3.join();


//        all three threads have finished szasdfasdhflkj
    }
}
