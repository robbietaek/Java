package chap12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {
	public static void main(String[] args) {

		Date day = null;
		String strDate = "2019년12월31일";
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy년MM월dd일");
		try {
			day =sf2.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd 날짜의 요일은 E 요일 입니다.");
		System.out.println(sf3.format(day));

		
		
	}
}
