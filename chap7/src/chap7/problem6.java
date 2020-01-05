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
		System.out.println(serialNo+"�� �簢�� : ("+width+","+height+") ���� :"+ area() + " �ѷ� :"+ length() +" "+ (isSquare()?"���簢��":"���簢��"));
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
