package baekjoon_1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		// BufferedReader를 사용하여 입력을 받는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer를 사용하여 공백을 기준으로 입력을 분리한다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 입력값을 저장할 배열 생성(x, y, w, h의 네 값을 저장한다.)
		int[] numArr = new int[4];
		
		// numArr 배열에 입력값을 저장한다.
		for (int i=0; i<numArr.length; i++) {
			// 공백을 기준으로 입력을 분리해 놓은 값들을 하나씩 가져와 정수형태로
			// 변환하여 입력값을 저장하는 배열에 저장한다.
			numArr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		// ArrayList를 사용하여 거리를 저장할 리스트를 생성한다.
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		
		// x, y에서 경계선까지의 거리를 계산하여 리스트에 추가한다.
		arrlist.add(numArr[0]); // 왼쪽 경계선까지의 거리(x좌표)
		arrlist.add(numArr[1]); // 아래쪽 경계선까지의 거리(y좌표)
		arrlist.add(numArr[2] - numArr[0]); // 오른쪽 경계까지의 거리(w - x)
		arrlist.add(numArr[3] - numArr[1]); // 위쪽 경계까지의 거리(h - y)

		// 리스트에 저장된 값 충 가장 작은 값을 출력
		System.out.println(Collections.min(arrlist));
		
	}

}
