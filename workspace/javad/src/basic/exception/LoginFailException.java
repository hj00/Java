package basic.exception;

import java.io.FileWriter;
import java.io.IOException;

public class LoginFailException extends RuntimeException {
	public LoginFailException(String error_msg, MemberVO memberVO) {
		super(error_msg);
		//File f = new File("log.txt");
		try {
			FileWriter fw = new FileWriter("log.txt", true); // true : 있으면 이어서 쓰고 없으면 새로 만들어라.
			fw.write("아래와 같은 로그인 시도가 있었음\n");
			fw.write(memberVO.toString() + "\n");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
