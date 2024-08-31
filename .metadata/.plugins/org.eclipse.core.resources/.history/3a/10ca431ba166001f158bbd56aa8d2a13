import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int total_box = Integer.parseInt(st.nextToken()); // 총 바구니의 수
        int change_count = Integer.parseInt(st.nextToken()); // 공을 바꾸는 횟수

        int[] arr = new int[total_box];

        for (int i = 1; i <= total_box; i++) {
            arr[i-1] = i;
        }

        for(int i=0; i<change_count; i++) {
            st = new StringTokenizer(br.readLine());
            int first_num = Integer.parseInt(st.nextToken()) -1;
            int second_num = Integer.parseInt(st.nextToken()) -1;
            int temp = arr[first_num];
            arr[first_num] = arr[second_num];
            arr[second_num] = temp;
        }

//        for(int i=0; i<total_box; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // 결과를 출력할 때 사용하는 다른 방법 (StringBuilder 사용)
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<total_box; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);

    }
}