package chap12;

import java.util.Calendar;

public class CalendarEx1 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.println("올해 년도 : " + today.get(+Calendar.YEAR));
		System.out.println("이번달 : " + (today.get(Calendar.MONTH) + 1));
		System.out.println("년도기준 몇째주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("월기준 몇째주 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("일자 : " + today.get(Calendar.DATE));
		System.out.println("일자 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("년도기준날짜 : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1(일)~7(토): " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("월기준몇째요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전(0)_오후(1)" + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11):" + today.get(Calendar.HOUR));
		System.out.println("시간(0~13):" + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59):" + today.get(Calendar.MINUTE));
		System.out.println("밀리초(0~999):" + today.get(Calendar.SECOND));
		System.out.println("Timezone(-12:12) : " + today.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000));
		System.out.println("이번달의 마지막일자 :" + today.getActualMaximum(Calendar.DATE));
		Calendar cal = Calendar.getInstance();
		cal.set(2019, (12 - 1), 30);
		System.out.println("날짜:" + cal.get(Calendar.YEAR) + "년" + (cal.get(Calendar.MONTH) + 1) + "월"
				+ cal.get(Calendar.DATE) + "일");
		// 12월의 마지막 일자

		String week = null;
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			week = "일요일";
			break;
		case 2:
			week = "월요일";
			break;
		case 3:
			week = "화요일";
			break;
		case 4:
			week = "수요일";
			break;
		case 5:
			week = "목요일";
			break;
		case 6:
			week = "금요일";
			break;
		case 7:
			week = "토요일";
			break;
		}
		System.out.println("마지막날짜:" + cal.get(Calendar.YEAR) + "년" + (cal.get(Calendar.MONTH) + 1) + "월"
				+ cal.getMaximum(Calendar.DATE) + "일 " + week);

	}
}
