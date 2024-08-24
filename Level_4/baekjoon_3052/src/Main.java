import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] numArray = new boolean[42];
        int count = 0;

        for (int i=0; i<10; i++) {
            numArray[Integer.parseInt(br.readLine()) % 42] = true;
        }

        for (boolean val : numArray) {
            if(val) {
                count++;
            }
        }
        System.out.println(count);

    }
}