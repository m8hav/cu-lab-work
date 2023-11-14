package _java.threads.lifecycleSirsCode;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		
		Runnable runnable  = new ThreadLifeCycleState();
		
		Thread t = new Thread(runnable);
		//System.out.println(t.getState());
		
		t.start();
		System.out.println(t.getState());
		
	}

}
