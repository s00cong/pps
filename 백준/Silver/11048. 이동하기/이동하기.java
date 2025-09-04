import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static int N, M;
    static int[][] map;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N+1][M+1];
        dp = new int[N+1][M+1];
        for(int i = 0 ;i<=N; i++){
            Arrays.fill(dp[i], 0);
            Arrays.fill(map[i], 0);
        }
        

        for(int i = 1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=M; j++){
                dp[i][j] = max(dp[i-1][j-1],dp[i-1][j],dp[i][j-1])+map[i][j];
            }
        }
        System.out.println(dp[N][M]);

    }

    static int max (int a, int b, int c){
        int MAX = a;
        if(MAX < b)MAX = b;
        if(MAX < c) MAX = c;
        return MAX;
    }
}
