package S4_One_Dimensional_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class n10807 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();

        int i = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(br.readLine());

        int result = 0;
        
        while(i > 0) {
            list.add(Integer.parseInt(st.nextToken()));
            i--;
        }
        
        for(int j = 0; j < list.size(); j++) {
            if(list.get(j) == num) result++;
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
