package baekjoon_9506;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Scanner 객첼르 생성하여 사용자로부터 입력을 받기 위해 준비한다.
		Scanner sc = new Scanner(System.in);
		// 입력받은 숫자들을 저장할 ArrayList
		ArrayList<Integer> numArr = new ArrayList<Integer>();
		
		// -1이 입력될 때까지 입력을 반복적으로 받는 while 문
		while(true) {
			// 사용자로부터 정수를 입력받아 n 변수에 저장
			int n = sc.nextInt();
			
			// 만약 입력된 값이 -1이면 반복을 종료
			if(n == -1) {
				break;
			}
			
			// 입력된 숫자를 numArr리스트에 값 추가
			numArr.add(n);
			
		}
		
		// 입력된 숫자 리스트 numArr에 저장된 각 숫자를 처리한다.
		for(int i=0; i<numArr.size(); i++) {
			
			int count = numArr.get(i); // 리스트에서 각 인덱스의 숫자를 가져온다.
		
			ArrayList<Integer> arr = new ArrayList<Integer>(); // 약수의 값을 저장할 ArrayList 
			int sum = 0; // 약수의 합을 저장할 변수
			
			// 1부터 count-1까지 반복하면서 약수를 찾는다.
			for(int j = 1; j < count; j++) {
				// 만약 numArr리스트로부터 가져온 값이 j로 나누어 떨어진다면 -> 약수
				if(count % j == 0) { 
					arr.add(j); // 약수를 리스트에 추가한다.
					sum += j; // 약수를 더한다.
				}
				
			}
			
			// count값과 약수들의 합이 같다면 -> 완전수
			if(count == sum) {
				// 약수를 문제에서 주어진 조건에 맞게 출력
				System.out.print(count + " = " + arr.get(0));
				// arr 리스트를 순회하면서 각 약수의 값을 가지고 온다.
				for(int j=1; j<arr.size(); j++) {
					System.out.print(" + " + arr.get(j));
				}
				System.out.println();
			}else { // 완전수가 아닌 경우
				System.out.println(count + " is NOT perfect.");
			}

		}

		// Scanner 객체를 닫는다.
		sc.close();

	}

}
