package baekjoon_10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 표준 입력으로부터 문자열을 입력 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받은 문자열을 str 변수에 저장
        String str = br.readLine();

        // 길이가 26인 정수 배열을 생성 (알파벳 소문자 a-z의 위치를 저장하기 위해)
        int[] arr = new int[26];

        // Arrays.fill() 메서드를 사용하여 배열의 모든 요소를 -1로 초기화
        Arrays.fill(arr, -1);

        // 입력된 문자열의 각 문자를 검사
        for (int i = 0; i < str.length(); i++) {
            // 문자의 아스키 값에서 'a'의 아스키 값을 빼서 해당 문자의 배열 인덱스를 계산
            int num = str.charAt(i) - 'a';

            // 해당 문자가 처음 등장하는 위치를 배열에 저장
            // 기존 값이 -1일 때만 값을 업데이트 (첫 번째 등장 위치만 저장하기 위함)
            if (arr[num] == -1) {
                arr[num] = i;
            }
        }

        // 배열의 모든 요소를 출력 (각 알파벳의 첫 번째 등장 위치 또는 -1)
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
