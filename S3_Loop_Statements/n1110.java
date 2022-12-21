package S3_Loop_Statements;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class n1110 {
    public static void main(String[] arg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int result = num;
        int sum = 0;
        int time = 0;

        br.close();
        do {
            if(result < 10) sum = result;
            else sum = result/10 + result%10;
            result = result%10*10 + sum%10;
            time++;
        } while(num != result);

        bw.write(String.valueOf(time));
        bw.close();
    }
}
