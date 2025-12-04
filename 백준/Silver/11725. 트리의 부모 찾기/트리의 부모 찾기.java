import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static List<Integer> list[];
    static int[] parent;
    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        list = new ArrayList[N+1];
        visited = new boolean[N+1];
        parent = new int[N+1];
        for(int i = 1; i<=N; i++){
            list[i] = new ArrayList<>();
        }
        StringTokenizer st;
        for(int i = 0; i<N-1; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        DFS(1);
        for(int i = 2; i<=N; i++){
            sb.append(parent[i]).append("\n");
        }
        System.out.println(sb);
    }

    static void DFS(int cur){
        visited[cur] = true;
        for(int a : list[cur]){
            if(!visited[a]){
                parent[a] = cur;
                DFS(a);
            }
        }
    }
    
}
