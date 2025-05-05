package BOJ_1152_단어의_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.trim();

        if(s.isEmpty()) {
            System.out.println(0);
        } else {
            String[] arr = s.split(" ");
            System.out.println(arr.length);
        }
        
    }
    
}
