import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

class Pair {
    int x, y, h;
    Pair(int x, int y, int h){
        this.x = x;
        this.y = y;
        this.h = h;
    }
    
}

public class Main {
    static int[] ddr = {-2,-2,-1,-1,1,1,2,2};
    static int[] ddc = {1,-1,2,-2,2,-2,1,-1};
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    static int[][] map;
    static int[][][] dist;
    static int K,W,H;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        K = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        map = new int[H+1][W+1];
        dist = new int[H+1][W+1][K+1];    //K의 개수

        for(int i = 1 ; i <= H; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=W; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        BFS();
    }

    static void BFS(){
        Queue<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(1, 1, 0));
        dist[1][1][0] = 1;  //방문

        while(!q.isEmpty()){
            Pair cur = q.poll();
            if(cur.x == H && cur.y == W){
                System.out.println(dist[cur.x][cur.y][cur.h]-1);
                return;
            }

            for(int d = 0; d<4 ; d++){
                int nr = dr[d]+cur.x;
                int nc = dc[d]+cur.y;
                int nh = cur.h;

                if(nr<=0||nr>H||nc<=0||nc>W)continue;

                if(map[nr][nc] == 0 && dist[nr][nc][nh]==0){
                    dist[nr][nc][nh] = dist[cur.x][cur.y][nh]+1;
                    q.offer(new Pair(nr, nc, nh));
                    
                }

                if(nh<K){
                    for(int dd = 0; dd<8;dd++){
                        int nnr = ddr[dd] + cur.x;
                        int nnc = ddc[dd] + cur.y;

                        if(nnr<=0||nnr>H||nnc<=0||nnc>W)continue;

                        if(map[nnr][nnc] == 0 && dist[nnr][nnc][nh+1]==0){
                            dist[nnr][nnc][nh+1] = dist[cur.x][cur.y][cur.h]+1;
                            q.offer(new Pair(nnr, nnc, nh+1));
                            
                        }
                    }
                }


            }
        }
        System.out.println(-1);
    }

}
