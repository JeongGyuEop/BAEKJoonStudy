package baekjoon_11005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	 public static void main(String[] args) throws IOException{
	     // 입력을 받기 위한 BufferedReader 생성
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	     // 입력값을 공백으로 분리하여 저장
	     String[] str = br.readLine().split(" ");
	     
	     // str 배열의 0 index 값을 정수로 변환하여 정수 자료형인 numA 변수에 저장
	     int numA = Integer.parseInt(str[0]);
	     // str 배열의 1 index 값을 정수로 변환하여 정수 자료형인 numB 변수에 저장
	     int numB = Integer.parseInt(str[1]);
	     
	     // 10진수를 B진법으로 변환
	     String result = Integer.toString(numA, numB).toUpperCase();
	     System.out.println(result); // 출력: 100ZZZ
	 }

}
