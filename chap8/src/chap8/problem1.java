package chap8;

class SutdaCard{
	int number;
	boolean isKwang;
	
	SutdaCard(int number,boolean isKwang){
		this.number=number;	
		this.isKwang=isKwang;
	}
	SutdaCard(){
		this(1,true);
	}
	
	void info() {
		System.out.println(this);
	}
	
	public String toString() {
		return (number+(isKwang?"K":""));
	}
}


class SutdaDeck{
	
	SutdaCard[] cards = new SutdaCard[20];

	SutdaDeck(){
		for(int i=0; i<cards.length;i++) {
			cards[i] = new SutdaCard((i%10)+1,(i==0||i==2||i==7)?true : false);
			
		}
	}
		
	public String toString() {
		String result = "";
		for(SutdaCard c : cards) {
			result += c.toString()+",";
		}
		return result;
	}
	
	
	void shuffle() {
		
		SutdaCard temp;
		
		for(int i = 0; i<1000;i++) {
			int random1 = (int)(Math.random()*20);
			int random2 = (int)(Math.random()*20);
			temp = cards[random1];
			cards[random1] = cards[random2];
			cards[random2] = temp;
		}
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() {
		return cards[(int)(Math.random()*20)];
	}
		
	}








public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck);
		deck.shuffle();
		System.out.println(deck);
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
	}

}
