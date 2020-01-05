package chap16;

class SumRunnable implements Runnable {

	int start;
	int end;
	int sum;

	public SumRunnable(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		for (int i = this.start; i <= this.end; i++) {
			sum += i;
		}
	}
}

public class problem2 {

	public static void main(String[] args) throws InterruptedException {

		SumRunnable sr = new SumRunnable(1, 500);
		Thread t1 = new Thread(sr);
		t1.start();
		t1.join();
		System.out.println(sr.sum);

	}

}
