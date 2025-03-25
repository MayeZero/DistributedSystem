class MyThread2 implements Runnable{
	public void run() {
		System.out.println("This thread is running...");
	}
}
public class ThreadEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new MyThread2());
		t.start();
		System.out.println("Main thread is running...");
	}

}
