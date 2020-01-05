package chap5;

public class LoopEx2 {

	public static void main(String[] args) {
		
		int num = 0;
		int i = 0;
		for(i=1;i<=10;i++) { 
			num +=i;
		}
		System.out.println(num);
		
		num = 0;
		i= 0;
		while(i<=10) {
			num += i;
			i++;
		}
		System.out.println(num);
		
		num = 0;
		i = 0;
		do {
			num += i;
			i++;			
		}while(i<=10);
		System.out.println(num);
		
	}
}
