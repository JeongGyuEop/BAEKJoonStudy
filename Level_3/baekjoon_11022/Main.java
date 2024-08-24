package baekjoon_11022;

import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for ( int i=1; i<num+1; i++) {

            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a + b;
            sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append(sum).append("\n");

        }

        br.close();
        System.out.println(sb);

    }
}