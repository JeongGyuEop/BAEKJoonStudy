import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        String temp = br.readLine();
        int sum = 0;

        for (int i=0; i<num; i++) {
            sum = sum + temp.charAt(i) - 48;
            // -48을 하는 이유는 0-9까지는 유니코드상 48-57이기 때문이다.
        }

        System.out.println(sum);
    }
}