package chap16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * String[] data = {}
 * list<String> words = new ArrayList<String>(); 
 * 3초에 한 번씩 words에 data 중 임의의 이름을 추가하기. =>쓰레드(DataAddThread)로 작성
 * 화면에 입력된 이름과, words 에 저장된 이름이 같은 경우 words에서 입력된 이름을 삭제한다.
 * words에 모든 데이터가 삭제되면 프로그램을 종료한다. 
 */

class New extends Thread {

	static List<String> words = new ArrayList<String>();
	static String[] data = { "나연", "정연", "모모", "사나", "지효", "미나", "다현", "채영", "쯔위" };

	public void run() {
		
		while (true) {
			words.add(data[(int) (Math.random() * 9)]);
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class homework {
	public static void main(String[] args) throws InterruptedException {

		Scanner scan = new Scanner(System.in);
		Thread t = new New();
		t.setDaemon(true);
		t.start();
		Thread.sleep(10);
		while (true) {
			System.out.println(New.words);
			String answer = scan.next();
			if (answer.equals(New.words.get(0))) {
				New.words.remove(0);
			}
			if (New.words.isEmpty()) {
				break;
			}
		}
		System.out.println("종료되었습니다.");
	}
}
