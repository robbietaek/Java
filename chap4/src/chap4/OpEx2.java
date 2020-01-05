package chap4;

public class OpEx2 {

	public static void main(String[] args) {
		int x=5,y=5;
		
		y= x++;
		
		System.out.println("X="+x+",Y="+y);
		
		y = ++x;
		
		System.out.println("X="+x+",Y="+y);
		System.out.println("X="+ x++);
		System.out.println("X="+ ++x);
		
		x = y--;
		System.out.println("X="+x+",Y="+y);
	}

}
