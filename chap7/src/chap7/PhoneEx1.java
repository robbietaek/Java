package chap7;

class Phone {

		String color;
		boolean power;
		String no;
		void power() {power =!power;}
		void send(String no) {
			System.out.println(no + "�� ��ȭ �۽� ��~~");
		}
		void receive(String no) {
			System.out.println(no+"�� ��ȭ ���� ��~~");
		}

}

public class PhoneEx1{
public static void main(String[] args) {
	
	Phone p1 = new Phone();
	p1.color = "����";
	p1.power = true;
	p1.no = "01012341234";
	System.out.println(p1.color + "," + p1.power+ "," + p1.no);
	p1.send("01043214321");
	p1.receive("01043214321");
	
	Phone p2 = new Phone();
	p2 = p1;
	System.out.println(p2.color + "," + p2.power+ "," + p2.no);
}

}
