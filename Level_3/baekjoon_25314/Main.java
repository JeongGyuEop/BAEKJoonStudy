package baekjoon_25314;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
			int n = scan.nextInt();
			int count = n / 4;

			for (int i=0; i < count; i++) {
			    System.out.print("long ");
			}
		}
        System.out.print("int");
    }
}
