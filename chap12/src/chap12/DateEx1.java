package chap12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {
	public static void main(String[] args) {

		Date day = null;
		String strDate = "2019��12��31��";
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy��MM��dd��");
		try {
			day =sf2.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd ��¥�� ������ E ���� �Դϴ�.");
		System.out.println(sf3.format(day));

		
		
	}
}
