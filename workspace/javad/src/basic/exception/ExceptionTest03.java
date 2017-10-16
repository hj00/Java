package basic.exception;

import java.util.Scanner;

public class ExceptionTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("id : ");String user_id = sc.nextLine();
		System.out.println("pw : ");String user_pw = sc.nextLine();
		MemberVO userInfo = new MemberVO();
		userInfo.setUser_id(user_id);
		userInfo.setUser_pw(user_pw);
		
		try {
			userInfo = login(userInfo); //ID, PW가 맞는지 확인해서 맞으면 이름을 넣어서 리턴해주도록 login을 만듦.
			System.out.println(userInfo.getUser_name() + "님이 로그인 하셨습니다.");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
	}


	private static MemberVO login(MemberVO userInfo) throws RuntimeException {
		if (userInfo.getUser_id().equals("multi") && 
			userInfo.getUser_pw().equals("fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff1226583e88e0996293f16bc009c652826e0fc5c706695a03cddce372f139eff4d13959da6f1f5d3eabe")) {
			userInfo.setUser_name("제이비");
			return userInfo;
		} else {
			throw new RuntimeException("아이디 혹은 비밀번호가 틀릴걸요?");
		}
//		public static void main(String[] args) {
//		String pw = "12345678";
//		DigestUtils.sha512Hex(pw);
//		System.out.println(DigestUtils.sha512Hex(pw));
//	}
}
	
	

}
