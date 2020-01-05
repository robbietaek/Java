package chap8;

/*
 * �ټ��� ����
 * Buyer�� ������ǰ �����ϱ�
 * 
 * Product Ŭ����
 * ������� : ����, ����Ʈ
 * ������ : ������ �Է¹ް�, ������ 10%�� ����Ʈ�� ����
 * TV Ŭ����
 * ������ 100 �����ϱ�
 * toString() �޼��忡�� Tv�� ����
 * Computer Ŭ����
 * ������ 200 �����ϱ�
 * toString() �޼��忡�� Computer ����
 * SmartPhone Ŭ����
 * ������ 150 �����ϱ�
 * toString() �޼��忡�� SmartPhone�� ����
 * 
 */

class Product{
	double price;
	double point;
	Product(double price){
		this.price = price;
		point = price*0.1;
	}
}


class TV extends Product{
	
	TV(){
		super(100);
	}

public String toString(){
	return "TV ������";
	}
}

class Computer extends Product{

	Computer(){
		super(200);
	}

public String toString(){
	return "Computer ������";
	}
}

class SmartP extends Product{

	SmartP(){
		super(150);
	}

	public String toString(){
	return "SmartP ������";

	}
}
/////////////////////////////////////////////////////////////////////////
class Buyer{
	double money = 500;
	double point;
	Product[] cart = new Product[3];	
	int count;
	
	void buy(Product p){
		money -= p.price;
		point += p.point;
		System.out.println(p);
		cart[count++] = p;
	}
	
	void summary() {

		int sum = 0;
		String productList = "";
		for(Product p : cart) {
			if(p== null) break;
			System.out.println(p+"��ǰ : ���� ="+p.price + ", ����Ʈ"+p.point);
			productList += p+",";
			sum +=p.price;
		}
		
	}
	
	
}


public class problem2 {
	
	public static void main(String[] args) {

		Buyer b = new Buyer();
		TV tv = new TV();
		Computer com = new Computer();
		SmartP sp = new SmartP();
		b.buy(tv);
		b.buy(com);
		b.buy(sp);
		System.out.println("���� �� �ܾ�"+b.money);
		System.out.println("���� �� ���� ����Ʈ"+b.point);
		System.out.println("================================================");
		b.summary();
	}

}
