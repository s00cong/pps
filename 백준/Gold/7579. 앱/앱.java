import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //백준 - 앱
    static int N,M;
    static int[] mem;
    static int[] cost;
    static int[] dp;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());   //N개의 앱
        M = Integer.parseInt(st.nextToken());   //최소 M바이트가 필요함  

        mem = new int[N+1];
        cost = new int[N+1];


        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<= N; i++){
            mem[i] = Integer.parseInt(st.nextToken());   //각 앱의 메모리 차지 용량
        }
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<= N; i++){
            cost[i] = Integer.parseInt(st.nextToken());   //각 앱의 비활성화 비용
            sum += cost[i];
        }
        dp = new int[sum+1];


        //비활성화의 최소의 비용 : dp[N][W]의 값이 최소여야한다... M바이트를 확보해야함...
        for(int i = 1; i<=N; i++){
            for(int j = sum; j>=cost[i]; j--){
                dp[j] = Math.max(dp[j],dp[j-cost[i]]+mem[i]);
            }
        }
        int res = 0;
        for(int i = 0; i<=sum; i++){
            if(dp[i]>=M){
                res = i;
                break;
            }
        }
        System.out.println(res);

    }
}
