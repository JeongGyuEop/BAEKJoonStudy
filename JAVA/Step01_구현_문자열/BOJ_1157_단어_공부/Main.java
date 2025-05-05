package BOJ_1157_단어_공부;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        s = s.toUpperCase();

        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++) {
            int n = s.charAt(i) - 'A';

            arr[n]++;
        }

        int max = -1;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = (char) (i + 'A'); // 현재 가장 많이 나온 알파벳으로 갱신
            } else if (arr[i] == max) {
                result = '?'; // 동일한 최대값이 있으면 ?로 처리
            }
        }

        System.out.println(result);

    }

}
