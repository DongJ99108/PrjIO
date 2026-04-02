package ex04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;

public class Zipcode05_2 {

	public static void main(String[] args) throws Throwable { // void 쓰는이유 - return 이 없어서
//		4. 한국의 시도명 출력 - 17건 
//		   서울 8080
//		   부산 3605
//		   ... 
//		   충북
		String     path      = Zipcode05_2.class.getResource("").getPath();
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
		int    totcnt       = 0;
		String prevSido     = "";
		
		long   startTime    = System.nanoTime();
		
		// HashSet<String> set = new HashSet<>(); // 비정렬
		
		// TreeSet<String> set = new TreeSet<>(); // 정렬(가나다순)
		int sidoCount = 0;
		// if( !sido.equals( prevSido ) )
		int cnt = 0;
		while( ( line = br.readLine() ) != null ) {
			PostVo vo   = new PostVo( line );
			String sido = vo.getSido();
			sidoCount++;
			if( !sido.equals( prevSido ) ) {
				prevSido = sido;
				System.out.println( "시, 도 이름: " +  sido + " / 시, 도 개수: " + sidoCount );
				cnt++;
				sidoCount = 0;
			}
			// System.out.println( vo );
			totcnt++;
		}
		long   endTime  = System.nanoTime();
		double execTime = (endTime - startTime)/1000.0/1000.0/1000.0;

		
		br.close();
		fr.close();
		
		
		
		System.out.println( "도시수: " + cnt);
		System.out.println( "전체 자료수: " + totcnt);
		System.out.println( "실행시간: " + execTime + " s"); // 3.03087E8 = 0.303초
		
	} // main

} // class






















