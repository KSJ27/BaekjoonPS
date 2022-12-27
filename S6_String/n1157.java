package S6_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class n1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] alpha = new int[26];
        String input = br.readLine();
        int most = 0;
        char mostIndex = 0;

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) > 64 && input.charAt(i) < 91) alpha[input.charAt(i)-65]++;
            else if(input.charAt(i) > 96 && input.charAt(i) < 123) alpha[input.charAt(i)-97]++;
        }

        for(char i = 0; i < alpha.length; i++) {
            if(most < alpha[i]) {
                most = alpha[i];
                mostIndex = i;
            }
            else if(most == alpha[i]) {
                mostIndex = 63;
            }
        }
        if(mostIndex == 63) bw.write(mostIndex);
        else bw.write(mostIndex+65);
        br.close();
        bw.close();
    }
}
