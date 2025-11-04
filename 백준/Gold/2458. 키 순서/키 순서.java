import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    static int N,M;
    static ArrayList<Integer> adj[];
    static ArrayList<Integer> readj[];
    static int gtCnt,ltCnt;

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        adj = new ArrayList[N+1];
        readj = new ArrayList[N+1];

        for(int i = 0 ; i<=N; i++){
            adj[i] = new ArrayList<>();
            readj[i] = new ArrayList<>();
        }
        for(int i = 0 ; i<M ; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);  //단방향
            readj[b].add(a);    //역방향
        }

        int res = 0;
        for(int i = 1; i<=N; i++){
            gtCnt = ltCnt = 0;
            gtCnt = BFS(i,adj);   //자신보다 큰 친구 찾으러
            ltCnt = BFS(i,readj);   //자신보다 작은 친구 찾으러
            if(gtCnt + ltCnt == N-1) res++;// 자신보다 작은친구와 큰친구의 합이 N-1이면 자신이 몇번째인지 알 수 있다.
        }
        System.out.println(res);
    }

    static int BFS(int a,ArrayList<Integer>[] list){
        Queue<Integer> q = new ArrayDeque<>();
        boolean visited[] = new boolean[N+1];
        q.offer(a);
        visited[a] = true;
        int cnt = 0;
        while (!q.isEmpty()) {
            int cur = q.poll();
            
            for(int num : list[cur]){
                if(!visited[num]){
                    q.add(num);
                    visited[num] = true;
                    cnt++;
                }
            }
            
        }
        return cnt;
    }
    
}
