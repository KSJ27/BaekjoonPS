package S4_One_Dimensional_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class n2562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];
        int max = 0;
        int maxIndex = 0;

        for(int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < 9; i++) {
            if(max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }

        bw.write(max + "\n" + String.valueOf(maxIndex+1));
        bw.close();
    }
}
