import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성
        StringTokenizer st; //
        StringBuilder sb = new StringBuilder();
        int test_num = Integer.parseInt(br.readLine()); // 몇 번의 테스트를 진행할지 결정

        for (int i=0; i<test_num; i++) { // 테스트 넘버만큼 반복

            st = new StringTokenizer(br.readLine(), " "); // 입력받은 값을 공백에 따라 구분
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append("\n");

        }

        System.out.println(sb); // 연결된 문자열을 출력

    }
}