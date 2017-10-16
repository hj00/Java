package test4;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
    static final int SERVER_PORT = 5005;
public static void main(String[] args) throws Exception {


// 서버소켓을 생성하고 준비하는 코드 작성
     ServerSocket serverSocket = new ServerSocket(SERVER_PORT);


System.out.println("[서버 기동]");

while (true) {
try {


// 클라이언트의 요청을 기다리고 입력스트림을 얻는 코드 작성
     Socket socket = serverSocket.accept();
     InputStream is = socket.getInputStream();


byte[] bytes = new byte[100];
int readByteCount = -1;


// 클라이언트가 보낸 100 바이트를 읽고 파일 이름 얻어내는 코드 작성
     readByteCount = is.read(bytes);
     String fileName = new String(bytes, 0, readByteCount, "UTF-8");


fileName = fileName.trim();
System.out.println("[파일 받기 시작] " + fileName);

// 파일 데이터를 받고 C:\Temp 폴더에 저장하는 코드 작성
// C:\Temp 폴더는 미리 만들어져 있음
     String filePath = "C:/Temp/" + fileName;
     FileOutputStream fos = new FileOutputStream(filePath);


System.out.println("[파일 받기 완료]");

fos.close();
is.close();
socket.close();
}
catch (Exception e) {
break;
}

serverSocket.close();
System.out.println("[서버 종료]");
}
}

}
