package S4_One_Dimensional_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class n10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();

        int i = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max;
        int min;
        
        while(i > 0) {
            list.add(Integer.parseInt(st.nextToken()));
            i--;
        }
        max = list.get(0);
        min = list.get(0);
        
        for(int j = 0; j < list.size(); j++) {
            if(list.get(j) > max) max = list.get(j);
            if(list.get(j) < min) min = list.get(j);
        }

        bw.write(min + " " + max);
        bw.close();
    }
}
