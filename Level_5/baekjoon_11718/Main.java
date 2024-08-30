package baekjoon_11718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while (true) {
            str = br.readLine();

            if (str == null || str.equals("exit")) {
                break;  // 입력이 null이거나 "exit"이라면 루프를 종료
            }

            System.out.println(str);
        }
    }
}