package chap8;

/*
 * 다성형 예제
 * Buyer가 전자제품 구매하기
 * 
 * Product 클래스
 * 멤버변수 : 가격, 포인트
 * 생성자 : 가격을 입력받고, 가격의 10%를 포인트로 저장
 * TV 클래스
 * 가격이 100 설정하기
 * toString() 메서드에서 Tv를 리턴
 * Computer 클래스
 * 가격이 200 설정하기
 * toString() 메서드에서 Computer 리턴
 * SmartPhone 클래스
 * 가격이 150 설정하기
 * toString() 메서드에서 SmartPhone을 리턴
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
	return "TV 구입함";
	}
}

class Computer extends Product{

	Computer(){
		super(200);
	}

public String toString(){
	return "Computer 구입함";
	}
}

class SmartP extends Product{

	SmartP(){
		super(150);
	}

	public String toString(){
	return "SmartP 구입함";

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
			System.out.println(p+"상품 : 가격 ="+p.price + ", 포인트"+p.point);
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
		System.out.println("구매 후 잔액"+b.money);
		System.out.println("구매 후 적립 포인트"+b.point);
		System.out.println("================================================");
		b.summary();
	}

}
