package baekjoon_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		// BufferedReader를 사용하여 입력을 받음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 첫 번째 줄에서 숫자의 개수 N을 입력받음
		int n = Integer.parseInt(br.readLine());

		// 두 번째 줄에서 입력된 숫자들을 공백으로 구분하여 배열로 저장
		String[] strArr = br.readLine().split(" ");

		// 소수의 개수를 카운트할 변수
		int answer = 0;

		// 입력받은 숫자들에 대해 소수 판별
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(strArr[i]); // 문자열을 정수로 변환하여 저장
			boolean isPrime = true; // 소수 여부를 저장할 변수
			
			// 2부터 해당 숫자의 제곱근까지 나누어 떨어지는지 확인하여 소수 판별
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					isPrime = false; // 나누어 떨어지면 소수가 아님
					break;
				}
			}
			
			// num이 1보다 크고 소수라면 소수 카운트를 증가
			if (isPrime && num > 1) {
				answer++;
			}
		}
		
		// 결과 출력: 소수의 개수를 출력
		System.out.println(answer);
	}
}
