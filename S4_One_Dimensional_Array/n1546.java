package S4_One_Dimensional_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class n1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double sum = 0;
        int max = 0;

        for(int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
            sum += list.get(i);
        }

        for(int i = 0; i < n; i++) {
            if(max < list.get(i)) max = list.get(i);
        }

        bw.write(String.valueOf(sum/n/max*100));
        bw.close();
    }
}
