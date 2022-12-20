package S1_IO_and_Arithmetic_Operations;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class n10171 {
    public static void main(String[] arg) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf("\\    /\\\n )  ( \')\n(  /  )\n \\(__)|"));
        bw.close();
    }
}
