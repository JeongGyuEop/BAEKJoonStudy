package baekjoon_2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		// BufferedReader 를 사용하여 입력을 받는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫 번째 줄에서 시작 범위를 입력받는다.
		int numA = Integer.parseInt(br.readLine());
		// 두 번째 줄에서 끝 범위를 입력받는다.
		int numB = Integer.parseInt(br.readLine());
		
		// 소수의 합을 저장할 변수
		int sum = 0;
		// 소수 중 최소값을 저장할 변수, 초기값은 numB(끝 범위 수)로 설정한다.
		int min = numB;
		
		// 시작 범위부터 끝 범위 까지의 숫자를 순회하면서 소수의 여부를 확인한다.
		for(int i = numA; i<=numB; i++) {
			boolean isPrime = true; // 소수 여부를 저장할 변수
			
			// 2부터 해당 숫자의 제곱근까지 나누어 떨어지는지 확인하여 소수 판별
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false; // 나누어 떨어지면 소수가 아님
					break;
				}
			}
			
			// i가 소수이고,1보다 큰 경우
			if(isPrime && i > 1) {
				// 소수의 합에 현재 순회하고 있는 값 누적.
				sum += i;
				// 시작 범위 부터 끝까지 순회하기 때문에 가장 먼저 등장하는 소수값이 최소값이다
				if(i<min) {
					min = i; // 최소 소수값 갱신 
				}
			}
			
		}
		
		// 소수가 존재하는 경우
		if(sum != 0) {
			System.out.println(sum); // 소수의 합 출력
			System.out.println(min); // 소수 중 최소값 출력
		} else {
			System.out.println(-1); // 소수가 존재하지 않는 경우 -1 출력
		}

	}

}
