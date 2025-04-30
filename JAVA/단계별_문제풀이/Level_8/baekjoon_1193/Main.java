package baekjoon_1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 사용자 입력을 받기 위한 Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		// n번째 분수의 순서를 입력받음
		int n = sc.nextInt();
		
		// 현재 대각선의 번호를 나타내는 변수, 1번 대각선부터 시작
		int diagonal = 1;
		// 지금까지 지나온 분수의 총 개수를 저장하는 변수
		int totalCount = 0;
		
		// n번째 분수가 속하는 대각선을 찾는 반복문
		while(true) {
			// 현재 대각선에 있는 분수 개수를 totalCount에 더함
			totalCount += diagonal;
			
			// totalCount가 n보다 크거나 같으면, n이 속한 대각선을 찾고 반복 종료
			if(totalCount >= n) {
				break;
			}
			
			// 대각선을 하나 증가
			diagonal++;
		}
		
		// n번째 분수가 속한 대각선에서 몇 번째에 있는지 계산
		int position = n - (totalCount - diagonal);
		// 분자와 분모를 저장할 변수
		int numerator, denominator;
		
		// 대각선 번호가 홀수일 경우
		if (diagonal % 2 == 1) {
            // 홀수 대각선: 분자가 감소하고 분모가 증가
            numerator = diagonal - position + 1;
            denominator = position;
        } else {
            // 짝수 대각선: 분자가 증가하고 분모가 감소
            numerator = position;
            denominator = diagonal - position + 1;
        }
		
		// 결과 출력 
		System.out.println(numerator + "/" + denominator);
		
		// Scanner 객체를 닫음
        sc.close();
	}
}
