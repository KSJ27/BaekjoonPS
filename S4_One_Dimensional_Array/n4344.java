package S4_One_Dimensional_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class n4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int length = Integer.parseInt(st.nextToken());
            double avg = 0;
            int student = 0;
            for(int j = 0; j < length; j++) {
                list.add(Integer.parseInt(st.nextToken()));
                avg += list.get(j);
            }
            avg = avg/length;

            for(int j = 0; j < length; j++) {
                if(list.get(j) > avg) 
                    student++;
            }
            double result = (double)student/(double)length*100;
            bw.write(String.format("%.3f", result) + "%\n");
            list.clear();
        }
        
        br.close();
        bw.close();
    }
}
