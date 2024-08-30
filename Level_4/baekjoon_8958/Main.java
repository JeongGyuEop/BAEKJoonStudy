package baekjoon_8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testNum = Integer.parseInt(br.readLine());
        String[] result = new String[testNum];

        for (int i=0; i<testNum; i++) {
            result[i] = br.readLine();
        }

        for (int i=0; i<testNum; i++) {
            int count = 0;
            int sum = 0;

            for (int j=0; j<result[i].length(); j++) {

                if(result[i].charAt(j) == 'O') {
                    count++;
                }else {
                    count = 0;
                }
                sum += count;

            }
            sb.append(sum).append('\n');
        }

        System.out.println(sb);

    }
}