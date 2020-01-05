package chap8;

class Bike3{
	int wheel;
	int price = 10;
	
	Bike3(int wheel){
		this.wheel = wheel;
	}
	
	void drive() {
		System.out.println("�д��� ��´�");
	}
	
	void stop() {
		System.out.println("�극��ũ�� ��´�");
	}
}

class AutoBike3 extends Bike3{
	boolean power;
	int price =  200;
	
	AutoBike3(int wheel){
		super(wheel);
	}
	
	void power() {
		power = !power;
		if(power) {
			System.out.println("������ �������ϴ�.");
		}
		else {
			System.out.println("������ �������ϴ�.");
		}
	}	
	
	@Override
	void drive() {
		if(!power) {
			power();
		}
		System.out.println("��� ��ư�� ������.");
	}
	
	@Override
	void stop() {
		if(power) {
			System.out.println("������ư�� ������.");
		}
		else {
			System.out.println("������ư�� �������ϴ�. ���� �� �����ϴ�.");
		}
	}
}

public class BikeEx3 {

	public static void main(String[] args) {

		AutoBike3 auto = new AutoBike3(2);
		System.out.println("������"+auto.price+"���� �Դϴ�");
		auto.drive();
		auto.stop();
		Bike3 bike = auto;
		System.out.println("������"+bike.price+"���� �Դϴ�.");
		bike.drive();
		bike.stop();
		
		

	}

}
