import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static int[] dr = {-1,0,1,0}; //세로 이동
    static int[] dc = {0,1,0,-1}; // 가로 이동
    static int N;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st ;
        StringBuilder sb;
        //가장 짧은 다리.
        //섬과 섬사이 최단거리를 구하면 되지 않을까..
        // 어떻게?
        map = new int[N][N];
        for(int i = 0 ; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j <N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int label = 2;
        for(int i = 0 ; i<N; i++){
            for(int j = 0 ; j <N; j++){
                if(map[i][j] == 1)
                    BFS_label(i,j,label++);
            }
        }
        int answer = Integer.MAX_VALUE;

        for(int i = 0 ; i<N; i++){
            for(int j = 0 ; j <N; j++){
                if(map[i][j] > 1)
                    answer = Math.min(answer, BFS(i,j));
            }
        }
        System.out.println(answer);

    }


    static void BFS_label(int x, int y, int label){

        Queue<int[]> q = new ArrayDeque<>();
        //int[][] visited = new int[N][N];
        q.offer(new int[]{x,y});
        map[x][y] =label;
        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int i = 0; i< 4; i++){
                int nr = cur[0] + dr[i];
                int nc = cur[1] + dc[i];

                if(nr<0||nc<0||nr>=N||nc>=N) continue;
                if(map[nr][nc] == 1) {
                    map[nr][nc] = label;
                    q.offer(new int[]{nr,nc});
                }
                
            }
        }
    }

    static int BFS(int r, int c){
        Queue<int[]> q = new ArrayDeque<>();
        int[][] dist = new int[N][N];
        int origin = map[r][c];
        
        q.offer(new int[]{r,c});
        dist[r][c] = 1;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for(int d=0; d<4; d++){
                int nr = cur[0] + dr[d];
                int nc = cur[1] + dc[d];

                if(nr<0||nc<0||nr>=N||nc>=N) continue;
                if(map[nr][nc]==origin)continue;
                if(dist[nr][nc]!=0)continue;    //이미 방문 했던거!

                if(map[nr][nc]!=0 && map[nr][nc]!= origin){
                    return dist[cur[0]][cur[1]]-1;
                }
                if(map[nr][nc]==0){
                    dist[nr][nc] = dist[cur[0]][cur[1]]+1;
                    q.offer(new int[]{nr,nc});
                }
            }
        }


        return Integer.MAX_VALUE;

    }



}
