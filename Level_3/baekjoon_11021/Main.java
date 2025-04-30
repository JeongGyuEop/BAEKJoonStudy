package baekjoon_11021;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i=1; i<num+1; i++) {

            st = new StringTokenizer(br.readLine(), " ");
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

            sb.append("Case #" + i + ": " + sum + "\n");

        }

        br.close();
        System.out.println(sb);

    }
}