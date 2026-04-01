package ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestFileNumber3 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		FileReader fr = new FileReader("D:/2026/dev/java/PrjIO/src/ex04/zipcode_20130201(1).csv");
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("동이나 건물명을 입력하세요");
		String sea = in.nextLine();
		
		int total  = 0;
		int search = 0;
		
		String line = br.readLine();
		
		while((line = br.readLine()) != null) {
			
		    total++;
			String [] li = line.trim().split(",");
			// ZIPCODE,SIDO,GUGUN,DONG,BUNJI,SEQ
			String zipcode = li[0];
			String sido    = li[1];
			String gugun   = li[2];
			String dong    = li[3];
			String bunji   = li[4];
			String seq     = li[5];
			
			if(dong.indexOf(sea) != -1 ) {
				search++;
				System.out.printf("%s %s %s %s %s %s ", zipcode, sido, gugun, dong, bunji, seq);
				System.out.println();
			}
			
			
		}
		System.out.println(total);
		System.out.println(search);

		br.close();
		
		
	}
	

}






























