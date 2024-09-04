package baekjoon_2563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		 // 효율적으로 입력을 받기 위한 BufferedReader 객체 생성
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 // 총 색종이의 수를 입력받는다.
		 int num = Integer.parseInt(br.readLine());
		 // 도화지의 크기를 의미하는 100x100 2차원 배열을 생성(초기값:false) 
		 boolean[][] paper = new boolean[100][100];
		 
		 // 색종이의 수만큼 반복한다.
		 for(int i = 0; i<num; i++) {
			  // 좌표를 입력받아 공백을 기준으로 나누어 사용하기 위해 StringTokenizer 사용
			  StringTokenizer st = new StringTokenizer(br.readLine());
			  
			  // x 좌표 : 색종이의 왼쪽 변과 도화지 왼쪽 변 사이의 거리
			  int left = Integer.parseInt(st.nextToken());
			  // y 좌표 : 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리
			  int buttom = Integer.parseInt(st.nextToken());
			  
			  // 색종이의 크기는 10x10 -> 반복문을 중첩하여 주어진 좌표로부터
			  // 가로 세로 10칸씩 true로 변경
			  for(int j=left; j<left+10; j++) {
				  for(int k=buttom; k<buttom+10; k++) {
					  paper[j][k] = true;
				  }
			  }
			  
		 }
		 
		 // 색종이가 차지하는 영역의 넓이를 저장하기 위한 변수
		 int area = 0;
		 // 도화지 전체(2차원 배열)를 순회하기 위해 중첩 반복문 사용
		 for(int i=0; i<100; i++) {
			 for(int j=0; j<100; j++) {
				 // 색종이가 붙은 영역(true)이면
				 if(paper[i][j]) {
					 // 영역 카운트에 1 증가
					 area++;
				 }
			 }
		 }
		 System.out.println(area);
	}

}
