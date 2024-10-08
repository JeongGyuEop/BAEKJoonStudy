package baekjoon_2444;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			// 상단의 삼각형 출력
			for(int i = 1; i <= n; i++) {
			    // 첫째 줄은 n-1번의 공백이 출력되어야 한다.
			    // 두번 째 줄은 n-2 번의 공백이 출력되어야 한다.
			    // 즉 i의 값이 증가할 수록 상단 삼각형의 공백의 입력이 줄어야 한다.
			    // 그렇기 때문에 1부터 n(총 반복횟수) - i(현재 반복횟수) 만큼 반복한다.
			    for(int j = 1; j <= n - i; j++) {
			        System.out.print(" ");
			    }
			    // *을 출력하는 반복문디ㅏ.
			    // 첫 번째 줄은 1개의 별이 찍히고, 두 번째 줄은 3개의 *이 출력되야한다.
			    // 그렇기 때문에 i=1(첫번째 줄)일때 1이 나와야 하고, i=2(두 번째 줄)
			    // 일때 3이 나와야한다.
			    for(int j = 1; j <= 2 * i - 1; j++) {
			        System.out.print("*");
			    }
			    System.out.println();
			}

			// 하단 삼각형 출력
			for(int i = n - 1; i >= 1; i--) {
			    // 하단의 삼각형에서 공백을 출력하는 반복문
			    // 첫째 줄에서는 한개의 공백을 출력해야하고, 두번째 줄에서는 2개의 공백을 출력한다.
			    // -- 연산자를 사용한 감소하는 반복문이기 때문에 처음 i의 값은 i=5-1 즉 4가 된다.
			    // 그렇기 때문에 n-1을 해야 1번을 반복한다.
			    for(int j = 1; j <= n - i; j++) {
			        System.out.print(" ");
			    }
			    // 상단 삼각형에서 *을 출력하는 것과 같은 반복문을 사용한다.
			    // 하지만 -- 연산자를사용한 감소하는 연산자를 사용했으므로 출력되는 별의
			    // 개수는 줄어들면서 출력된다.
			    for(int j = 1; j <= 2 * i - 1; j++) {
			        System.out.print("*");
			    }
			    System.out.println();
			}
		}

    }
}