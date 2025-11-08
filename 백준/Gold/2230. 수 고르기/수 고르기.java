import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static int N,M;
    static int[] A;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N];  
        
        for(int i = 0 ; i < N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }
        int start=0, end =0;
        
        Arrays.sort(A); 

        for(start = 0; start < N; start++){
            while(end < N && A[end]-A[start]<M) end++;  
            if(end == N) break; // end가 범위를 벗어나면 종료!!
            min  = Math.min(min, A[end]-A[start]);
        }
        System.out.println(min);

    }
}
