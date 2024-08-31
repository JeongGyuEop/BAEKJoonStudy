package baekjoon_1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 단어의 개수
        int count = 0; // 그룹 단어의 개수를 세기 위한 변수

        for (int i = 0; i < N; i++) {
            String word = br.readLine(); // 단어 입력 받기
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count); // 그룹 단어의 개수를 출력
    }

    public static boolean isGroupWord(String word) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        char prevChar = word.charAt(0);
        charMap.put(prevChar, 0);  // 첫 문자를 해시맵에 넣음

        for (int i = 1; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (currentChar != prevChar) {  // 이전 문자와 현재 문자가 다를 때
                if (charMap.containsKey(currentChar)) {
                    return false;  // 이미 등장했던 문자가 다시 등장했으나 연속적이지 않음
                }
                charMap.put(currentChar, i);  // 현재 문자를 해시맵에 추가
            }

            prevChar = currentChar;  // 이전 문자를 현재 문자로 갱신
        }

        return true;  // 그룹 단어일 경우 true 반환
    }
    
}