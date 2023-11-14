package _java.threads.creation;

class Car extends Thread {
    public Car(String name) {
        super(name);
    }

    public void runLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
            try {
                sleep((long) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done: " + getName());
    }

    @Override
    public void run() {
        runLoop();
    }
}

public class Race {
    public Race() {
    }

    public static void main(String[] args) throws InterruptedException {
        // this has race condition;
        // new Car("HONDA").start();
        // new Car("MITSUBISHI").start();
        // new Car("YAMAHA").start();


        // this doesn't have race conditions
        Car car1 = new Car("HONDA");
        Car car2 = new Car("MITSUBISHI");
        Car car3 = new Car("YAMAHA");

        car1.start();
        car1.join();

        car2.start();
        car2.join();

        car3.start();
        car3.join();
    }
}
