import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int N,M;
    static int[] visited;
    static List<Integer> list[];
    static int cnt;
    static boolean found = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new int[N];
        list = new ArrayList[N];
        for(int i = 0; i<N; i++){
            list[i]= new ArrayList<>();
        }
        for(int i  = 0; i<M; i++){
            st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        for (int i = 0; i < N && !found; i++) {
            dfs(i, 1);       // i에서 시작해 정점 1개 방문 상태
        }
        System.out.println(found? 1 : 0);
        
    }

    static void dfs(int a,int depth){
        if(found) return;
        if(depth==5){
            found = true;
            return;
        }
        visited[a] = 1;
        for (int v : list[a]) {
            if (visited[v]!=1) {
                dfs(v, depth + 1);
            }
        }
        visited[a] = 0;

    }
}