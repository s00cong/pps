import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int r,c;
    static int[][] map;
    static int[][] visited;
    static int[][][] dp; // (r,c)에 파이프가 d 방향으로 끝났을 때! 끝점을 나타냄!

    //dp : 현재상태 = 이전에서 어떻게 왔어!?
    /*
     * dp[1][2][0] = 1  (1,1)~(1,2) 상태
     * 가로일 때 : 0
     * 세로일 때 : 1
     * 대각선일 때 : 2
     */
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N+1][N+1];
        dp = new int[N+1][N+1][3];

        for(int i = 1; i <= N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[1][2][0] = 1;      // 시작 상태

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){

                if(map[i][j] == 1) continue;   // 벽이면 못 옴

                // 가로
                if(j-1 >= 1)
                    dp[i][j][0] += dp[i][j-1][0] + dp[i][j-1][2];

                // 세로
                if(i-1 >= 1)
                    dp[i][j][1] += dp[i-1][j][1] + dp[i-1][j][2];

                // 대각
                if(i-1>=1 && j-1>=1 && map[i][j-1]==0 && map[i-1][j]==0)
                    dp[i][j][2] += dp[i-1][j-1][0] + dp[i-1][j-1][1] + dp[i-1][j-1][2];
            }
        }

        System.out.println(dp[N][N][0] + dp[N][N][1] + dp[N][N][2]);
    }
}
