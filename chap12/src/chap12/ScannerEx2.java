package chap12;

import java.util.Scanner;
import java.io.File;

public class ScannerEx2 {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(new File("score.txt"));
		int cnt = 0;
		int totalSum=0;
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			Scanner scan2 = new Scanner(line).useDelimiter("\\s*,\\s*");
			double sum = 0;
			int i = 0;
			String name = scan2.next();
			System.out.print(name+":");
			while(scan2.hasNextDouble()) {
				double score = scan2.nextDouble();
				sum += score;
				System.out.print(score + ",");
				i++;
			}
			System.out.println("sum ="+ sum+",avg="+((int)(sum/i*100))/100.0);
			totalSum += sum;
			cnt++;
		}
		System.out.println("ÀÎ¿ø¼ö"+cnt);
	}
}
