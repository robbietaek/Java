package chap7;

/*
 * 3. Coin 클래스와 구동 클래스 구현하기
  Coin 클래스
   멤버변수 : int side (앞면:0, 뒷면:1), serialNo(동전번호), sno(동전번호 생성을위한 클래스변수)
   멤버메서드 : void flip()
                Math.random() 메서드를 사용하여 side를 결정.

  구동클래스
    Coin 클래스의 객체를 10개 생성하기.
    객체생성시, 동전번호를 입력하고, flip() 메서드를 이용하여 각각의 동전이 앞면인지 뒷면인지
    여부를 출력하기
  [결과]
1번동전 : 앞면
2번동전 : 뒷면
  ....

전체 앞면 동전의 갯수 :
전체 뒷면 동전의 갯수 :
 */

class Coin{
	int side;
	int serialNo;
	static int sno;
	
	void flip() {
		side = (int)(Math.random()*1+1);
	}
	
	public String toString() {
		return serialNo+"번 동전 ="+ side;
	}
}

public class homework3 {
	public static void main(String[] args) {

		Coin user[] = new Coin[10];
		
		
		int front = 0;
		int back = 0;
		
		for(int i=0;i<10;i++) {
			user[i] = new Coin();
			user[i].serialNo = Coin.sno++;

		}

	}

}
