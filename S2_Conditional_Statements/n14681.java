package S2_Conditional_Statements;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class n14681 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = s.nextInt();
        int y = s.nextInt();

        if(x > 0 && y > 0) bw.write('1');
        else if(x < 0 && y > 0) bw.write('2');
        else if(x < 0 && y < 0) bw.write('3');
        else bw.write('4');

        s.close();
        bw.close();
    }
}
