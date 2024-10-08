package baekjoon_2657;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int cnt = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < cnt; k++) {
                    sb.append(str.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);

    }
}