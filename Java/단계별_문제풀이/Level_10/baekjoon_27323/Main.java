package baekjoon_27323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		// BufferedReader를 사용하여 사용자로부터 입력을 받는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫 번째 입력 : 사각형의 세로 길이
		int column = Integer.parseInt(br.readLine());
		// 두 번째 입력 : 사각형의 가로 길이
		int row = Integer.parseInt(br.readLine());
		
		// 사각형의 넓이를 계산하여 출력
		System.out.println(row * column);

	}

}
