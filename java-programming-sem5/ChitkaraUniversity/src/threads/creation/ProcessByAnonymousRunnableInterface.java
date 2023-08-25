package threads.creation;

public class ProcessByAnonymousRunnableInterface {
    public ProcessByAnonymousRunnableInterface() {
    }

    public static void main(String[] args) {
        System.out.println("\nInside main(): " + Thread.currentThread().getName());

        System.out.println("\nCreating Runnable...");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("\nInside run(): " + Thread.currentThread().getName());
                System.out.println("\nChild thread is running...");
            }
        };

        System.out.println("\nCreating Thread...");
        Thread thread = new Thread(runnable);

        System.out.println("\nStarting Thread...");
        thread.start();

        System.out.println("\nMain thread is running...");
    }
}
