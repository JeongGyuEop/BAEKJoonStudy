package baekjoon_9086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] str = new String[count];

        for (int i = 0; i < count; i++) {
            str[i] = br.readLine();
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i].charAt(0) + "" + str[i].charAt(str[i].length() - 1));
        }
    }
}