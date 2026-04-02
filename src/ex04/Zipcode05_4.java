package ex04; // 생선님 버전

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

interface Ipo {
	void input( String fname ) throws FileNotFoundException, IOException;
	void process();
	void output();
}

class ZipcodeMap implements Ipo {
	

	
	FileReader     fr;
	BufferedReader br;
	
	Map<String, Integer> sidoMap = new TreeMap<>(); // HashMap으로 하면 뒤죽박죽 왁자지껄 좌충우돌 우당탕탕 와장창 배열이 된다.
	int totCnt = 0;

	@Override
	public void input( String fname ) throws IOException {
		
		fr = new FileReader( fname );
		br = new BufferedReader( fr );		
		
		br.readLine();
		String line = "";
		while( ( line = br.readLine() ) != null ) {
			PostVo vo = new PostVo( line );
			String sido = vo.getSido();
			sidoMap.put( sido, sidoMap.getOrDefault( sido, 0 ) + 1 );
			totCnt++;
		}
		
		br.close();
		fr.close();
	}

	@Override
	public void process() {
		
	}

	@Override
	public void output() {
		
		for (Map.Entry<String, Integer> sidoList : sidoMap.entrySet()) {
			String key = sidoList.getKey();
			Integer val = sidoList.getValue();
			
			System.out.println(key + "=" + val);
		}
		
		System.out.println("총" + totCnt + "건");
	}
	
}

public class Zipcode05_4  {

	// Map 사용
	public static void main(String[] args) throws Throwable {
		ZipcodeMap zMap = new ZipcodeMap();
		
		String path = ZipcodeMap.class.getResource("").getPath();
		String fname = "zipcode_utf8.csv";
		
		zMap.input( path + fname );
		zMap.process();
		zMap.output();

	} // main



} // class






















