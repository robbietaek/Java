package chap5;

public class LoopEx1 {

	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++) {
		System.out.print(i+"¹ø");
		}
		
		int i=1;
		while(i<=5) {
			System.out.print(i+"±îÁö");
			i++;
		}
		
		i=1;
		do {
			System.out.print(i);
			i++;
		}while(i<=5);
		System.out.println();
		
	}
}
`