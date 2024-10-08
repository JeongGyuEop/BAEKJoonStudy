package baekjoon_2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numArray = new int[9];
        int max = 0;
        int count = 0;

        for (int i=0; i<9; i++) {
            numArray[i] = Integer.parseInt(br.readLine());
        }

        /*
        for (int i=0; i<numArray.length; i++){
            if(numArray[i] > max) {
                max = numArray[i];
            }
        }

        for (int i=0; i<numArray.length; i++){
            if(numArray[i] == max) {
                count++;
                break;
            }
            count++;
        }
        */

        // 위의 주석과 같이 사용할 수도 있지만,
        // 아래의 방법처럼 소스코드를 간결화할 수 있다.
        for (int i=0; i<9; i++){
            if(numArray[i] > max) {
                max = numArray[i];
                count = i+1;
                // max 값의 인덱스 번호가 아니라, 몇번째 수인지 구해야하기 때문에 인덱스 번호에서 1을 더해야한다.
            }
        }

        System.out.println(max);
        System.out.println(count);

    }
}