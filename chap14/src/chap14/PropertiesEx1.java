package chap14;

import java.util.*;
import java.io.*;

public class PropertiesEx1 {
	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		FileInputStream fis = new FileInputStream("a.properties");
		pr.load(fis);
		System.out.println(pr);
		System.out.println("�̸� : " + pr.get("name"));
		System.out.println("��ȭ��ȣ : " + pr.getProperty("tel"));
		pr.put("subject","��ǻ�Ͱ���");
		System.out.println(pr);
		pr.store(new FileOutputStream("b.properties"), "#save");
	}
}
