class ThreadA extends Thread{
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("From ThreadA: " + i);
		}
		System.out.println("Exit from ThreadA");
	}
}

class ThreadB extends Thread{
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("From ThreadB: " + i);
		}
		System.out.println("Exit from ThreadB");
	}
}

class ThreadC extends Thread{
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("From ThreadC: " + i);
		}
		System.out.println("Exit from ThreadC");
	}
}
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA A = new ThreadA();
		ThreadB B = new ThreadB();
		ThreadC C = new ThreadC();
		A.start();
		B.start();
		C.start();
	}

}
