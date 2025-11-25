
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 누적합!
public class Main {
    static int N, M;
    static int[] A;
    static int[] sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N+1];
        sum = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<=N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        int a = 0;
        for(int i = 1 ; i <=N; i++){
            a += A[i];  //A[i]의 의미 : 1~i까지의 합
            sum[i] = a;
        }  //합 구하기  


        for(int t = 0; t<M; t++){
            long ans = 0;

            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            ans = sum[j]-sum[i-1];
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
    
}

