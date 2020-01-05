package chap16;

class ATM implements Runnable {
	private int money = 100000;

	public void run() {
		synchronized (this) {
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
			}
			while (true) {
				if (money <= 0)
					break;
				withdraw();
			}
		}
	}

	void withdraw() {
		if (money <= 0)
			return;
		money -= 10000;
		System.out.println(Thread.currentThread().getName() + "Ãâ±Ý. ÀÜ¾× : " + money);
	}
}

public class ThreadEx11 {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread son = new Thread(atm, "SON");
		Thread daughter = new Thread(atm, "Daughter");
		son.start();
		daughter.start();
	}
}
