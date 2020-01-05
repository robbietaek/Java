package chap16;

class ATM2 implements Runnable{
	private long money = 120000;
	@Override
	public void run() {
		synchronized(this) {
			for(int i = 0; i < 10; i++) {
				if(money <=0) {
					System.out.println("잔액이 없습니다.");
					notify();
					break;
				}
				withDraw(10000);
				if(money % 20000 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {}
				}else {
					notify();
				}
			}
		}
	}
	private void withDraw(int m) {
		if(money <= 0) return;
		money -= m;
		System.out.println(Thread.currentThread().getName() + "출금. 잔액 : "+ money);
	}
}

public class ThreadEx12 {
	public static void main(String[] args) {

		ATM2 atm = new ATM2();
		Thread son = new Thread(atm,"son");
		Thread daughter = new Thread(atm,"daugher");
		son.start();
		daughter.start();
	}
}
