package S7_Math_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n10250 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            st.nextToken();
            int guest = Integer.parseInt(st.nextToken());
            int x = guest%height;
            int y = guest/height+1;
            if(guest%height == 0) {
                x = height;
                y = guest/height;
            }
            x *= 100;
            bw.write(String.valueOf(x+y)+"\n");
            // if(guest%height == 0) bw.write(String.valueOf(height));
            // else bw.write(String.valueOf(guest%height));
            // if((guest/height+1) < 10) bw.write("0");
            // if(guest%height == 0) bw.write(String.valueOf(guest/height)+"\n");
            // else bw.write(String.valueOf(guest/height+1)+"\n");
        }
        br.close();
        bw.close();
    }
}