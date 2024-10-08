package baekjoon_5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] index = new int[31]; // 30번 학생까지 생각하여 31로 해야함.

        // 배열의 특징들을 잘 기억해서 풀어야한다.
        for (int i=1; i<29; i++) {
            int num = Integer.parseInt(br.readLine());
            index[num] = 1; // 제출한 사람의 인덱스 번호에 1을 넣어준다.
        }

        for (int i=1; i<31; i++) { // index 배열 번호는 0~31까지지만, 반복은 1~30까지만 진행
            if(index[i] != 1) { // 배열의 i번째에 1이 없는 경우 즉, 제출하지 않은 학생의 경우
                sb.append(i).append("\n"); // 배열의 인덱스 번호 -> 학생의 번호를 저장하여 출력
            }
        }

        System.out.println(sb);

    }
}