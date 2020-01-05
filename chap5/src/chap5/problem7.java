package chap5;

public class problem7 {

	public static void main(String[] args) {

		int num=0;
		for(int i =1;i<=100;i++) {
			if(i%2==0 || i%3==00) {
				num += i;
			}
		}
			System.out.println(num);

		num=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0 || i%3==00) continue;
			num +=i;
			}
			System.out.println(num);
		}
	}


