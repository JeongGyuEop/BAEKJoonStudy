package baekjoon_2903;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int firstPoint = 2;
		int result = 0;
		
		for(int i=0; i<N+1; i++) {
			result = firstPoint * firstPoint;
			firstPoint += (int)Math.pow(2, i);
		}
		
		System.out.println(result);
		sc.close();

	}

}
