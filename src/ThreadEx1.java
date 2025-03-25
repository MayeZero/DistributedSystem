class MyThread extends Thread{
	public void run() {
		System.out.println("Child thread is running ...");
	}
}

public class ThreadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t= new MyThread();
		t.start();
		System.out.println("Main thread is running ...");
	}

}
