import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N,M;
    static int[] indegree;
    static List<Integer>[] g;
    static Queue<Integer> q = new ArrayDeque<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        indegree = new int[N+1];
        g = new ArrayList[N+1];
        for(int i = 1; i<=N; i++){
            g[i] = new ArrayList<>();
        }

        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            indegree[b]++;
            g[a].add(b); // 그래프 만들었다!
        }

        for(int i = 1; i<=N; i++){
            if(indegree[i]==0)q.add(i);
        }
        int idx;
        while(!q.isEmpty()){
            idx = q.poll();
            sb.append(idx).append(" ");
            for(int next : g[idx]){
                indegree[next]--;
                if(indegree[next]==0){
                    q.offer(next);
                }
            }
        }

        System.out.println(sb.toString());
    }
    
}
