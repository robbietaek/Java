package chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("자연수 여러개를 입력하세요.(종료 : 0)");
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		while(true) {
			int num = scan.nextInt();
			if(num%2==1) {
				list.add(num);
				sum+=num;
			} else if(num==0) {
				break;
			}
		}
		for(Integer i : list) {
			System.out.println(i);
		}
		
		
		System.out.println("입력된 솔수 : "+list);
		System.out.println("홀수의 합" +sum);
		System.out.println("최대값 : " +Collections.max(list)+ ", index:" + list.indexOf(Collections.max(list)));
		System.out.println("최소값 : " +Collections.min(list)+ ", index:" + list.indexOf(Collections.min(list)));
	}
}

