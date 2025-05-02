package BOJ_11721_열_개씩_끊어_출력하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        while (str.length() > 10) {
            System.out.println(str.substring(0,10));
            str = str.substring(10);
        }
        
        // 남은 글자가 있다면 마지막 출력
        if(!str.isEmpty()) {
            System.out.println(str);
        }

    }
}
