package java.threads.lifecycleSirsCode;

class DemoWaitingStateRunnable implements Runnable {
    
	@Override
	public void run() {

		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        
        System.out.println("T1 - INNER : " + WaitingState.t1.getState());
    
	}

}

public class WaitingState implements Runnable {
	
    public static Thread t1;

    public static void main(String[] args) {
        t1 = new Thread(new WaitingState());
        t1.start();
    }

    @Override
    public void run() {
    	
    	//System.out.println(t1.getState());
        
    	Thread t2 = new Thread(new DemoWaitingStateRunnable());
        t2.start();


    	System.out.println("T1 - OUTER : " + t1.getState());

    	
        try {
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}

