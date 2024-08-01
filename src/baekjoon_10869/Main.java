package src.baekjoon_10869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a+b); // 덧셈
        System.out.println(a-b); // 뺄셈
        System.out.println(a*b); // 곱셈
        System.out.println(a/b); // 나누기(몫)
        System.out.println(a%b); // 나누기(나머지)

    }
}
