package chap15;

import java.util.*;
import java.io.*;

public class Exam4 {
	public static void main(String[] args) {
		String filepath = "c:\\windows";
		File file = new File(filepath);
		String[] filelist = file.list();

		int i = 0;
		int j = 0;
		long sum = 0;

//		for (int s =0; s<filelist.length;s++) {
//			File f1 = new File(filepath, filelist[s]);
//			if (f1.isDirectory()) {
//				i++;
//			} else if (f1.isFile()) {
//				j++;
//			}
//			sum += f1.length();
//		}

		for (String s : filelist) {
			File f1 = new File(filepath, s);
			if (f1.isDirectory()) {
				i++;
			} else if (f1.isFile()) {
				j++;
				sum += f1.length();
			}

		}

		System.out.println("디렉토리의 개수 : " + i + ", 파일의 개수 : " + j + ", 총 메모리 : " + sum + "byte");
	}
}
