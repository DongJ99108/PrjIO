package ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Zipcode07 {

	public static void main(String[] args) throws Throwable { // void 쓰는이유 - return 이 없어서
		// 7. 부산 부산진구의 우편번호를 파일( .csv )로 출력
		
		// 입력파일
		String     path      = Zipcode07.class.getResource("").getPath();
		String     fname     = "zipcode_utf8.csv";
		File       inFile    = new File(path + fname);
		
		if( !inFile.exists() ) {
			System.out.println( fname + "이 없습니다." );
			System.exit(-1);
		}
		
		FileReader     fr = new FileReader(inFile);
		BufferedReader br = new BufferedReader(fr);
		
		
		// 출력파일
		String     foname = "부산진구 우편번호.csv";
		FileWriter fw     = new FileWriter(path + foname);
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		
		br.readLine(); // 제목줄 건너뛰기(리드 라인 한번 해주는걸로 퉁치기)
		String line         = "";
		
		
		// HashSet<String> set = new HashSet<>(); // 비정렬
		
		// TreeSet<String> set = new TreeSet<>(); // 정렬(가나다순)
		// if( !sido.equals( prevSido ) )
		while( ( line = br.readLine() ) != null ) {
			String [] li   = line.trim().split(",");
			String zipcode = li[0].trim();
			String sido    = li[1].trim();
			String gugun   = li[2].trim();
			String dong    = li[3].trim();
			String bunji   = li[4].trim();
			
			PostVo vo   = new PostVo( line );
			if( gugun.equals( "부산진구" ) ) {
				foname = sido;
				bw.write("우편번호: " + zipcode + ", 구 이름: " +  gugun + "\n" );
			}
			// System.out.println( vo );
		}

		
		br.close();
		bw.close();
		fr.close();
		fw.close();
		
		
		
	} // main

} // class






















