package chap5;

public class LoopEx4 {

	public static void main(String[] args) {
		
		for(int k=2;k<=9;k++) {
			System.out.print(k+"´Ü"+"	");
		}
			System.out.println();
		
		for(int i=2;i<=9;i++) {			
			for(int j=2;j<=9;j++) {
				System.out.print(j+"*"+i+ "="+ j*i +"	");							
			}
			System.out.println();
		}
	}

}
