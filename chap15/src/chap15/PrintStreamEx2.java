package chap15;

public class PrintStreamEx2 {
	public static void main(String[] args) {
		// char 형식지정문자 : %c ,%n = \n
		System.out.printf("%c%n", 'A'); // 'A' 출력
		System.out.printf("%5c%n", 'A');
		System.out.printf("%-5c%n", 'A');
		System.out.println("------------------------------");
		System.out.printf("가%d%n", 12345); //10진수 출력
		System.out.printf("나%,d%n", 12345); //세자리, 10진수 출력
		System.out.printf("다%10d%n", 12345); //10자리를 확보하고 10진수 출력
		System.out.printf("라%010d%n", 12345); //10자리를 확보하는데 빈칸을 0으로
		System.out.printf("마%3d%n", 12345); //최소 3자리 확보 10진수
		System.out.printf("바%-10d%n", 12345); // 10자리확보 좌측정렬
		System.out.printf("사%,10d%n", 12345); //10자리확보 우측정렬
		System.out.printf("아%-,10d%n", 12345); //좌측정렬 3자리마다 쉼표 10자리 확보
		System.out.printf("자%,010d%n", 12345); // 10자리확보 세자리, 빈자리0을채워 10진수 출력 ( 쉼표포함이기때문에 0이 4개)
		System.out.printf("%o%n", 12345); //8진수 출력
		System.out.printf("%x%n", 255); //a~f 소문자 표시 16진수 출력
		System.out.printf("%X%n", 255); //A~F 대문자 표시 16진수 출력
		//실수 출력 : %f, %e, %g
		System.out.println("------------------------------");
		System.out.printf("가%f%n",12345.12345); //실수 출력
		System.out.printf("나%.2f%n",12345.12345); //소숫점이하 2자리까지 실수로 출력 반올림
		System.out.printf("다%10.2f%n",12345.12345); //10자리 확보소숫점이하 2자리까지 실수 출력반올림
		System.out.printf("라%,10.2f%n",12345.12345); //10자리 확보 소숫점이하 2자리까지 실수 3자리마다 점
		System.out.printf("마%-10.2f%n",12345.12345); //좌측정렬 10자리 확보 소숫점이하 2자리까지 실수 3자리마다 점
		System.out.printf("바%,010.2f%n",12345.12345); // 10자리 남는곳 0으로 확보 소숫점이하 2자리까지 실수 3자리마다 점
		System.out.printf("사%e%n",12345.12345); //지수표현 출력 1.234512 * 10의 4승  (e+04)
		System.out.printf("아%g%n",12345.12345); //근사실수  (소숫점 표시만해줌)
		
		//논리형 : %b
		System.out.printf("%b != %b%n", true, false);
		System.out.printf("(2>3)==%b%n", (2>3));
		
		//문자열 : %s
		System.out.printf("%s은 %s 이다%n", "홍길동","의적");
		System.out.printf("%10s은 %10s 이다%n", "홍길동","의적");
		
		//문제 10진수 255는 8진수 377이고 , 16진수 FF 다.
		
		System.out.printf("10진수 %d는 8진수 %o 이고, 16진수 %X 다.",255,255,255);

	}
}
