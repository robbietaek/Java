package chap18;

public class LambdaEx2 {
	public static void main(String[] args) {
		System.out.println("main 시작");
		Runnable r = () -> {
			int sum=0;
			for(int i=1;i<=100;i++) {
				sum += i;
			}
			System.out.println("1부터 100까지의 합1 : " + sum);
		};
		
		Thread t = new Thread(r);
		Thread t1 = new Thread(()->{
			int sum=0;
			for(int i=1;i<=100;i++) {
				sum += i;
			}
			System.out.println("1부터 100까지의 합2 : " + sum);
		});
		
		t.start();
		t1.start();
	
		System.out.println("main 종료");
	}
}
