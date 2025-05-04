package BOJ_2675_문자열_반복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
            String[] s = br.readLine().split(" "); // '3 ABC' 입력
            int repeat = Integer.parseInt(s[0]);
            String word = s[1];

            for(int j=0; j<word.length(); j++) {
                char c = word.charAt(j);
                for(int k=0; k<repeat; k++) {
                    sb.append(c);
                }
            }

            sb.append('\n');
        }       

        System.out.println(sb);

    }
    
}
