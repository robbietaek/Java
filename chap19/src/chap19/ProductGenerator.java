package chap19;

/*
 * 대용량 데이터를 product.txt 파일로 생성하기
 */
import java.io.*;

public class ProductGenerator {
	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;
		String[] cars = {"아반테", "그랜저", "BMW", "Benz", "라세티"};
		String[] remark = {"몰라요", "싫어요", "그냥이요"};
		int limit  = 0;
		int con = 0;
		try {
			fos = new FileOutputStream("product.txt");
			ps = new PrintStream(fos);
			while(limit ++<1000) {
				ps.print((int)(Math.random()*12)+1+",");	//1월부터 12월까지의 판매월
				con=(int)(Math.random()*3)+1;				//1~3까지의 값. 1.생산 , 2.판매, 3.반품
				ps.print((int)(Math.random()*3)+1 +",");
				ps.print(cars[(int)(Math.random()*5)] + ",");	//자동차 이름
				ps.print((int)(Math.random()*5)+1 + ",");				//수량 1~5까지 판매수량
				if(con==3) {
					ps.print("");
					ps.print(remark[(int)(Math.random()*3)]);	//반품사유
				}
				ps.println();
			}
			System.out.println("파일생성완료");
			ps.flush(); ps.close(); fos.close();
		} catch(IOException e) {
			e.getStackTrace();
		}
	}
}
