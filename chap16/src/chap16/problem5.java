package chap16;
/*
 * CarMarket 클래스 : 자동차 판매소
 * 멤버변수 : String car;
 * 멤버 메서드 : 
 * 	Synchronized void push() : car 멤버에 자동차 저장
 * 			{"소나타", "SM5", "그랜저", "제네시스", "K9"} 중 한개를 car에 저장
 * 			기존에 car == null인 경우만 저장가능.
 * 		synchronized void pop() : 저장된 car를 출고
 * 				car == null; 로 변경
 * 				car != null; 인 경우만 출고 가능
 * 
 *  Seller 클래스 : 판매워. Thread 클래스
 *  	0 ~ 2000 밀리초 임의로 sleep
 *  	pop()메서드를 호출하기
 *  Producer 클래스 : 공급자. Thread 클래스
 *  0~5000밀리초 임의로 sleep
 *  push()메서드를 호출하기
 */

import java.util.ArrayList;
import java.util.List;

class CarMarket {
	String[] list = { "소나타", "SM5", "그랜저", "제네시스", "K9" };
	List<String> car = new ArrayList<>();


	synchronized void pop() {
		while (car.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		notifyAll();
		System.out.println(Thread.currentThread().getName() + ":" + car + "출고");
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
		System.out.println(Thread.currentThread().getName() + ":" + car + "공급");

	}
}

class Seller extends Thread {
	CarMarket market;

	Seller(CarMarket market) {
		super("판매자");
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
		super("공급자");
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
