package BOJ_1330_두_수_비교하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        
        int num1 = Integer.parseInt(s[0]);
        int num2 = Integer.parseInt(s[1]);

        if(num1 > num2) {
            System.out.println(">");
        } else if(num1 < num2) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

    }

}
