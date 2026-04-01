package ex04;
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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFileNumber {

	public static void main(String[] args) throws IOException {
		
		int total  = 0; // 총 자료수
		int search = 0; // 찾은 자료수
		
		
		String path  = "D:/2026/dev/java/PrjIO/src/ex04/"; // 참고할 자료 경로
		String fname = "zipcode_20130201(1).csv"; // 참고할 자료 이름
		
		FileReader fr = new FileReader(path + fname); // 내가 지정한 경로와 이름을 참고해서 파일을 읽는데
		BufferedReader br = new BufferedReader(fr); // BufferedReader를 활용해서 조금 더 빠르게 읽고
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("동과 건물명을 입력하세요");
		String sea = in.nextLine(); // 내가 입력한 데이터를 받아서 sea 변수에 넣고
		
		
		
		String line = br.readLine(); // br.readLine(); 을 활용해서 한 줄씩 빠르게 읽는다 이 함수는 BufferedReader가 있어서 가능한 것
		
		while( (line = br.readLine() ) != null ) {  // 한 줄씩 끝까지 읽는데 != null 은 끝에 도달하면 멈추라는 뜻이고
			total++; // 이건 총 자료수를 계산하고
			
			String [] data = line.trim().split(","); // 파일 안의 데이터를 ,를 기준으로 쪼개서 각각의 변수에 담고
			// ZIPCODE,SIDO,GUGUN,DONG,BUNJI,SEQ
			String zipcode = data[0];
			String sido    = data[1];
			String gugun   = data[2];
			String dong    = data[3];
			String bunji   = data[4];
			String seq     = data[5];
			
			if( dong.indexOf(sea) != -1 ) { // 내가 콘솔창에 입력한 dong 이 자료의 정보와 일치하는지 보고 일치하면 아래 printf 의 규칙에 따라 출력한다.
				System.out.printf("%s %s %s %s %s %s ", zipcode, sido, gugun, dong, bunji, seq );
				System.out.println();
				search++;
			}
		};
		System.out.println("전체 자료수: " + total );
		System.out.println("검색 자료수: " + search );
		
		br.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}





































