package BOJ_2908_상수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    // 문자열을 나누지 않고도 뒤집을 수는 있지만, 그렇게 되면 두 수가 석여버릴 수 있어서 
    // 아래와 같이 두 수를 나눈 후 뒤집어서 사용하는 것이 문제의 방향과도 맞음.

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        String s1 = new StringBuffer(s[0]).reverse().toString();
        String s2 = new StringBuffer(s[1]).reverse().toString();

        int reverseNum1 = Integer.parseInt(s1);
        int reverseNum2 = Integer.parseInt(s2);

        System.out.println(Math.max(reverseNum1, reverseNum2));

    }

}
