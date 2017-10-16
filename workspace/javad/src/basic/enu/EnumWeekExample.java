package basic.enu;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WENDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println(week);
		System.out.println("오늘 요일 : " + today);
		System.out.println("오늘 요일 : " + today.name());
		System.out.println(today.ordinal()); //enum은 0부터 시작.
		System.out.println(today.compareTo(Week.SATURDAY));
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
		
		System.out.println(week);
		
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}

}
