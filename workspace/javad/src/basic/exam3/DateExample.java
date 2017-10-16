package basic.exam3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat
				("yyyy년 MM월 dd일 hh시 mm분 ss초"); //month와 minute모두 m을 사용하므로 month에는 대문자 M으로 minute은 소문자 m으로 표현
		                                            // hour의 경우 대문자 HH는 24시간 기준, 소문자 hh는 12시간 기준.
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
	}

}
