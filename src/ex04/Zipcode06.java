package ex04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;

public class Zipcode06 {

	public static void main(String[] args) throws Throwable { // void 쓰는이유 - return 이 없어서
		// 6. 부산의 부전2동 우편번호만 출력
		String     path      = Zipcode06.class.getResource("").getPath();
		String     fname     = "zipcode_utf8.csv";
		File       inFile    = new File(path + fname);
		
		if( !inFile.exists() ) {
			System.out.println( fname + "이 없습니다." );
			System.exit(-1);
		}
		
		FileReader     fr = new FileReader(inFile);
		BufferedReader br = new BufferedReader(fr);
		
		br.readLine(); // 제목줄 건너뛰기(리드 라인 한번 해주는걸로 퉁치기)
		String line         = "";
		
		
		// HashSet<String> set = new HashSet<>(); // 비정렬
		
		// TreeSet<String> set = new TreeSet<>(); // 정렬(가나다순)
		// if( !sido.equals( prevSido ) )
		int cnt = 0;
		while( ( line = br.readLine() ) != null ) {
			String [] li   = line.trim().split(",");
			String zipcode = li[0].trim();
			String sido    = li[1].trim();
			String gugun   = li[2].trim();
			String dong    = li[3].trim();
			String bunji   = li[4].trim();
			
			PostVo vo   = new PostVo( line );
			if( dong.equals( "부전2동" ) ) {
				System.out.println("우편번호: " + zipcode + ", 동 이름: " +  dong );
				cnt++;
			}
			// System.out.println( vo );
		}

		
		br.close();
		fr.close();
		
		
		
		System.out.println( "부전2동 개수: " + cnt);
		
	} // main

} // class






















