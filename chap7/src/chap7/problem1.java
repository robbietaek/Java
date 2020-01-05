package chap7;

class Rectangle{
	int width;
	int height;
	
	void area() {
		System.out.println("≥–¿Ã = "+ width*height);
	}
	
	void length() {
		System.out.println("µ—∑π = "+ 2*(width+height));
	}
}




public class problem1 {
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		
		r1.width = 30;
		r1.height = 20;		
		
		r1.area();
		r1.length();
		
		Rectangle r2 = new Rectangle();
		
		r2.width = 100;
		r2.height = 20;
		
		r2.area();
		r2.length();
		
	}

}
