package chap15;

import java.io.*;

public class FileOutputStreamEx2 {
	public static void main(String[] args) {
		firstmethod();
	}

	private static void firstmethod() {
		secondMethod();
	}

	private static void secondMethod() {
		try {
			throw new Exception("파일 예외 메시지 저장하기");
		} catch (Exception e) {
			e.printStackTrace(); //표준오류객체로 메시지 출력.
			try {
				/*
				 * ("error.log",true)
				 * "error.log" : 생성할 파일의 이름. 파일 없으면 생성, 파일이 있으면 내용변경
				 * true /false : true : 파일이 있는 경우 기존의 내용에 새로운 내용을 추가
				 * 				false : 파일 이있는 경우 기존의 내용을 새로운 내용으로 변경
				 */
				FileOutputStream fos = new FileOutputStream("error.log",true);
				fos.write(e.getMessage().getBytes());
				e.printStackTrace(new PrintStream(fos)); //error.log 파일에 e.printStackTrace() 내용을 출력
				fos.write("====================\n\n.".getBytes());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
