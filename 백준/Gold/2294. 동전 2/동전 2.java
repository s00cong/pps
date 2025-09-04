import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N,K;
    static int[] dp;
    static int[] coins;
    static final int INF = 1000000000;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        coins = new int[N];
        dp = new int[K+1];

        Arrays.fill(dp, INF);
        
        for(int i = 0 ; i<N;i++){
            coins[i] = Integer.parseInt(br.readLine().trim());
        }
        Arrays.sort(coins);

        dp[0] = 0;

        for(int i = 0; i<N; i++){
            for(int j = coins[i];j<=K;j++){
                if (dp[j - coins[i]] == INF) continue;
                dp[j] = Math.min(dp[j],dp[j-coins[i]]+1);
            }
        }

        if(dp[K]==INF) System.out.println(-1);
        else System.out.println(dp[K]);
    }
}
