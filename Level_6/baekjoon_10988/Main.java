package baekjoon_10988;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader 를 사용하여 입력을 받기 위한 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder를 사용하기 위한 변수 선언
        StringBuilder sb;

        // 입력된 문자열을 한줄 읽어온다.
        String str = br.readLine();
        // 읽어온 문자열을 StringBuilder로 변환
        sb = new StringBuilder(str);
        // 문자열을 반전시킨다.
        String newStr = sb.reverse().toString();
        if(newStr.equals(str)) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}