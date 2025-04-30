package baekjoon_2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력값을 공백으로 분리하여 저장
        String[] input = br.readLine().split(" ");
        
        // N: B진법으로 표현된 수, B: 진법
        String N = input[0];
        int B = Integer.parseInt(input[1]);

        // N을 B진법에서 10진법으로 변환
        int result = Integer.parseInt(N, B);
        
        // 결과 출력
        System.out.println(result);
        
    }
}