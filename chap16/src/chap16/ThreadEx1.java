package chap16;

class Thread1 extends Thread{
	Thread1(String name){
		super(name);
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+"="+getName());
			try {
				sleep(1000);
			} catch(InterruptedException e) {
				
			}
		}
	}
}

public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("main 쓰레드 시작");
		Thread1 t1 = new Thread1("First");
		Thread1 t2 = new Thread1("Second");
//		t1.start();
//		t2.start();
		t1.run();
		t2.run();
		System.out.println("main 스레드 종료");
	}
}
