package chap7;

class Circle{
	double r;
	int x;
	int y;
	int no;
	static int count;
	
	Circle(double x, int y, int z){
		this.r = x;
		this.x = y;
		this.y = z;
		no = ++Circle.count;
	}
	
	Circle(int x, int y){
		this.r = 1;
		this.x = x;
		this.y = y;
		no = ++Circle.count;
	}
	
	Circle(double r){
		this.r = r;
		this.x = 0;
		this.y = 0;
		no = ++Circle.count;
	}
	
	
	double area() {
		return Math.PI*r*r;
	}
	
	double length() {
		return Math.PI*2*r;
	}
	
	void move(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	void scale(double r) {
		this.r *=r;
	}
	
	public String toString() {
	return 	no+"번원 : 반지름 : "+r +" 좌표 : ("+x+","+y+"), 넓이 : "+area()+", 둘레 :"+length();
//		return String.format("%d번원=>반지름:%.3f, 좌표(%d,%d), 넓이:%.3f, 둘레:%3.f",no,r,x,y,area(),length());
	}
	
}


public class problem7 {

	public static void main(String[] args) {

		Circle carr[] = new Circle[3];
		carr[0] = new Circle(10,10,10);
		carr[1] = new Circle(20,20);
		carr[2] = new Circle(100);
		
		for(Circle c : carr) {
			System.out.println(c);
			c.move(10,10);
			System.out.println(c);
			c.scale(3);
			System.out.println(c);
		}

	}

}
