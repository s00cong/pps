import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static int N;
    static ArrayList<Integer>[] nodes;
    static int[] must_cnt;
    static int[] times;
    static int[] dp;
    static Queue<Integer> q = new ArrayDeque<>();

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        nodes = new ArrayList[N+1]; // 연결된거!
        must_cnt = new int[N+1];    //선행 작업의 개수
        times = new int[N+1];       // 각 작업의 시간
        dp = new int[N+1];
        
        for(int i = 1; i<=N; i++ ) nodes[i] = new ArrayList<>();
        

        for(int i = 1; i<=N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken());
            times[i] = time;
            must_cnt[i] = cnt;
            
            
            for(int j = 0; j< cnt; j++){
                int pre = Integer.parseInt(st.nextToken());
                nodes[pre].add(i);
            }

        }

        for(int i = 1; i<=N; i++){
            if(must_cnt[i] == 0){
                dp[i] = times[i];
                q.add(i);
            }
        }

        bfs();
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            ans = Math.max(dp[i], ans);
        }

        System.out.println(ans);

    }


    static void bfs() {

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int nxt : nodes[cur]) {
                dp[nxt] = Math.max(dp[nxt], dp[cur] + times[nxt]);
                must_cnt[nxt]--;

                if (must_cnt[nxt] == 0) {
                    q.add(nxt);
                }
            }
        }
    }
}