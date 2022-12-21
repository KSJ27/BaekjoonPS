package S2_Conditional_Statements;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(a == b && b == c) bw.write(String.valueOf(10000 + a * 1000));
        else if(a == b && b != c) bw.write(String.valueOf(1000 + a*100));
        else if(a != b && b == c) bw.write(String.valueOf(1000 + b*100));
        else if(a == c && a != b) bw.write(String.valueOf(1000 + c*100));
        else {
            int max = a;
            if(max < b) max = b;
            if(max < c) max = c;
            bw.write(String.valueOf(max*100));
        } 
        bw.close();

    }
    
}
