package S3_Loop_Statements;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n10951 {
    public static void main(String[] arg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        StringTokenizer st;

        int a, b;
        while(true) {
            str = br.readLine();
            if(str == null) break;
            st = new StringTokenizer(str, " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(a+b) + "\n");
        } 
        br.close();
        bw.close();
    }
}
