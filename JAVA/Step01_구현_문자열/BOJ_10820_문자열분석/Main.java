package BOJ_10820_문자열분석;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            int lower = 0, upper = 0, digit = 0, space = 0;

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (Character.isLowerCase(c)) lower++;
                else if (Character.isUpperCase(c)) upper++;
                else if (Character.isDigit(c)) digit++;
                else if (c == ' ') space++;
            }

            System.out.println(lower + " " + upper + " " + digit + " " + space);
        }
    }
}
