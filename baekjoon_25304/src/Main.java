import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int price = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i=0; i<num; i++) {

            st = new StringTokenizer(br.readLine(), " ");
            sum += (Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));

        }

        if (sum == price) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}