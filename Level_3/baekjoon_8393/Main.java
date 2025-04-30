package baekjoon_8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i=1; i<num+1; i++) {
            sum = sum + i;
            //for( int i = 1 ; i <= N ; i++ ) s+=i; 이렇게도 사용 가능
        }

        System.out.println(sum);

    }
}