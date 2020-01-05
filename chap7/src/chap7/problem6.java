package chap7;

class Rectangle3{
	int width;
	int height;
	int serialNo;
	static int sno;
	
	Rectangle3(int a, int b){
		width = a;
		height = b;
		serialNo = ++Rectangle3.sno;
	}
	
	int area() {
		return width*height;
	}
	
	int length() {
		return 2*(width+height);
	}
	
	boolean isSquare() {
		return (width==height);
	}
	
	void info(){
		System.out.println(serialNo+"번 사각형 : ("+width+","+height+") 넓이 :"+ area() + " 둘레 :"+ length() +" "+ (isSquare()?"정사각형":"직사각형"));
	}
}

public class problem6 {
	public static void main(String[] args) {

		Rectangle3[] recarr = new Rectangle3[3];
		recarr[0] = new Rectangle3(10,10);
		recarr[1] = new Rectangle3(20,10);
		recarr[2] = new Rectangle3(25,25);
		
		for(Rectangle3 r: recarr) {
			r.info();
		}

	}
}
