package chap7;

public class problem2 {
	public static void main(String[] args) {
		
		Rectangle[] r = new Rectangle[3];		
				
		
		for(int i=0;i<r.length;i++) {
		r[i] = new Rectangle();
		r[i].width = i+10;
		r[i].height = i+20;
		System.out.println(i+"번 사각형 넓이");
		r[i].area();
		System.out.println(i+"번 사각형 둘레");
		r[i].length();
		}
		
		
	}

}
