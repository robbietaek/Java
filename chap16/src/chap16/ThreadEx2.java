package chap16;

class Runnable1 implements Runnable {


	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "=" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
			}
		}
	}

}

public class ThreadEx2 {
	public static void main(String[] args) {
		System.out.println("쓰레드 시작");
		Runnable r = new Runnable1();
		Thread t1 = new Thread(r, "First");	//
		Thread t2 = new Thread(r, "Second");
		t1.start();
		t2.start();
		System.out.println("쓰레드 종료");
	}
}
