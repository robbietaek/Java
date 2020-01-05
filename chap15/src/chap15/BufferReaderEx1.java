package chap15;

import java.io.*;

public class BufferReaderEx1 {
	public static void main(String[] args) throws IOException {
		String data = null;
		FileWriter fw = new FileWriter("buffered.txt", true);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		while ((data = br.readLine())!=null) {
			System.out.println(data);
			fw.write(data+"\n");
		}
		
		fw.flush();
		fw.close();
	}
}
