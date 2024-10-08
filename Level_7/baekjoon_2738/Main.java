package baekjoon_2738;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위해 BufferedReader와 StringTokenizer 사용한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 공백을 기준으로 첫 번째 숫자와 두 번째 숫자를 읽어와서 행렬의 크기를 결정한다.
        int firstNum = Integer.parseInt(st.nextToken()); // 행의 수
        int secondNum = Integer.parseInt(st.nextToken()); // 열의 수

        // firstNum * secondNum 크기의 2차원 배열을 생성한다.
        int[][] num = new int[firstNum][secondNum];

        // 첫 번째 행렬에 대한 요소들을 num 2차원 배열에 저장
        for(int i = 0; i < firstNum; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < secondNum; j++) {
                // 행렬의 각 요소를 num 2차원 배열에 저장한다.
                num[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 두 번째 행렬에 대한 입력을 받아 num 2 차원 배열에 저장되어 있던 첫번째 행렬의
        // 각 값에 대해 누적하여 합산한다.
        for(int i=0; i<firstNum; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < secondNum; j++) {
                num[i][j] += Integer.parseInt(st.nextToken()); // 두 번째 행렬 요소를 더한다.
            }
        }

        for(int i=0; i<num.length; i++) {
            for(int j=0; j<num[i].length; j++) {
                System.out.print(num[i][j] + " "); // 각 요소를 출력한다.
            }
            System.out.println(); // 하나의 행이 끝나면 줄바꿈
        }
    }
}
