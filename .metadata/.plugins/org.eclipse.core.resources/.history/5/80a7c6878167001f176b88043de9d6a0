package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Croatia_Alphabet {
    public static void main(String[] args) throws IOException {
        // 크로아티아 알파벳 문자열 배열
        String[] croatias = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        // 입력을 받기 위한 BufferedReader 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();  // 사용자로부터 입력받음

        // 각 크로아티아 알파벳을 순회하며 입력 문자열에서 해당 알파벳을 처리
        for(int i = 0; i < croatias.length; i++) {
            // 입력 문자열에 크로아티아 알파벳이 포함되어 있는지 확인
            if(input.contains(croatias[i])) {
                // 포함되어 있으면 해당 크로아티아 알파벳을 "@"로 치환
                input = input.replace(croatias[i], "@");
            }
        }

        // 최종 문자열의 길이를 출력
        // 치환된 문자열의 길이가 크로아티아 알파벳을 한 글자로 계산한 결과를 나타냄
        System.out.println(input.length());
    }
}
