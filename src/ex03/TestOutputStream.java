package ex03;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStream {

	public static void main(String[] args) throws IOException {
		// ~Stream 으로 끝나는 class 는 byte 단위의 입출력을 하는 명령어들이다.
		String            fname = "D:/2026/dev/java/PrjIO/src/ex03/data2.dat";
		FileOutputStream  fos   = new FileOutputStream(fname);
		
		// for (int i = 65; i < 65+26; i++) {
		for (int i = 'A'; i <= 'Z'; i++) {
			fos.write(i);
		}
		
		fos.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}






























