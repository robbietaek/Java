package chap16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * String[] data = {}
 * list<String> words = new ArrayList<String>(); 
 * 3�ʿ� �� ���� words�� data �� ������ �̸��� �߰��ϱ�. =>������(DataAddThread)�� �ۼ�
 * ȭ�鿡 �Էµ� �̸���, words �� ����� �̸��� ���� ��� words���� �Էµ� �̸��� �����Ѵ�.
 * words�� ��� �����Ͱ� �����Ǹ� ���α׷��� �����Ѵ�. 
 */

class New extends Thread {

	static List<String> words = new ArrayList<String>();
	static String[] data = { "����", "����", "���", "�糪", "��ȿ", "�̳�", "����", "ä��", "����" };

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
		System.out.println("����Ǿ����ϴ�.");
	}
}
