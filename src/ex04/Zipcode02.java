package ex04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Zipcode02 {

	public static void main(String[] args) throws IOException {

		// ZIPCODE,SIDO,GUGUN,DONG,BUNJI,SEQ
		
		// File
		String         path  = Zipcode02.class.getResource("").getPath();
		String         fname = "zipcode_utf8.csv";
		File           file  = new File(path + fname);
		
		FileReader     fr    = new FileReader(file);
		BufferedReader br    = new BufferedReader(fr);
		
		
		String         title = br.readLine(); // 제목줄 스킵
		String         line  = "";
		String         bsido = "시도";
		
		
		
		int cnt = 0;
		while ( ( line = br.readLine() ) != null) {
			String [] li   = line.trim().split(",");
			String zipcode = li[0].trim();
			String sido    = li[1].trim();
			String gugun   = li[2].trim();
			String dong    = li[3].trim();
			String bunji   = li[4].trim();
			int    seq     = Integer.parseInt( li[5].trim() );
			
//			4. 한국의 시도명 출력 - 17건 
//			   서울
//			   부산
//			   ... 
//			   충북
			
			if(sido.indexOf(bsido) == -1) {
				System.out.println("새로운 시도 : " + sido);
				bsido = sido;
				cnt++;
			}
			
			
			
			
			
			
			
		}
		System.out.println(cnt);
		
		
		
		
		
		
		br.close();
		fr.close();
		
		
		
		
		
		
		
		
		
	}

}


































