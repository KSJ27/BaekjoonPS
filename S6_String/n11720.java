package S6_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class n11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = Integer.parseInt(br.readLine());
        
        String input = br.readLine();
        int sum = 0;
        for(int i = 0; i < len; i++)
            sum += input.charAt(i)-48;
            
        bw.write(String.valueOf(sum));

        br.close();
        bw.close();
    }
}
