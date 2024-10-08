package baekjoon_1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim(); // 앞뒤 공백 제거

        // 문자열이 비어있는 경우 단어 수는 0
        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            // 공백을 기준으로 문자열 분할
            String[] strArr = str.split("\\s+"); // 하나 이상의 공백을 하나의 구분자로 인식
            System.out.println(strArr.length);
        }
    }
}
