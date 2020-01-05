package chap19;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToStreamEx1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("src/chap19/FilterStreamEx1.java")));
		br.lines().forEach(s -> System.out.println(s));

		System.out.println("���� ����� ��Ʈ���� �̿��Ͽ� ȭ�鿡 ���");
		Path path = Paths.get("src/chap19");
		Stream<Path> st = Files.list(path);
		st.forEach(p -> System.out.println(p.getFileName()));
	}
}