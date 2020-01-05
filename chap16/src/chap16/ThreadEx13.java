package chap16;

class Account {
	int money;

	synchronized void input() {
		while (money > 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		money = ((int) (Math.random() * 3) + 1) * 10000;
		notifyAll();
		System.out.println(Thread.currentThread().getName() + ":" + money + "�� �Ա�");
	}
	
	
	synchronized void output() {
		while (money == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		notifyAll();
		System.out.println(Thread.currentThread().getName() + ":" + money + "�� ���");
		money = 0;
	}

}

class Mother extends Thread {
	Account account;

	Mother(Account account) {
		super("����������");
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			account.input();
			try {
				sleep((int) (Math.random() * 3000));
			} catch (InterruptedException e) {
			}
		}
	}
}

class Son extends Thread {
	Account account;

	Son(Account account) {
		super("�Ƶ龲����");
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			account.output();
			try {
				sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
			}
		}
	}

}

public class ThreadEx13 {
	public static void main(String[] args) {
		Account acc = new Account();
		Thread mother = new Mother(acc);
		Thread son = new Son(acc);
		mother.start();
		son.start();
	}
}
