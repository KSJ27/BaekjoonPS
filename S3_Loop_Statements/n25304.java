package S3_Loop_Statements;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n25304 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int a , b;
        int sum = 0;

        while(n > 0) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum += a*b;
            n--;
        }

        if(x == sum) bw.write("Yes");
        else bw.write("No");

        bw.close();
    }
    
}
