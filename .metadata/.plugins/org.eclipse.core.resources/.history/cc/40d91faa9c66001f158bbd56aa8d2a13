import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); // 정수 갯수 입력
        int[] numArray = new int[num]; // 정수 배열 생성
        int count = 0; // 찾고자하는 정수의 갯수

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<num; i++){
            numArray[i] = Integer.parseInt(st.nextToken()); // 배열에 입력 받은 값들을 저장
        }

        int numSearch = Integer.parseInt(br.readLine()); // 찾고자 하는 숫자 입력

        for (int i=0; i<numArray.length; i++) {
            if(numArray[i] == numSearch) { // 만약 배열의 값이 찾으려는 정수와 같다면
                count++; // 카운트 증가
            }
        }

        System.out.println(count);
        br.close();

    }
}