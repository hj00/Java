package test3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class JavaClientSocket {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("70.12.50.68", 8667);
			System.out.println("클라이언트 소켓 생성");
			OutputStream oos = socket.getOutputStream();
			
			String filePath = "C:/dev/img/jpnmall213717.jpg";
			File file = new File(filePath);
			String fileName = file.getName();
			
			byte[] bytes = fileName.getBytes("UTF-8");
			oos.write(bytes);
			
			System.out.println(fileName + "파일을 전송합니다.");
			FileInputStream fis = new FileInputStream(file);
			int readByteCount;
			byte[] readBytes = new byte[1024];
			
			while((readByteCount = fis.read(readBytes)) != -1) {
				oos.write(readBytes, 0, readByteCount);
			}
			oos.flush();

			System.out.println("파일 보내기 완료");
/*			Object in = ois.readObject();
			System.out.println("받은 메시지 " + in);
			System.out.println("클라이언트를 종료합니다.");*/
			oos.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
