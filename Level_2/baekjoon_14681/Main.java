package baekjoon_14681;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

       /*
       if(A > 0 && B > 0) {
            System.out.println("1");
        } else if (A < 0 && B > 0) {
            System.out.println("2");
        } else if (A < 0 && B < 0) {
            System.out.println("3");
        } else if (A > 0 && B < 0){
            System.out.println("4");
        }
        */

        if(A > 0) {
            if(B > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {
            if(B > 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }

    }
}