package BOJ_10809_알파벳_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;  // 초기값 -1 설정
        }

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (arr[idx] == -1) {
                arr[idx] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
