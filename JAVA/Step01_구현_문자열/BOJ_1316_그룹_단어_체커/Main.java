package BOJ_1316_그룹_단어_체커;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count=0;

        for(int i=0; i<n; i++) {
            if(isGroupWord(br.readLine())) count++;
        }

        System.out.println(count);
    } 

    public static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26]; // 총 알파벳 a~z 총 26개의 문자가 이미 등장했는지 저장하는 배열
        char prev = 0; // 이전 문자를 기억하기 위한 변수. 처음에는 아무 문자도 없기 때문에 0으로 초기화

        for(int i=0; i<word.length(); i++) { // 문자열을 왼족부터 한 글자식 curr로 꺼내욘다.
            char curr = word.charAt(i);

            if(curr != prev) { // 이전 문자와 현재 문자가 다르면 -> 연속되지 않음 -> 그 문자가 이전에 등장했는지 검사
                if(visited[curr - 'a']) return false; // 이전에 등장했던 문자라면 -> 그룹단어 아님 -> false 반환
                visited[curr - 'a'] = true; // 현재 문자는 처음 나온 것이므로 등장했다고 체크
            }

            prev = curr; // 현재 문자를 prev에 저장 -> 다음 문자의 비교 기준이 된다.
        }

        return true; // 모든 문자를 다 확인 했는데도 문제가 없다 -> 그룹 단어 맞음
    }
            

}
