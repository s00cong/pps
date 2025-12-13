
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, R, C;
    static long cnt = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        Z(0,0,(int)Math.pow(2, N));
        System.out.println(cnt);
        
    }

    static void Z(int r, int c, int size) {
        if (size == 1) {
            
            return;
        }
        int half = size / 2;
        //1
        if (R < r + half && C < c + half) {
            Z(r, c, half);
        } 
        //2
        else if (R < r + half && C >= c + half) {
            cnt += (long) half * half;
            Z(r, c + half, half);
        } 
        //3
        else if (R >= r + half && C < c + half) {
            cnt += (long) half * half * 2;
            Z(r + half, c, half);
        } 
        //4
        else  {
            cnt += (long) half * half * 3;
            Z(r + half, c + half, half);
        }
    }
}

