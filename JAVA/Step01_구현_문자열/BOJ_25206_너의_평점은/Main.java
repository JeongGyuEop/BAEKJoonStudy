package BOJ_25206_너의_평점은;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Double> map = new HashMap<>();

        String[] grade = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double[] score = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};

        double sumGradeScore = 0.0;
        double xGradeScore=0.0;

        for(int i=0; i<score.length; i++) {
            map.put(grade[i], score[i]);
        }

        double result = 0.0;

        for(int i=0; i<20; i++) {
            String[] str = br.readLine().split(" ");
            if(!str[2].equals("P")) {
                sumGradeScore += Double.parseDouble(str[1]);
                xGradeScore += Double.parseDouble(str[1]) * map.get(str[2]);
            }
        }

        result = xGradeScore / sumGradeScore;
        System.out.println(result);

    }

}
