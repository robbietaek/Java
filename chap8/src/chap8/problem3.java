package chap8;

/*
 * Buyer2 클래스 구현하기
 * 고객은 돈과 포인트와 장바구니를 멤버로 가진다.
 * 총 식료품 구매 건수를 가진다.
 * 메서드
 * buy(food) : 
 *  물건 구매시 보유 금액에서 물품 가격만큼 차감된다.
 *  물품의 포인트만큼 포인트가 증가된다.
 *  소유금액보다 물품값이 큰 경우 "잔액부족"메세지를 출력하고 메서드 종료
 *  물품의 물품명과 가격을 화면에 출력한다.
 *  해당 물품은 장바구니에 추가
 *  summary() : 
 *  장바구니를 조회해서 구매한 물품의 목록과 총 가격과 현재포인트를 출력한다.
 *  과일의 갯수, 과일 구매 금액, 과일 구매 목룍, 음료의 갯수, 음료 구매 금액, 음료 구매 목록, 과자의 갯수, 과자 구매 금액, 과자 구매 목룍 
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
		return price+"원 "+"당도 : "+brix;
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
		return "사과";
	}
}

class Peach extends Fruit{

	Peach(int price, double brix){
		super(price,brix);
	}
	
	public String toString() {
		return "복숭아";
	}
}
////////////////////////////////////////////////////////////////////////
class Cock extends Drink{
	
	Cock(int price, int ml){
		super(price,ml);
	}
	public String toString() {
		return "콜라";
	}
}

class Sider extends Drink{
	
	Sider(int price, int ml){
		super(price,ml);
	}
	
	public String toString() {
		return "사이다";
	}
}
///////////////////////////////////////////////////////////////////////
class Biscuit extends Snack{
	Biscuit(int price, int gram){
		super(price,gram);
	}
	public String toString() {
		return "비스켓";
	}
}

class Cookie extends Snack{
		
	Cookie(int price, int gram){
		super(price,gram);
		this.price = price;
		this.gram = gram;
	}
	
	public String toString() {
		return "쿠키";
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
			System.out.println("잔액부족"); return;
		}
		else {
		money -= f.price;
		point += f.point;
		System.out.println("물품명 : "+ f +"가격 : "+f.price);
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
		System.out.println("총 구매 금액 : "+total +",총 구매 건수" + cnt);
		System.out.println("과일구매 금액 : "+ftotal+", 과일 구매 건수 : "+fcnt);
		System.out.println("과일 구매 목록" + flist);
		System.out.println("음료구매 금액 : "+dtotal+", 음료 구매 건수 : "+dcnt);
		System.out.println("음료 구매 목록" + dlist);
		System.out.println("과자구매 금액 : "+stotal+", 과자 구매 건수 : "+scnt);
		System.out.println("과자 구매 목록" + slist);
	}		
}





public class problem3 {
	public static void main(String[] args) {

		Apple apple = new Apple(100,10.5);
		System.out.println("사과 가격 "+apple.price);
		System.out.println("사과 당도 "+apple.brix);
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
		System.out.println("고객 잔액 : "+b.money);
		System.out.println("고객 포인트 : " + b.point);
		b.summary();
	}

}
