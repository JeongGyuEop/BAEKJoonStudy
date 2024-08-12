package src.baekjoon_10998;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader 클래스는 버퍼를 이용해서 읽고 쓰는 함수이다.
        //버퍼를 이용하기 때문에 입출력의 효율이 매우 좋아진다.

        /*
        InputStream은
        1 byte의 int형의 아스키 코드값으로 값을 저장한다.
        InputStream 객체를 상속받는 System.in의 read() 메서드를 통해서 값을 입력받을 수 있다.

        inputStreamReader는 byte 대신 char 형태로 읽을 수 있다.
        따라서 아스키코드가 아닌 문자열로 출력이 가능하며, String 객체로 변환할 수도 있게 된다.
        inputStream을 인자값으로 받아와서 만들어진다.
        */

        StringTokenizer st = new StringTokenizer(br.readLine());
        //StringTokenizer는 특정 문자에 따라 문자열을 나누고 싶은 경우에 사용한다.
        //하나의 문자열을 여라새의 토큰으로 분리하는 클래스이다.

        int a = Integer.parseInt(st.nextToken());
        //Integer.parseInt는 string형식의 문자열을 int형식으로 변환해여 주는 함수이다.
        int b = Integer.parseInt(st.nextToken());
        //st.nextToken()함수는 토큰 단위로 구분한 문자열의 다음 토큰을 읽어들이는 기능을 한다.

        System.out.print(a*b);

    }
}
