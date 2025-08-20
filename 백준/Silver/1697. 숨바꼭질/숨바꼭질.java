import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int K;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        dist = new int[500000];
        int result = 0;
        Arrays.fill(dist,-1);
        if(K<=N) result = N-K;
        else result = bfs(N);
        System.out.println(result);
    }


    static int bfs(int a){

        Deque<Integer> q = new ArrayDeque<>();
        dist[a] = 0;
        q.offer(a);

        while(!q.isEmpty()){

            int cur = q.poll();
            if (cur == K) return dist[cur];
            int[] nums = {cur-1,cur+1,cur*2};
            for(int nx : nums){
                if(nx>=0 && nx<500000&&dist[nx]==-1){
                    dist[nx] = dist[cur]+1;
                    q.offer(nx);
                }
            }

        }
        return -1;
    }
}
