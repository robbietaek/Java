package chap15;

import java.util.*;
import java.io.*;

public class homework {
	public static void main(String[] args) throws IOException {

		String filepath = "src\\chap15";
		File file = new File(filepath);
		String[] filename = file.list();
		List<String> filelist = new ArrayList<>();

		for (String s : filename) {
			File f = new File(filepath, s);

			if (s.indexOf("InputStream") > 0) {
				filelist.add("src\\chap15\\" + s);
			}
		}

		FileWriter fr = new FileWriter("InputStream예제.txt", true);

		for (int i = 0; i < filelist.size(); i++) {
			FileInputStream fis = new FileInputStream(filelist.get(i));

			byte[] buff = new byte[8096];
			int data = 0;

			while ((data = fis.read(buff)) != -1) {
				fr.write(new String(buff, 0, data));
			}

		}
		fr.flush();
		fr.close();
		System.out.println("해당 파일 복사 완료");
	}
}
