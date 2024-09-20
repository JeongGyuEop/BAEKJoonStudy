package baekjoon_2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		// BufferedReader를 사용해서 입력받은 값을 빠르게 처리한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력받은 값을 공백으로 구분하여 StringTokenizer로 처리한다.
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 낮에 올라가는 거리
		int climb = Integer.parseInt(st.nextToken());
		// 밤에 미끄러지는 거리
		int down = Integer.parseInt(st.nextToken());
		// 나무의 높이
		int height = Integer.parseInt(st.nextToken());
		
		// 하루에 실제로 올라가는 거리(낮에 올라가는 거리 - 밤에 미끄러지는 거리)
		int oneDayClimb = climb - down;
		
		// 정상에 도달하기 전날까지의 높이를 계산 : (height - down)
		// 전날까지의 높이를 하루에 올라가는 거리로 나누어 몇 일이 걸리는지 계산
		int result = (height-down) / oneDayClimb;
		
		// 나머지가 있으면 하루가 더 필요하므로 하루를 더 추
		if((height-down) % oneDayClimb != 0) {
			result++;
		}
		
		// 결과 출
		System.out.println(result);
		
	}

}
