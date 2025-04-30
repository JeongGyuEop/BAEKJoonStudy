package baekjoon_2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numA = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int numB = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(numA > numB ? numA : numB);//
    }
}