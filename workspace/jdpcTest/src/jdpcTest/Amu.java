package jdpcTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Amu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		if (args.length != 1) {
			System.out.println("���� : Ŭ������ ���ϸ�");
			System.exit(0);
		} else {
			BufferedReader bu = new BufferedReader(new FileReader(args[0]));
			String s = null;
			int i = 0;

			while ((s = bu.readLine()) != null) {
				System.out.println(s);
				i++;
			}
			bu.close();
			System.out.println("���� �� : " + i);

		}

	}

}
