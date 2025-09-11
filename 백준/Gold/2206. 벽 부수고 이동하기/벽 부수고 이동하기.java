import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[][] map;
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    static int[][][] dist;  //visited 역할

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        String Line;
        dist = new int[N+1][M+1][2];
        map = new int[N+1][M+1];
        for(int i = 1; i<=N; i++){
            Line = br.readLine().trim();
            for(int j = 1; j<=M; j++){
                map[i][j] = Line.charAt(j-1) -'0';
            }
        }
        BFS();

    }

    static void BFS(){

        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{1,1,0});
        dist[1][1][0] = 1;
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int curx = cur[0];
            int cury = cur[1];
            int broke = cur[2];
            if(curx == N && cury ==M) {    //N,M 도달
                System.out.println(dist[curx][cury][broke]);
                return;
            }

            for(int d = 0; d<4; d++){
                int nr = curx + dr[d];
                int nc = cury + dc[d];
                
                if(nr<=0||nr>N||nc<=0||nc>M) continue;
                
                if(map[nr][nc]==0 && dist[nr][nc][broke]==0 ){
                    q.offer(new int[]{nr,nc,broke});
                    dist[nr][nc][broke] = dist[curx][cury][broke]+1;
                }
                if(map[nr][nc]==1 && broke==0 && dist[nr][nc][broke]==0 ){
                    dist[nr][nc][1] = dist[curx][cury][broke]+1;
                    q.offer(new int[]{nr,nc,1}) ;
                }
                

            }
        }
        System.out.println(-1);

    }   

}
