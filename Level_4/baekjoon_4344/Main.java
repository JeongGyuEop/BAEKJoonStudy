package baekjoon_4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testNum = Integer.parseInt(br.readLine());
        String[] student = new String[testNum];


        for (int i=0; i<testNum; i++) {
            double sum = 0;
            double result = 0;
            double d = 0;
            st = new StringTokenizer(br.readLine(), " ");
            student[i] = st.nextToken();
            String[] stuArray = new String[Integer.parseInt(student[i])];

            for (int j=0; j<Integer.parseInt(student[i]); j++) {
                stuArray[j] = st.nextToken();
                sum += Integer.parseInt(stuArray[j]);
            }

            result = sum / Integer.parseInt(student[i]);

            double count = 0;

            for (int k=0; k<stuArray.length; k++) {
                if(Integer.parseInt(stuArray[k]) > result ) {
                    count++;
                }
            }
            d = count / Integer.parseInt(student[i]);

            sb.append(String.format("%.3f%%\n", d*100));


        }
        System.out.println(sb);

    }
}