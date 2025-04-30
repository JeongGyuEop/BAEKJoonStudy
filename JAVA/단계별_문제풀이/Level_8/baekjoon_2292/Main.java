package baekjoon_2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 사용자로부터 입력받기 위해 Scanner 객체 사용
		Scanner sc = new Scanner(System.in);
		// 목표 방 번호를 입력받아 정수 n 변수에 저장
		int n = sc.nextInt();
		
		// 몇 번째 방까지 숫자를 누적하는지 나타내는 변수
		// 1 = 1번방
		// 2 ~ 7 = 2번방
		// 8 ~ 19 = 3번방...
		int value = 1;
		// 중앙에서부터 몇 겹을 지나가야 하는지 나타내는 count 변수 1로 초기화
		// (입력받은 n 이 1이상 입력받기 때문에 1인경우 1을 반환하기 위해서 1로 초기화한다.) 
		int count = 1;

		// 반복문을 순회하면서 n번 방에 도달할 때까지 겹을 늘려가며 방 개수 누
		for(int i = 1; value <n; i++) {
			// 새로운 겹을 추가할 때마다 count 증가
			count++;
			// value는 겹마다 6의 배수로 증가하면서 누적하여 합산
			value += i * 6; 
		}
			
		// n 번 방에 도달할 때까지 지나간 겹의 수(count)를 출력 
		System.out.println(count);
			
		// Scanner 객체 종료
		sc.close();
		

	}

}
