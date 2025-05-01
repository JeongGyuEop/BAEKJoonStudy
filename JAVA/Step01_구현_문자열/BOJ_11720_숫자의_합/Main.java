package BOJ_11720_숫자의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if (input != null && !input.isEmpty()) {
            int n = Integer.parseInt(input);
            String number = br.readLine();
        
            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                sum += number.charAt(i) - '0';
            }
            System.out.println(sum);
        }
    }
    
}
