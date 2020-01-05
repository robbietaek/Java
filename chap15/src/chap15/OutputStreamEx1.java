package chap15;

import java.io.*;

public class OutputStreamEx1 {
	public static void main(String[] args) throws IOException {
//		Writer out = new OutputStreamWriter(System.out);
//		PrintStream out = System.out;
		OutputStream out = System.out;
		out.write('1');
		out.write('2');
		out.write('3');
		out.write('a');
		out.write('b');
		out.write('c');
		out.write('°¡');
		out.write('³ª');
		out.write('´Ù');
		out.flush();
		

	}
}
