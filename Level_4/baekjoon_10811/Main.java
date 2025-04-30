package baekjoon_10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int total_box = Integer.parseInt(st.nextToken()); // 총 바구니의 수
        int count = Integer.parseInt(st.nextToken()); // 바구니를 역순으로 바꿀 횟수

        int[] array = new int[total_box];

        for (int i = 0; i < total_box; i++) {
            array[i] = i+1;
        }

        for(int i=0; i<count; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken())-1; // 공백을 기준으로 처음 입력받은 수
            int num2 = Integer.parseInt(st.nextToken())-1; // 두 번째 수

            // num1과 num2 구간을 역순으로 바꾸기
            while (num1 < num2) {
                int temp = array[num1];
                array[num1] = array[num2];
                array[num2] = temp;
                num1++;
                num2--;
            }
        }

        // 결과 출력
        for (int i = 0; i < total_box; i++) {
            System.out.print(array[i] + " ");
        }

    }
}