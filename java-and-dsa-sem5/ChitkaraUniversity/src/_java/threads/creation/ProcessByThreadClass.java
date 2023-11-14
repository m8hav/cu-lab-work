package _java.threads.creation;

public class ProcessByThreadClass extends Thread {
    public ProcessByThreadClass() {
    }

    public static void runMainOfRunnableInterfaceImplementation() {
        ProcessByRunnableInterface.main(new String[] {});
    }

    @Override
    public void run() {
        System.out.println("\nInside run(): " + Thread.currentThread().getName());
        System.out.println("Child thread of Thread class implementation is running...\n");
//        runMainOfRunnableInterfaceImplementation();
    }

    public static void createThread() {
        System.out.println("\nInside createThread(): " + Thread.currentThread().getName());

//        Each instance of Thread class or its subclass increases the thread counter

//        ProcessByThreadClass obj = new ProcessByThreadClass();
//        Thread objThread = new Thread(obj);
//        ^ the above method increases the count by 2 because of two instances, of ProcessByThreadClass and Thread

        Thread objThread = new ProcessByThreadClass();
//        ^ this way increases the count by 1 because of only one instance

        objThread.start();

        System.out.println("createThread thread of Thread class implementation is running...\n");
    }

    public static void main(String[] args) {
        System.out.println("\nInside main(): " + Thread.currentThread().getName());

//        Each instance of Thread class or its subclass increases the thread counter

//        ProcessByThreadClass obj = new ProcessByThreadClass();
//        Thread objThread = new Thread(obj);
//        ^ the above method increases the count by 2 because of two instances, of ProcessByThreadClass and Thread

        Thread objThread = new ProcessByThreadClass();
//        ^ this way increases the count by 1 because of only one instance of Thread class or its subclass

        objThread.start();

//        objThread.run();
//        ^ calling run() directly doesn't create a new thread and executes the code in the current thread itself
//        this is why it's code gets executed sequentially with the code in main thread,
//          instead of how start() does it with new thread executing code after main thread has executed its code entirely
//        you need to use start() to create a new thread, which further itself calls the run() method

        System.out.println("Main thread of Thread class implementation is running...\n");
    }
}
