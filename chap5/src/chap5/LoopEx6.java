package chap5;

import java.util.Scanner;

public class LoopEx6 {
public static void main(String[] args) {
	
	System.out.println("���ڸ� �Է��ϼ��� (����:99999)");
	Scanner scan = new Scanner(System.in);

	double sum = 0;
	double cnt = 0;
	
	
	while(true) {
		int num = scan.nextInt();
		if(num==99999)break;{}
		cnt++;
		sum += num;
		
	}
	System.out.println(sum);
	System.out.println((double)(sum/cnt));
}
}
