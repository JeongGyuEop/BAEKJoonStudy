package baekjoon_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        Map<Character, Integer> arr = new HashMap<>();
        int maxCount = 0;
        char maxKey = '?';

        // 공부 후 수정한 코드
        for(int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            arr.put(key, arr.getOrDefault(key, 0) + 1);

            int currentCount = arr.get(key);
            if(currentCount > maxCount){
                maxCount = currentCount;
                maxKey = key;
            } else if(currentCount == maxCount){
                maxKey = '?';
            }
        }

        // 내가 풀이한 코드
//        for(int i = 0; i < str.length(); i++) {
//            char key = str.charAt(i);
//            if(!arr.containsKey(key)){
//                arr.put(key, 1);
//                if(arr.get(key) > maxCount){
//                    maxCount = arr.get(key);
//                    maxKey = key;
//                } else if(arr.get(key) == maxCount){
//                    maxKey = '?';
//                }
//            } else {
//                arr.put(key, arr.get(key) + 1);
//                if(arr.get(key) > maxCount){
//                    maxCount = arr.get(key);
//                    maxKey = key;
//                } else if(arr.get(key) == maxCount){
//                    maxKey = '?';
//                }
//            }
//        }

        System.out.println(maxKey);
    }
}