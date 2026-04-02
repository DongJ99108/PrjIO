package ex04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Zipcode01 {

	public static void main(String[] args) throws IOException {

		// ZIPCODE,SIDO,GUGUN,DONG,BUNJI,SEQ
		// 키보드 입력
		Scanner        in    = new Scanner(System.in);
		
		// File
		String         path  = Zipcode01.class.getResource("").getPath();
		String         fname = "zipcode_utf8.csv";
		File           file  = new File(path + fname);
		
		FileReader     fr    = new FileReader(file);
		BufferedReader br    = new BufferedReader(fr);
		
		
		String         title = br.readLine(); // 제목줄 스킵
		String         line  = "";
		
		// System.out.println("읍면동과 건물명을 입력하세요");
		// String        inAddr = in.nextLine();
		
		int cnt = 0;
		int busan = 0;
		int daegu = 0;
		int ulsan = 0;
		
		while (( line = br.readLine() ) != null) {
			String [] li = line.trim().split(",");
			String zipcode = li[0].trim();
			String sido    = li[1].trim();
			String gugun   = li[2].trim();
			String dong    = li[3].trim();
			String bunji   = li[4].trim();
			int    seq     = Integer.parseInt( li[5].trim() );
			
			// 3. 부산, 울산, 대구 우편번호
			// 부산:3605
			// 대구:2782
			// 울산:820
			// if( dong.contains("롯데백화점") ) {
			if( sido.indexOf( "부산" ) > -1 ) {
				cnt++;
				busan++;
				String fmt = "[%s] %s %s %s %s %d\n";
				String addr = String.format(fmt, zipcode, sido, gugun, dong, bunji, seq);
				System.out.print( addr );
			}
			if( sido.indexOf( "대구" ) > -1 ) {
				cnt++;
				daegu++;
				String fmt = "[%s] %s %s %s %s %d\n";
				String addr = String.format(fmt, zipcode, sido, gugun, dong, bunji, seq);
				System.out.print( addr );
			}
			if( sido.indexOf( "울산" ) > -1 ) {
				cnt++;
				ulsan++;
				String fmt = "[%s] %s %s %s %s %d\n";
				String addr = String.format(fmt, zipcode, sido, gugun, dong, bunji, seq);
				System.out.print( addr );
			}
			
			
			
			
			
			
		}
		System.out.println();
		System.out.println( "총 갯수 " + cnt + "건" );
		System.out.println( "부산 " + busan + "건" );
		System.out.println( "대구 " + daegu + "건" );
		System.out.println( "울산 " + ulsan + "건" );
		
		
		
		
		
		br.close();
		fr.close();
		
		
		
		
		
		
		
		
		
	}

}


































