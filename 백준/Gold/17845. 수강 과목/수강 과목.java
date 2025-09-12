import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 총 시간
        int K = Integer.parseInt(st.nextToken()); // 과목 수

        int[] importance = new int[K + 1];
        int[] time = new int[K + 1];

        for (int i = 1; i <= K; i++) {
            st = new StringTokenizer(br.readLine());
            importance[i] = Integer.parseInt(st.nextToken());
            time[i] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[K + 1][N + 1];

        for (int i = 1; i <= K; i++) {
            for (int t = 0; t <= N; t++) {
                dp[i][t] = dp[i - 1][t]; // 선택 안 함
                if (t >= time[i]) {
                    dp[i][t] = Math.max(dp[i][t], dp[i - 1][t - time[i]] + importance[i]);
                }
            }
        }

        System.out.println(dp[K][N]);
    }
}
