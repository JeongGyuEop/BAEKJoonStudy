package baekjoon_2753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());
        int A = year % 4;
        int B = year % 100;
        int C = year % 400;

        if (A == 0 && B != 0) {
            System.out.println("1");
        } else if (C == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}