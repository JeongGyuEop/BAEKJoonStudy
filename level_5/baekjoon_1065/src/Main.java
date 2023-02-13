import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result = d(num);
        System.out.println(result);
    }

    public static int d(int number) {
        int count = 0;

        if(number < 100) {
            return number;
        }else {
            count = 99;

            for (int i=100; i<=number; i++) {
                int hun = i/100; //백의 자리
                int ten = (i/10)%10; // 십의  자리
                int one = i%10; // 일의 자리

                if(hun-ten == ten-one) {
                    count++;
                }
            }
        }


        return count;

    }

}
    /* 주의할 점
     -> 한수란?
        => 각 자리수들이 등차수열을 이루는 수
     -> 등차수열이란?
        => 각 항들이 일정한 차이를 보이는 수열

     ex) 123(공차 1), 753(공차 2), 111(공차 0)

     만약 3자리수 미만인 경우는??
      => 1자리수, 2자리수는 모두 한수로 인정한다.
      110의 경우 -> 3자리일 때 나올 수 있는 한수가 없기 때문에 1~99까지만 한수로 인정

     */
