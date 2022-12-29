package S6_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n2908 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String a = st.nextToken();
        String b = st.nextToken();
        String tmpA = String.valueOf(a.charAt(2)) + String.valueOf(a.charAt(1)) + String.valueOf(a.charAt(0));
        String tmpB = String.valueOf(b.charAt(2)) + String.valueOf(b.charAt(1)) + String.valueOf(b.charAt(0));

        if(tmpA.compareTo(tmpB) > 0) bw.write(tmpA);
        else bw.write(tmpB);
        br.close();
        bw.close();
    }
}
