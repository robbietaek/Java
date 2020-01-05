package chap15;

import java.io.*;
import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) throws IOException {

		try {
		
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		
		String name = "src/chap15/"+ in + ".java";
		FileInputStream fr = new FileInputStream(name);
		int data = 0;
		byte[] buf = new byte[fr.available()];
		
		while((data=fr.read(buf)) != -1) {
		System.out.print(new String(buf));
		}
		}catch(Exception e){
			System.out.println("해당파일없음");
		}
		
		
	}
}
