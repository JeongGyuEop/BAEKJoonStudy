import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num_A = Integer.parseInt(st.nextToken()); // 정수 N
        int num_B = Integer.parseInt(st.nextToken()); // 정수 X
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int[] numArray = new int[num_A];

        for (int i=0; i<num_A; i++) {
            numArray[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<numArray.length; i++) {
            if (numArray[i] < num_B) {
                sb.append(numArray[i]).append(" ");
            }
        }

        System.out.print(sb);
        br.close();

    }
}