package chap16;

class DeamonThread extends Thread{
	public void run() {
		while(true) {
			System.out.println(getName());
			try {
				sleep(100);
			} catch(InterruptedException e) {}
		}
	}
}

public class ThreadEx7{
	public static void main(String[] args) throws Exception {
		Thread t1 = new DeamonThread();
		Thread t2 = new DeamonThread();
		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
		t2.start();
		Thread.sleep(2000);
		System.out.println("main 쓰레드 종료");
	}
}
