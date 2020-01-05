package chap8;

class Bike4{
	int wheel;
	int price = 10;
	Bike4(int wheel){
		this.wheel = wheel;
	}
	
	void drive() {
		System.out.println(price+"����¥�� �������� �д��� ��´�.");
	}
	
	void stop() {
		System.out.println(price+"����¥�� �������� �극��ũ�� ��´�");
	}
}

class AutoBike4 extends Bike4{
	boolean power;
	int price = 200;
	AutoBike4(int wheel){
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
		System.out.println(super.price+"����¥�� �������� ��� ��ư�� ������");
	}
	
	@Override
	void stop() {
		if(power) {
			System.out.println(super.price + "����¥�� �������� ���� ��ư�� ������");
		}
		else {
			System.out.println("������ �������ϴ�. ���� �� �����ϴ�.");
		}
	}
}

public class BikeEx4 {
	public static void main(String[] args) {

		AutoBike4 auto = new AutoBike4(2);
		System.out.println("������" + auto.price+"���� �Դϴ�");
		auto.power();
		auto.drive();
		auto.stop();
		Bike4 bike = auto;
		System.out.println("������"+bike.price+"�����Դϴ�");
		bike.drive();
		bike.stop();
	
	}

}
