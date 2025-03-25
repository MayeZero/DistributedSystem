class ThreadA2 implements Runnable{
	public void run() {
		System.out.println("ThreadA2 Start");
		for(int i = 1; i <= 5; i++) {
			System.out.println("From ThreadA2: " + i);
		}
		System.out.println("Exit from ThreadA2");
	}
}

class ThreadB2 implements Runnable{
	public void run() {
		System.out.println("ThreadB2 Start");
		for(int i = 1; i <= 5; i++) {
			System.out.println("From ThreadB2: " + i);
		}
		System.out.println("Exit from ThreadB2");
	}
}

class ThreadC2 implements Runnable{
	public void run() {
		System.out.println("ThreadC2 Start");
		for(int i = 1; i <= 5; i++) {
			System.out.println("From ThreadC2: " + i);
		}
		System.out.println("Exit from ThreadC2");
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread TA = new Thread(new ThreadA2());
		Thread TB = new Thread(new ThreadB2());
		Thread TC = new Thread(new ThreadC2());
		
		TC.setPriority(Thread.MAX_PRIORITY);
		TB.setPriority(Thread.NORM_PRIORITY);
		TA.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("Start ThreadA2");
		TA.start();
		
		System.out.println("Start ThreadB2");
		TB.start();
		
		System.out.println("Start ThreadC2");
		TC.start();
	}

}
