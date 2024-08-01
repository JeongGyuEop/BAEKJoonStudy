package baekjoon_9498;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score = Integer.parseInt(br.readLine());

        /* if문을 사용한 경우
        if(score > 90) {
            System.out.println("A");
        } else if (score > 80) {
            System.out.println("B");
        } else if (score > 70) {
            System.out.println("C");
        } else if (score > 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        */

        //삼항연산자를 사용한 경우
        System.out.print((score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F");


    }
}