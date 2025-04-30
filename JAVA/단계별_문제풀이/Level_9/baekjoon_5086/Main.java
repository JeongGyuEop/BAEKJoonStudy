package baekjoon_5086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// BufferedReader를 사용하여 입력을 빠르게 처리한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 무한 반복을 통하여 여러 테스트 케이스를 처리한다.
		while(true) {
			// 입력된 한 줄의 공백을 기준으로 분리하여 처리하기 위해 StringTokenizer를 사용한다.
			StringTokenizer st = new StringTokenizer(br.readLine());
			// 공백을 기준으로 분리한 값을 가져와 정수로 변환하여 numA에 저장
			int numA = Integer.parseInt(st.nextToken());
			// 공백을 기준으로 분리한 값을 가져와 정수로 변환하여 numB에 저장
			int numB = Integer.parseInt(st.nextToken());
			
			// numA와 numB가 모두 0인 경우 반복문을 빠져나간다.
			if(numA == 0 && numB == 0) {
				break;
			}
			
			// numA가 numB의 약수라면?
			if(numB % numA == 0) {
				System.out.println("factor");
			} else if(numA % numB == 0) { // numA가 numB의 배수라면?
				System.out.println("multiple");
			} else { // 약수도 배수도 아닌경우
				System.out.println("neither");
			}	
			
		}
		
	}

}
