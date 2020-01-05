package chap8;

/*
 * Buyer2 Ŭ���� �����ϱ�
 * ���� ���� ����Ʈ�� ��ٱ��ϸ� ����� ������.
 * �� �ķ�ǰ ���� �Ǽ��� ������.
 * �޼���
 * buy(food) : 
 *  ���� ���Ž� ���� �ݾ׿��� ��ǰ ���ݸ�ŭ �����ȴ�.
 *  ��ǰ�� ����Ʈ��ŭ ����Ʈ�� �����ȴ�.
 *  �����ݾ׺��� ��ǰ���� ū ��� "�ܾ׺���"�޼����� ����ϰ� �޼��� ����
 *  ��ǰ�� ��ǰ��� ������ ȭ�鿡 ����Ѵ�.
 *  �ش� ��ǰ�� ��ٱ��Ͽ� �߰�
 *  summary() : 
 *  ��ٱ��ϸ� ��ȸ�ؼ� ������ ��ǰ�� ��ϰ� �� ���ݰ� ��������Ʈ�� ����Ѵ�.
 *  ������ ����, ���� ���� �ݾ�, ���� ���� ��, ������ ����, ���� ���� �ݾ�, ���� ���� ���, ������ ����, ���� ���� �ݾ�, ���� ���� �� 
 */


class Food{
	int price;
	int point;
	
	Food(int price){
		this.price = price;
		this.point = price*1/10;
	}
}
//////////////////////////////////////////////////////////////////////////
class Fruit extends Food{
	double brix;
	Fruit(int price, double brix){
		super(price);
		this.brix = brix;
	}
	
	public String toString() {
		return price+"�� "+"�絵 : "+brix;
	}
}

class Drink extends Food{
	int ml;
	Drink(int price, int ml){
		super(price);
		this.ml = ml;
	}
	
}

class Snack extends Food{
	int gram;
	Snack(int price, int gram){
		super(price);
		this.gram = gram;
	}
}
/////////////////////////////////////////////////////////////////////////
class Apple extends Fruit{
	
	Apple(int price, double brix){
		super(price,brix);
	}
		
	public String toString() {
		return "���";
	}
}

class Peach extends Fruit{

	Peach(int price, double brix){
		super(price,brix);
	}
	
	public String toString() {
		return "������";
	}
}
////////////////////////////////////////////////////////////////////////
class Cock extends Drink{
	
	Cock(int price, int ml){
		super(price,ml);
	}
	public String toString() {
		return "�ݶ�";
	}
}

class Sider extends Drink{
	
	Sider(int price, int ml){
		super(price,ml);
	}
	
	public String toString() {
		return "���̴�";
	}
}
///////////////////////////////////////////////////////////////////////
class Biscuit extends Snack{
	Biscuit(int price, int gram){
		super(price,gram);
	}
	public String toString() {
		return "����";
	}
}

class Cookie extends Snack{
		
	Cookie(int price, int gram){
		super(price,gram);
		this.price = price;
		this.gram = gram;
	}
	
	public String toString() {
		return "��Ű";
	}
}
///////////////////////////////////////////////////////////////////////


class buyer2{
	
	int money = 10000;
	int point;
	int cnt;
	Food[] cart = new Food[20];
	
	void buy(Food f){
		if(money < f.price) {
			System.out.println("�ܾ׺���"); return;
		}
		else {
		money -= f.price;
		point += f.point;
		System.out.println("��ǰ�� : "+ f +"���� : "+f.price);
		cart[cnt++] = f;
	}
}

	void summary() {

		int total = 0, ftotal = 0,dtotal = 0,stotal = 0;
		int fcnt = 0,dcnt = 0,scnt = 0;
		String flist="", dlist="",slist="";
		for(Food f : cart) {
			if(f==null) break;
			total += f.price;
			if(f instanceof Fruit) {
				fcnt++;
				ftotal += f.price;
				flist += f+",";
			}
			if(f instanceof Drink) {
				dcnt++;
				dtotal += f.price;
				dlist += f+",";
			}
			if(f instanceof Snack) {
				scnt++;
				stotal += f.price;
				slist += f+",";
			}
			
		}
		System.out.println("�� ���� �ݾ� : "+total +",�� ���� �Ǽ�" + cnt);
		System.out.println("���ϱ��� �ݾ� : "+ftotal+", ���� ���� �Ǽ� : "+fcnt);
		System.out.println("���� ���� ���" + flist);
		System.out.println("���ᱸ�� �ݾ� : "+dtotal+", ���� ���� �Ǽ� : "+dcnt);
		System.out.println("���� ���� ���" + dlist);
		System.out.println("���ڱ��� �ݾ� : "+stotal+", ���� ���� �Ǽ� : "+scnt);
		System.out.println("���� ���� ���" + slist);
	}		
}





public class problem3 {
	public static void main(String[] args) {

		Apple apple = new Apple(100,10.5);
		System.out.println("��� ���� "+apple.price);
		System.out.println("��� �絵 "+apple.brix);
		Peach peach = new Peach(1000,13.5);
		Cock cock = new Cock(500,500);
		Sider sider = new Sider(1500,1000);
		Biscuit bis = new Biscuit(10000,500);
		Cookie cookie = new Cookie(500,5000);
		buyer2 b = new buyer2();
		b.buy(apple);
		b.buy(peach);
		b.buy(cock);
		b.buy(sider);
		b.buy(bis);
		b.buy(cookie);
		System.out.println("�� �ܾ� : "+b.money);
		System.out.println("�� ����Ʈ : " + b.point);
		b.summary();
	}

}
