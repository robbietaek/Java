package finalt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class home {

	public static void main(String[] args) throws IOException {
		
		
		List<String> text = new ArrayList<>();
		
		String path = "D:\\taek\\20190812\\sql\\workspace\\chap1\\chap9\\src\\chap9\\PrinterEx1.java";
		
		
//		FileInputStream fis1 = new FileInputStream(path);
//		int data1 = 0;
//		
//		while((data1=fis1.read())!= -1) {
//			System.out.print((char)data1);
//			
//		}
		
		

		FileInputStream fis2 = new FileInputStream(path);
		byte buff[] = new byte[16];
		int data2 = 0;
		while((data2=fis2.read(buff)) != -1) {
			text.add(new String(buff,0,data2));
		}
		
		System.out.println(text.get(0));
		
		
//		FileInputStream fis3 = new FileInputStream(path);
//		buff = new byte[fis3.available()];
//		int data3 = 0;
//		while((data3=fis3.read(buff,0,buff.length))!=-1) {
//			System.out.println(new String(buff,0,data3));
//		}
		
	}

}
