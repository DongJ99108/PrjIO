package ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
1. zipcode.txt  파일을 준비한다
2. 파일읽기기능을 호출한다
3. 버퍼읽기기능도 호출한다
4. 키보드로 검색할 자료(동,건물명) 입력
5. 한줄을 저장할 변수를 준비
6. 첫줄을 읽어서 버린다
   ZIPCODE,SIDO,GUGUN,DONG,BUNJI,SEQ
7. 파일끝까지 반복해서 읽어온다
   135-806,서울,강남구,개포1동 경남아파트,,1
   각 변수에 짤라서 담는다
   입력받은자료로 검색  
   검색한 주소 출력한다 
   반복끝
   검색된 자료수 : 
   전체 자료수
10.파일을 닫는다  

 */

public class TestFileNumber2 {

	public static void main(String[] args) throws IOException {
		
		int total  = 0;
		int search = 0;
		
		Scanner in = new Scanner(System.in);
		
		String path = "D:/2026/dev/java/PrjIO/src/ex04/zipcode_20130201(1).csv";
		
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("동과 아파트를 입력하세요");
		String sea = in.nextLine();
		String line = br.readLine();
		while( ( line = br.readLine()) != null)  {
			total++;
			
			String [] li = line.trim().split(",");
			// ZIPCODE,SIDO,GUGUN,DONG,BUNJI,SEQ
			String zipcode = li[0];
			String sido    = li[1];
			String gugun   = li[2];
			String dong    = li[3];
			String bunji   = li[4];
			String seq     = li[5];
			
			if( dong.indexOf(sea) != -1 ) {
				search++;
				System.out.printf( "%s %s %s %s %s %s ", zipcode, sido, gugun, dong, bunji, seq );
				System.out.println();
			}
			
		}
		
		System.out.println("총 자료수: " + total);
		System.out.println("찾은 자료수: " + search);
		
		
		br.close();		

	}

}


























