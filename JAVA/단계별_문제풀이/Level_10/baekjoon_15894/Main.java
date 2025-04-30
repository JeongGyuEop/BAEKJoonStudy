package baekjoon_15894;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Scanner 객체 생성하여 입력을 받을 준비를 한다.
		Scanner sc = new Scanner(System.in);
		
		// 입력받은 정수 값을 long 형으로 처리하여 둘레를 계산하고 결과 출력
		System.out.println(sc.nextLong() * 4);
		
		// Scanner 자원 해제
		sc.close();

	}

}
