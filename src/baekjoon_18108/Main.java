package src.baekjoon_18108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bulgi_year = Integer.parseInt(br.readLine());

        System.out.println(bulgi_year - 543);

    }
}