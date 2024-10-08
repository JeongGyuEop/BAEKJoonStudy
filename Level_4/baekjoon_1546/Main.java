package baekjoon_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] numArray = new double[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double max = 0;
        double result = 0;


        for (int i=0; i<numArray.length; i++) {
            numArray[i] = Integer.parseInt(st.nextToken());
            if(numArray[i] > max) {
                max = numArray[i];
            }

        }
        for (double val : numArray) {
            result += ((val / max) * 100);
        }

        System.out.println(result/numArray.length);

    }
}