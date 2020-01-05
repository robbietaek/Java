package chap16;

class ThreadProperty extends Thread{
	ThreadProperty(String name, int p){
		super(name);
		setPriority(p);
	}
	
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println(this);
		}try {
			sleep(20);
		}catch(InterruptedException e) {}
	}
}

public class ThreadEx3 {
	public static void main(String[] args) {
		System.out.println("높은 우선순위 : " +Thread.MAX_PRIORITY);
		System.out.println("낮은 우선순위 : " +Thread.MIN_PRIORITY);
		System.out.println("기본 우선순위 : " +Thread.NORM_PRIORITY);
		Thread t1 = new ThreadProperty("First",5);
		Thread t2 = new ThreadProperty("Second",1);
		Thread t3 = new ThreadProperty("Third",10);
		t1.start();
		t2.start();
		t3.start();

	}
}
