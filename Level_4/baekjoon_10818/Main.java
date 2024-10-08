package baekjoon_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 문제에서 모든 정수는 -1,000,000보다 크고, 1,000,000보다 작거나 같다고 제시
        int min = 1000000; // min 값으로 범위의 가장 큰 값 지정
        int max = -1000000; // max 값으로 범위의 가장 작은 값 지정

        while (st.hasMoreTokens()) {
        //  hasMoreTokens()는 StringTokenizer에 토큰이 남아있으면 true, 비어있으면 false를 반환한다.
            int value = Integer.parseInt(st.nextToken());
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min =value;
            }
        }

        System.out.println(min + " " + max);
        br.close();

    }
}