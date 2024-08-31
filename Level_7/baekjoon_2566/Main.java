package baekjoon_2566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
    	// 입력을 받기 위해서 BufferedReader 사용
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	// 한 줄을 입력받아 저장하기 위한 str 변수 선언
    	String str;
    	
    	// 최댓값을 저장할 변수선언
        // 초기값은 모든 값보다 작은 -1로 설정한다.
    	int maxNum = -1;
    	
    	// 최대값의 위치를 저장할 배열 선언
        int[] result = new int[2];
    	
        // 9개의 줄을 읽기 위한 반복문
    	for(int i = 0; i < 9; i++) {
    		// 한 줄의 입력을 받아 str 변수에 저장
    		str = br.readLine();
    		
    		// 해당 줄에서 가장 큰 값을 찾고 그 값의 인덱스를 배열로 반환받아 remax 변수에 저장
    		int[] remax = selectNum(str);
    		// 만약 반환받은 값의 첫번째 값(입력의 값 중 가장 큰 값)이 저장되어 있는 값보다 그다면
    		if(remax[0] > maxNum) {
    			// 새로운 최대값으로 갱신
    			maxNum = remax[0];
    			// 행 번호 갱신(1부터 시작)
    			result[0] = i+1;
    			// 열 변호 갱신
    			result[1] = remax[1];
    		}
    		
    	}
    	// 최대값을 출력
    	System.out.println(maxNum);
    	// 최대값의 위치(인덱스)를 출력
    	System.out.print(result[0] + " " + result[1]);

    }
    
    // 문자열에서 가장 큰 값을 찾고 그 값과 위치를 반환하는 메소드
    private static int[] selectNum(String s) {
    	// 매개변수로 전달받은 문자열을 공백을 기준으로 하나씩 읽기 위해 StringTokenizer 사용
    	StringTokenizer st = new StringTokenizer(s);
    	// 각 행의 숫자를 저장할 배열
    	int[] num = new int[9]; 
    	
    	// 9개를 숫자를 배열에 저장
    	for(int i = 0; i < 9; i++) {
    		num[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	// 배열에서 가장 큰 값을 찾아 maxNum에 저장
    	int maxNum = Arrays.stream(num).max().getAsInt();
    	
    	// 가장 큰 값의 위치를 찾아서 [값, 위치] 배열로 반환
    	for(int i = 0; i < num.length; i++) {
    		if(num[i] == maxNum ) {
    			return new int[] {maxNum, i+1};
    		}
    	}
		return null; // 형식상 반환값을 위해 존재
    }

}
