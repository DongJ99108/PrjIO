package ex01;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {

	public static void main(String[] args) throws IOException {

		// RM 진 슈가 제이홉 지민 뷔 정국
		String [] names = {"RM", "진", "슈가", "제이홉", "지민", "뷔", "정국"};
		
		// String filename = "bts.txt"; // D:\2026\dev\java\PrjIO\bts.txt
		String filename = "D:\\2026\\dev\\java\\PrjIO\\src\\ex01\\bts.txt";
		FileWriter fw = new FileWriter(filename);
		
		for (int i = 0; i < names.length; i++) {
			fw.write( i+1 + ". " + names[i] + "\n");
			
		}
		fw.close();
		System.out.println( filename + "이 " + names.length + "줄 저장되었습니다." );
		
		
		
		

	}

}


























