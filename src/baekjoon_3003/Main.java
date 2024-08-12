package src.baekjoon_3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;
        // 미리 체스 각각의 갯수를 정의하고

        StringTokenizer st = new StringTokenizer(br.readLine());
        king = king - Integer.parseInt(st.nextToken());
        queen = queen - Integer.parseInt(st.nextToken());
        rook = rook - Integer.parseInt(st.nextToken());
        bishop = bishop - Integer.parseInt(st.nextToken());
        knight = knight - Integer.parseInt(st.nextToken());
        pawn = pawn - Integer.parseInt(st.nextToken());
        // 입력을 토큰으로 나누어 정의했던 값에 입력값을 빼주어 재정의하면 된다.

        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(rook + " ");
        System.out.print(bishop + " ");
        System.out.print(knight + " ");
        System.out.print(pawn + " ");

    }
}

// 혹은

/*
import java.util.Scanner;

//1 1 2 2 2 8
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int comp[] = {1, 1, 2, 2, 2, 8};
        int input[] = new int[6];
        for(int i=0; i<input.length; i++){
            input[i] = sc.nextInt();
            System.out.print(comp[i] - input[i] + " ");
        }
    }
}
*/
