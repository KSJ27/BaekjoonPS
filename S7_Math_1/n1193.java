package S7_Math_1;
//수식화하기***
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
// import java.util.StringTokenizer;

public class n1193 {
    public static void main(String[] args) throws IOException{
        /*
        //입출력 조건을 반대로 보고 만듦;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(),"/");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n;
        if(a+b == 2) n = 1;
        else {
            n = (a+b-2)*(a+b-1)/2;
            if((a+b)%2 == 0) n = n + b;
            else n = n + a;
        }
        bw.write(String.valueOf(n));
        br.close();
        bw.close();
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        int a, b;
        int i = 1;
        if(num == 1) i = 2;
        else {
            num = num*2;
            while(i*(i-1) < num) i++;
        }
        a = (num - i*(i-1))/2;
        if(a == 0) a = 1;
        b = (i+1) - a;
        bw.write(a + "/" + b);
        br.close();
        bw.close();
    }
}
