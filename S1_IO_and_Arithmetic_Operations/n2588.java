package S1_IO_and_Arithmetic_Operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class n2588 {
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        br.close();
        
        StringBuilder sb = new StringBuilder();
        sb.append(num1 * (num2 % 10));
        sb.append('\n');
        sb.append(num1 * (((num2) / 10) % 10));
        sb.append('\n');
        sb.append(num1 * (num2 / 100));
        sb.append('\n');
        bw.write(String.valueOf(sb));
        bw.write(String.valueOf(num1 * num2));

        
        bw.close();
    }
}
