package S3_Loop_Statements;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class n2439 {
    public static void main(String[] arg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        br.close();

        for(int i = 1; i <= num; i++) {
            for(int j = 0; j < num - i; j++) bw.write(' ');
            for(int k = 0; k < i; k++)
                bw.write('*');
            bw.write("\n");
        }               
        
        bw.close();
    }
}
