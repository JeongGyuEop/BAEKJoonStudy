package baekjoon_10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// 입력을 효율적으로 처리하기 위해 BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 문자열을 각 인덱스 별로 이어 붙이기 위해 StringBuilder 객체를 ArrayList에 저장
		ArrayList<StringBuilder> arr = new ArrayList<>();
		
		// 최대 입력 길이를 고려해 초기화 (최대 15줄로 가정)
		for(int i=0; i<15; i++) {
			arr.add(new StringBuilder());
		}
		
		// 5번의 입력을 받는다.
		for(int i=0; i<5; i++) {
			// 한 줄씩 읽어와서 str 변수에 저장
			String str = br.readLine();
			// 문자열을 문자단위로 분니하여 각 문자를 strArr에 저장
			String[] strArr = str.split("");
			
			// 문자단위로 저장된 배열의 크기만큼 반복하면서
			for(int j=0; j<strArr.length; j++) {
				// 첫 번째 문자는 arr의 첫 번째 StringBuilder에, 
				// 두 번째 문자는 두 번째 StringBuilder에 추가되며 순회한다.
				arr.get(j).append(strArr[j]);
			}
		}
		
		// 향상된 for문을 사용하여 StringBuilder 객체에 저장된 내용을 순서대로 출력
		for (StringBuilder sb : arr) {
            System.out.print(sb.toString());
        }
		
	}

}
