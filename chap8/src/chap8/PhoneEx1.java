package chap8;

class Phone{
	boolean power;
	int number;
	void power() {
		power =! power;
	}
	
	void send() {
		if(power)
			System.out.println("��ȭ�ɱ�");
		}
	
	void receive() {
		if(power)
			System.out.println("��ȭ�ޱ�");
	}
	
}

class SmartPhone extends Phone{
	void setApp(String name) {
		if(power)
			System.out.println(name + "��ġ �� ==");
	}
	
}



public class PhoneEx1 {

	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone();
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("���̹�");
	}
}
