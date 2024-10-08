package baekjoon_10810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int line = Integer.parseInt(st.nextToken()); // 총 바구니의 수
        int col = Integer.parseInt(st.nextToken()); // 공을 넣을 횟수

        int arr[] = new int[line];

        for(int i=1; i<=col; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            for(int j=x-1; j<=y-1; j++) {
                arr[j] = z;
            }
        }

        for(int j=0; j<line; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}