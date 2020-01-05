package chap7;

class SutdaCard{
	int number;
	boolean iskwang;
	
	
	SutdaCard(int a,boolean b){
		number = a;
		iskwang = b;		
	}
	
	SutdaCard(){
		number = 1;
	}
		
	public String toString() {
		return " "+number+((number==1||number==8)?"K":"");
	}
}

public class homework4 {

	 public static void main(String[] args) {
		  SutdaCard card1 = new SutdaCard(3,false);
		  SutdaCard card2 = new SutdaCard();
		  System.out.println(card1);//3
		  System.out.println(card2);//1K
		 }
	}

