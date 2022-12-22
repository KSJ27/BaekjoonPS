package S6_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class n10809 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        byte[] alpha = new byte[26];
        for(byte i = 0; i < alpha.length; i++) alpha[i] = -1;
        
        String input = br.readLine();

        for(byte i = 0; i < input.length(); i++)
            if(alpha[input.charAt(i) - 97] == -1) alpha[input.charAt(i) - 97] = i;
        
        for(byte i = 0; i < alpha.length; i++) bw.write(alpha[i] + " ");

        br.close();
        bw.close();
    }
}
