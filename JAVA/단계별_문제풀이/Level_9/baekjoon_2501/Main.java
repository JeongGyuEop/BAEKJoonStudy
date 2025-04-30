package baekjoon_2501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// BufferedReader를 사용하여 사용자로부터 입력을 효율적으로 받는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 사용자로부터 입력받은 값을 공백으로 구분하여 StringTokenizer로 처리한다.
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 약수를 구할 대상 숫자 numA에 공백으로 구분한 StringTokenizer의 첫번째 값으로 초기화
		int numA = Integer.parseInt(st.nextToken());
		// 몇 번째 약수를 출력할 것인지 나타내는 numB변수에 StringTokenizer의 다음 값으로 초기화
		int numB = Integer.parseInt(st.nextToken());
		
		// numA, numB를 매개변수로 하여 sol함수를 호출하고, 반환값을 결과를 나타내는 result 변수에 저장 
		int result = sol(numA, numB);
		
		// 결과 출력
		System.out.println(result);

	}
	
	// 약수를 찾아서 numB 번재 약수를 반환하는 함수
	public static int sol(int numA, int numB) {
		// 약수를 찾을 때 마다 카운팅하는 count 변수 0으로 초기화
		int count = 0;
		
		// 1부터 numA까지 반복하면서 약수를 찾는다.
		for(int i=1; i<=numA; i++) { 
			
			if(numA % i == 0) { // 만약 i가 numA의 약수라
				count++; // count 1 증가
			}
			
			if(count == numB) { // 만약 찾은 약수가 numB번째 약수와 같다면
				return i; // 해당 약수를 반환
			} 
		}
		// numB번재 약수를 찾지 못한다면 0을 반환
		return 0;
	}

}
