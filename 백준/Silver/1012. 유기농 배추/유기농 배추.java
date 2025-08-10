import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    static boolean[][] map;
    static boolean[][] visited;
    static int N,M,K;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        for(int test = 0; test<T; test++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            map = new boolean[M][N];
            visited = new boolean[M][N];
            int cnt = 0;

            for(int i = 0; i<K;i++){
                st = new StringTokenizer(br.readLine());
                int r = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                map[r][c] = true;
            }
            
            for(int i = 0; i<M; i++){
                for(int j = 0 ; j<N; j++){
                    if(map[i][j]&&!visited[i][j]){
                        bfs(i,j);
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append('\n'); 
        }
        System.out.print(sb.toString());
    }

    public static void bfs(int r, int c){
        Deque<int[]> q = new ArrayDeque<>();
        visited[r][c] = true;
        q.add(new int[]{r,c});
        

        while(!q.isEmpty()){
            int[]cur = q.poll();
            
            int curR = cur[0]; int curC = cur[1];
            for(int i = 0; i<4; i++){
                int nr = curR + dr[i];
                int nc = curC + dc[i];

                if(nr<0||nr>=M||nc<0||nc>=N) continue;
                if(map[nr][nc]&&!visited[nr][nc]){
                    visited[nr][nc] = true;
                    q.add(new int[]{nr,nc});
                }
            }
        }
        
    }
}
