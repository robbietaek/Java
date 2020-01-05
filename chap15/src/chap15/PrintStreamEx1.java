package chap15;

import java.io.*;

public class PrintStreamEx1 {
	public static void main(String[] args) throws IOException{
		
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos,true); //auto flush ±â´É Ãß°¡
		ps.println("È«±æµ¿");
		ps.println(1234);
		ps.println(true);
		ps.println(65);
		ps.write(65);
//		ps.flush();
		
		ps = new PrintStream("print2.txt");
		ps.println("È«±æµ¿");
		ps.println(1234);
		ps.println(true);
		ps.println(65);
		ps.write(65);
		ps.flush();
		

	}
}
