package chap7;

class Rectangle2{
	int width;
	int height;
	int serialNo;
	static int sno;
	
	int area() {
		return width*height;
	}
	
	int length() {
		return 2*(width+height);
	}
	

	public String toString() {
		return serialNo+"번 사각형 ("+width+","+height+")=> 면적:"+area()+" , 둘레:"+length();
	}
	
}

public class problem4 {

	public static void main(String[] args) {

		
		Rectangle2 arr[] = new Rectangle2[3];
		int totalArea = 0;
		int totalLength = 0;
		for(int i=0; i<arr.length;i++) {
			arr[i] = new Rectangle2();
			arr[i].width = i*5+10;
			arr[i].height = i*5+20;
			arr[i].serialNo = ++Rectangle2.sno;
			System.out.println(arr[i]);
			totalArea += arr[i].area();
			totalLength += arr[i].length();

		}
		System.out.println("전체 사각형 면적의 합: " + totalArea);
		System.out.println("전체 사각형 둘레의 합: " + totalLength);
		
	}

}
