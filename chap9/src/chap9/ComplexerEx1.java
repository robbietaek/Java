package chap9;

interface Printerable{
	int INK = 100;
	void print();
}

interface Scannerable{
	void scan();
}

interface Faxable{
	String FAX_NO="010-12345";
	void send(String tel);
	void receive(String tel);
}

interface Complexerable extends Printerable,Scannerable,Faxable{}

class Complexer implements Complexerable{
	int ink;
	Complexer(){
		this.ink = INK;
	}


@Override
public void print() {
	System.out.println("���̿� ����մϴ�. ���� ��ũ�� "+ --ink);
}
@Override
public void scan() {
	System.out.println("�̹����� ��ĵ�մϴ�.");
}
@Override
public void send(String tel) {
	System.out.println(FAX_NO+"���� "+tel+"��ȣ�� FAX�� �����մϴ�.");
}
@Override
public void receive(String tel) {
	System.out.println(tel+"���� "+FAX_NO+"�� FAX�� �޾ҽ��ϴ�.");
}
}


public class ComplexerEx1 {
	public static void main(String[] args) {

		Complexer com = new Complexer();
		System.out.println("�⺻ ��ũ��"+ Printerable.INK);
		System.out.println("FAX ��ȣ"+Complexerable.FAX_NO);
		com.print();
		com.scan();
		com.receive("02-5678");
		com.send("02-5678");
		
		if(com instanceof Complexerable) {
			System.out.println("com ���������� ��ü�� Complexerable ��ü��");
			Complexerable ca = com;
			ca.print();
			ca.scan();
			ca.receive("02-1234");
			ca.send("02-1234");
		}
		
		if(com instanceof Complexer) {
			System.out.println("com ���������� ��ü�� Complexer ��ü��");
		}
		
		if(com instanceof Printerable) {
			Printerable pa = com;
			pa.print();
			System.out.println(pa.INK);
		}
		if(com instanceof Scannerable) {
			Scannerable sc = com;
			sc.scan();
			
		}
		if(com instanceof Faxable) {
			Faxable fa = com;
			System.out.println(fa.FAX_NO);
			fa.send("02-3456");
			fa.receive("02-3456");
		}
	}
}
