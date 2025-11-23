
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] map;
    static int[] dr = {-1,0,1,0};
    static int[] dc = {0,1,0,-1};
    static int[][] dist;
    static int s_r, s_c;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        dist = new int[N][M];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==2){
                    s_r = i;
                    s_c = j;
                }
            }
        }
        BFS();
        System.out.println(sb);
    }

    static void BFS(){
        Queue<int[]> q = new ArrayDeque<>();
        for(int i = 0 ; i< N; i++){
            Arrays.fill(dist[i], -1);
        }
        
        dist[s_r][s_c] = 0;
        q.add(new int[]{s_r,s_c});

        while(!q.isEmpty()){
            int[]cur = q.poll();
            
            for(int d = 0; d<4; d++){
                int nr = cur[0]+dr[d];
                int nc = cur[1]+dc[d];

                if(nr<0||nc<0||nr>=N||nc>=M) continue;
                if(dist[nr][nc]!=-1) continue;
                if(map[nr][nc]==0){
                    dist[nr][nc] = 0;
                    continue;
                }
                dist[nr][nc] = dist[cur[0]][cur[1]] + 1;
                q.add(new int[]{nr,nc});
            }
        }

        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j<M; j++){
                if(dist[i][j]==-1 && map[i][j] == 0) dist[i][j] = 0; 
                sb.append(dist[i][j]).append(" ");
            }
            sb.append("\n");
        }
    }   

}
