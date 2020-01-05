package chap16;
/*
 * CarMarket Ŭ���� : �ڵ��� �Ǹż�
 * ������� : String car;
 * ��� �޼��� : 
 * 	Synchronized void push() : car ����� �ڵ��� ����
 * 			{"�ҳ�Ÿ", "SM5", "�׷���", "���׽ý�", "K9"} �� �Ѱ��� car�� ����
 * 			������ car == null�� ��츸 ���尡��.
 * 		synchronized void pop() : ����� car�� ���
 * 				car == null; �� ����
 * 				car != null; �� ��츸 ��� ����
 * 
 *  Seller Ŭ���� : �Ǹſ�. Thread Ŭ����
 *  	0 ~ 2000 �и��� ���Ƿ� sleep
 *  	pop()�޼��带 ȣ���ϱ�
 *  Producer Ŭ���� : ������. Thread Ŭ����
 *  0~5000�и��� ���Ƿ� sleep
 *  push()�޼��带 ȣ���ϱ�
 */

import java.util.ArrayList;
import java.util.List;

class CarMarket {
	String[] list = { "�ҳ�Ÿ", "SM5", "�׷���", "���׽ý�", "K9" };
	List<String> car = new ArrayList<>();


	synchronized void pop() {
		while (car.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		notifyAll();
		System.out.println(Thread.currentThread().getName() + ":" + car + "���");
		car.remove(0);

	}
	
	synchronized void push() {
		while (!car.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		car.add(list[(int) (Math.random() * 5)]);
		notifyAll();
		System.out.println(Thread.currentThread().getName() + ":" + car + "����");

	}
}

class Seller extends Thread {
	CarMarket market;

	Seller(CarMarket market) {
		super("�Ǹ���");
		this.market = market;
	}
	public void run() {
		for (int i = 0; i < 20; i++) {
			market.pop();
			try {
				sleep((int) (Math.random() * 5000));
			} catch (InterruptedException e) {
			}
		}
	}
}

class Producer extends Thread {
	CarMarket market;

	Producer(CarMarket market) {
		super("������");
		this.market = market;
	}
	public void run() {
		for (int i = 0; i < 20; i++) {
			market.push();
			try {
				sleep((int) (Math.random() * 2000));
			} catch (InterruptedException e) {
			}
		}
	}
}

public class problem5 {
	public static void main(String[] args) {
		CarMarket car = new CarMarket();
		Thread seller = new Seller(car);
		Thread producer = new Producer(car);
		seller.start();
		producer.start();
		
	}
	
}
