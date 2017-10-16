package basic.exception;

import org.apache.commons.codec.digest.DigestUtils;

public class Num {
	public static void main(String[] args) {
	String pw = "12345678";
	DigestUtils.sha512Hex(pw);
	System.out.println(DigestUtils.sha512Hex(pw));
}

}
