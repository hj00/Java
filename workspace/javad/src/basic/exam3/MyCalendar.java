package basic.exam3;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 : ");int year = sc.nextInt();
		System.out.print("월 : ");int month = sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		int week = c.get(Calendar.DAY_OF_WEEK); // 1일이 무슨 요일인가.
		int end_day = c.getActualMaximum(Calendar.DATE); // 마지막 날이 며칠인가?
		
		System.out.println(year + "년 " + month + "월 ");
		System.out.println(" -------------------");
		System.out.println(" 일 월 화 수 목 금 토");
		System.out.println(" -------------------");
		for(int d=1; d < week; d++) {
			System.out.print("   ");
		} // 1일 전까지 달력의 공백을 찍어주는 for 문.
		for(int d=1, w=week; d <= end_day; d++, w++){
			System.out.print(d < 10 ? " " + d + " " : d + " ");
			if (w%7 == 0) System.out.println();//주가 끝날 때 마다 한 줄 밑으로 내려가도록.
		}
		
	}

}
