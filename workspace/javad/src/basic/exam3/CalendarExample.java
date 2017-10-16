package basic.exam3;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
        
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		             /* 월 정보는 +1을 해줘야 함. 
					    C로 java를 짠 관계로 C에서 월을 배열로 담아서 
					    +1로 해줘야함? */
		// Calendar type 사용시 month의 경우 꺼내올 때는 +1, 저장할 때는 -1?
		int day = now.get(Calendar.DATE);
		int week = now.get(Calendar.DAY_OF_WEEK);
		// DAY_OF_WEEK : 일월화수목금토 순서로 1,2,3,4,5,6,7 출력됨.
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		default:
			strWeek = "일";
		}

		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}

		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.println("년도 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + day);
		System.out.println("몇번째 요일 : " + week);
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + " 시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
		
		Calendar now2 = Calendar.getInstance();
		now2.set(2017, 5, 18); //저장할 때는 month -1
		int year2 = now2.get(Calendar.YEAR);
		int month2 = now2.get(Calendar.MONTH) + 1;
		int day2 = now2.get(Calendar.DATE);
		int week2 = now2.get(Calendar.DAY_OF_WEEK);
		System.out.println("년도 : " + year2);
		System.out.println("월 : " + month2);
		System.out.println("일 : " + day2);
		System.out.println("몇번째 요일 : " + week2);
		
		

	}

}
