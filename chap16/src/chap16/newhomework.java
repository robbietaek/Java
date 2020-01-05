package chap16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DataAddThread extends Thread{
	List<String> words;
	String[] data;
	int interval;
	public DataAddThread(List<String> words, String[] data, int interval) {
		this.words = words;
		this.data = data;
		this.interval = interval;
	}
	
	public void run() {
		while(true) {
			try {
				sleep(interval);
			} catch(InterruptedException e) {}
			words.add(data[(int)(Math.random() * data.length)]);
		}
	}
}


public class newhomework {
	List<String> words = new ArrayList<>();
	String[] data = { "나연", "정연", "모모", "사나", "지효", "미나", "다현", "채영", "쯔위" };
	int interval = 3 * 1000;

	public static void main(String[] args) {
		newhomework g = new newhomework();
		g.game();
		System.out.println("프로그램 종료");
	}

	private void game() {
		Scanner scan = new Scanner(System.in);
		words.add(data[0]);
		DataAddThread t1 = new DataAddThread(words, data, interval);
		t1.setDaemon(true);
		t1.start();
		while (true) {
			System.out.println(words);
			System.out.print(">>");
			String input = scan.nextLine().trim();
			words.remove(input);
			if (words.size() == 0)
				break;
		}
	}
}
