package chap7;


class card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	public String toString() {
		return kind + ":" + number + "(" + width + "," + height + ")";
	}
}


public class problem3 {

	public static void main(String[] args) {

		card card1 = new card();
		
		card1.kind = "heart";
		card1.number = 1;
		System.out.println(card1.toString());
		
		card card2 = new card();
		card2.kind = "spade";
		card2.number = 1;
		System.out.println(card2.toString());
		
		card.width = 50;
		card.height = 80;
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		
		
		
		

	}

}
