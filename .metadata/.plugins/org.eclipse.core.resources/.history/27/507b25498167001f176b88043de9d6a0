package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chess {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 받는다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력받은 문자열을 공백(" ")을 기준으로 나누어 문자열 배열로 저장한다.
        String[] str = br.readLine().split(" ");

        // 체스 세트에서 각 말의 정해진 수를 배열로 생성
        int[] arr = {1, 1, 2, 2, 2, 8};

        // 입력한 각 말의 개수과 정해진 개수의 차이를 계산 한다.
        for(int i=0; i<str.length; i++) {
            // 체스 말의 정해진 수(arr[i])에서 사용자가 입력한 값(str[i])를 뺀다.
            System.out.print(arr[i] - Integer.parseInt(str[i]) + " ");
        }
    }
}
