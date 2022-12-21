package S3_Loop_Statements;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class n2739 {
    public static void main(String[] arg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        br.close();

        for(int i = 1; i < 10; i++)
            bw.write(num + " * " + i + " = " + num*i + "\n");
        
        bw.close();
    }
}
