package S7_Math_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class n2292 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int roomNum = Integer.parseInt(br.readLine());
        br.close();
        int route = 0;
        if(roomNum == 1) route = 1;
        else if((roomNum-1)/3 < 1) route = 2;
        else{
            if((roomNum-1)%3>0) roomNum = (roomNum-1)/3+1;
            else roomNum = (roomNum-1)/3;
            while(roomNum > route*(route-1)) route++;
        }
        bw.write(String.valueOf(route));
        bw.close();
    }
}
