package S3_Loop_Statements;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class n8393 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = Integer.parseInt(br.readLine());
        int result = 0;

        while(i > 0) {
            result += i;
            i--;
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }
}
