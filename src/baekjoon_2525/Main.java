package baekjoon_2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cook_time = Integer.parseInt(br.readLine());
        int hour = Integer.parseInt(st.nextToken()) * 60;
        int min = Integer.parseInt(st.nextToken());

        int all_min = hour + min + cook_time;
        hour = all_min / 60;
        min = all_min % 60;

        if(hour >= 24) {
            hour = hour - 24;
        }

        System.out.println(hour + " " + min);

    }
}