package S4_One_Dimensional_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class n8958 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0; i < n; i++) {
            int a = 0;
            str = br.readLine();
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'O') {
                    a++;
                    sum += a;
                }
                else if(str.charAt(j) == 'X') {
                    a = 0;
                }
            }             
            bw.write(String.valueOf(sum) + "\n");
            sum = 0;
        }
        br.close();
        bw.close();
    }
}
