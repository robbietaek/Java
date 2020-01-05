package chap15;

import java.io.*;
import java.util.Date;

public class FileEx2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/temp1"); // temp1 폴더 지정. 현재는 없는 폴더임.
		System.out.printf("%s 폴더생성 : %b\n", f1.getAbsolutePath(),f1.mkdir());
		
		
		
		File f2 = new File("c:/temp1/test.txt"); //존재하지 않는 파일
		//boolean f2.createNewFile() : 파일생성
		System.out.printf("%s 파일생성 : %b\n", f2.getAbsolutePath(),f2.createNewFile());
		System.out.printf("파일이름 : %s, 파일크기 : %,d byte \n", f2.getName(), f2.length());
		
		
		
		File f3 = new File("c:/temp1/test2.txt");
		//boolean f2.renameTo(f3) : f2 파일을 f3로 변경
		System.out.printf("%s->%s 이름변경 : %b\n", f2.getName(),f3.getName(),f2.renameTo(f3));
		//long f3 lastModified() : 1970년부터 밀리초 리턴
		System.out.printf("%s 파일 최종 수정시간 : %s\n",f3.getName(),new Date(f3.lastModified()));
		System.out.printf("%s 파일삭제 : %b\n", f3.getName(),f3.delete());
	}
}
