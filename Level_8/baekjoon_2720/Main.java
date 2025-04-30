package baekjoon_2720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 효율적으로 입력을 받기 위한 BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력 받은 문자열을 정수로 변환하여 처리할 개수 num에 저장
		int num = Integer.parseInt(br.readLine());

		// 결과를 저장할 이차원 배열 선언 (num개의 행, 4개의 열)
		int[][] result = new int[num][4];

		// num번 반복하여 입력 받은 돈을 계산
		for (int i = 0; i < num; i++) {
		    // 입력받은 금액을 정수로 변환하여 money에 저장
		    int money = Integer.parseInt(br.readLine());

		    // 배열 arr은 각각 25센트(쿼터), 10센트(다임), 5센트(니켈), 1센트(페니)를 나타냄
		    int[] arr = {25, 10, 5, 1};

		    // 배열 arr에 있는 각 동전 단위로 money를 나누어 몫과 나머지를 계산
		    for (int j = 0; j < arr.length; j++) {
		        // money를 현재 동전 단위로 나눈 몫을 result[i][j]에 저장
		        result[i][j] = money / arr[j];

		        // money를 현재 동전 단위로 나눈 나머지를 갱신하여 남은 돈을 계산
		        money = money % arr[j];
		    }
		}

		// 결과 출력 부분
		for (int i = 0; i < result.length; i++) {
		    // 각 행의 4개의 동전 개수를 출력
		    for (int j = 0; j < result[i].length; j++) {
		        // 각 동전의 개수를 공백으로 구분하여 출력
		        System.out.print(result[i][j] + " ");
		    }
		    // 한 행을 출력한 후 줄바꿈
		    System.out.println();
		}
		
	}

}