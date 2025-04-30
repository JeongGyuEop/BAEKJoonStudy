package baekjoon3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		// 더 빠른 입력처리를 위해 BufferedReader 를 사용하여 입력을 받는다.
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	     // 세 개의 좌표의 x값과 y값을 저장할 배열 입력받음
	     int[] x = new int[3];
	     int[] y = new int[3];

	     // 세 줄의 입력을 반복해서 받아 각 좌표의 x, y를 배열에 저
	     for (int i = 0; i < 3; i++) {
	    	 StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	         x[i] = Integer.parseInt(st.nextToken()); // x 좌표 저장
	         y[i] = Integer.parseInt(st.nextToken()); // y 좌표 저장
	     }

	     // 네 번째 점의 x와 y 좌표를 찾기
	     int fourthX = findFourthPoint(x[0], x[1], x[2]);
	     int fourthY = findFourthPoint(y[0], y[1], y[2]);

	     // 결과 출력
	     System.out.println(fourthX + " " + fourthY);
      }

	  // 세 개의 값 중에서 두 개가 같은 경우, 나머지 하나의 값을 반환하는 메소
	  public static int findFourthPoint(int a, int b, int c) {
		  if (a == b) { // a와 b가 같으면
			  return c; // 네 번째 점은 c
	      } else if (a == c) { // a와 c가 같으면
	          return b; // 네 번째 점은 b
	      } else { // b와 c가 같으면 
	          return a; // 네 번째 점은 a
	      }
	  }

}
