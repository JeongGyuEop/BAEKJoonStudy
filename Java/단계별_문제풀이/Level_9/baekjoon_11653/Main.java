package baekjoon_11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		// BufferedReader 를 사용하여 사용자로부터 입력을 받는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력된 숫자를 정수로 변환한다.
		int num = Integer.parseInt(br.readLine());
		
		// 2부터 시작하여 num의 제곱근까지 반복
		// 소인수 분해는 2부터 시작하여 num이 나누어 떨어질 때까지 나눈다.
		for(int i=2; i<=Math.sqrt(num); i++) {
			// num이 i로 나누어 떨어지는 동안 계속해서 나누고 그 값을 출력한다.
			while(num%i == 0) {
				System.out.println(i); // 소인수 출력
				num /= i; // 나눈 값으로 num을 갱신한다.
			}
		}
		
		// 만약 num이 1보다 크면, 이는 소수이므로 출력
		// 남은 값이 마지막 소인수일 경우 이를 출력한다.
		if(num > 1) {
			System.out.println(num);
		}

	}

}
