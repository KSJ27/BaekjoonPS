package S4_One_Dimensional_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class n3052 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();
        int input;

        for(int i = 0; i < 10; i++) {
            if(!list.contains((input = Integer.parseInt(br.readLine()))%42))
                list.add(input%42);
        }
        br.close();

        bw.write(String.valueOf(list.size()));

        bw.close();
    }
}
