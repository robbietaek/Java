package chap12;
/*
 * count 메서드 구현하기
 * int count("문자열 소스,"찾는 문자열") : 문자열 소스에서 찾는 문자열의 갯수를 리턴
 */



public class problem1 {

	public static void main(String[] args) {
		
		System.out.println(count("12345AB12Ab345AB", "12"));// 2
		System.out.println(count("12345AB12Ab345AB", "AB"));// 3
		System.out.println(count("12345", "6"));// 0
	}

	static int count(String str1, String str2) {
		
		int num = 0;
		int cnt = 0;
		
		while(true) {
			num = str1.indexOf(str2,num);
			
			if(num == -1) {
				break;
			}
			num++;
			cnt++;
		}
		return cnt;
	}

}
