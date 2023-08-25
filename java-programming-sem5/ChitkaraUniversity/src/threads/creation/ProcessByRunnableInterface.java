package threads.creation;

public class ProcessByRunnableInterface implements Runnable {
    public ProcessByRunnableInterface() {
    }

    public void runThreadOfThreadClassImplementation() {
//        ProcessByThreadClass.main(new String[] {});
        ProcessByThreadClass.createThread();
    }

    @Override
    public void run() {
        System.out.println("Inside run(): " + Thread.currentThread().getName());
        System.out.println("Child thread of Runnable interface implementation is running...\n");
//        runThreadOfThreadClassImplementation();
    }

    public static void main(String[] args) {
        System.out.println("Inside main(): " + Thread.currentThread().getName());

        ProcessByRunnableInterface obj = new ProcessByRunnableInterface();
        Thread objThread = new Thread(obj);
//        Thread objThread = new Thread(new ProcessByRunnableInterface());

        Thread thread = new Thread();
        thread.start();
//        ^ this doesn't give any error
//        because in method definition - if target is null the run method doesn't get executed

        objThread.start();

        System.out.println("Main thread of Runnable interface implementation is running...\n");
    }

}