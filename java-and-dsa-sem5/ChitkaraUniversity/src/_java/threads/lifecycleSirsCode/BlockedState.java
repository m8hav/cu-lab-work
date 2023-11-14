package _java.threads.lifecycleSirsCode;

class DemoBlockedRunnable implements Runnable {
    
	@Override
    public void run() {
        commonResource();
    }
    
	/*
	private void commonResource() {
        while(true) {
        	
        	//System.out.println(Thread.currentThread().getName());        	
            // Infinite loop to mimic heavy processing 't1' won't leave this method when 't2' try to enter this
        }
    }
    */
	
    
    public static synchronized void commonResource() {
        while(true) {
            // Infinite loop to mimic heavy processing
            // 't1' won't leave this method
            // when 't2' try to enter this
        }
    }
    
}


public class BlockedState {
	
    public static void main(String[] args) throws InterruptedException {
        
    	Thread t1 = new Thread(new DemoBlockedRunnable());
        Thread t2 = new Thread(new DemoBlockedRunnable());
        
        t1.start();
        t2.start();
        
        //Thread.sleep(1000);
        
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        
        System.exit(0);
    }
}

