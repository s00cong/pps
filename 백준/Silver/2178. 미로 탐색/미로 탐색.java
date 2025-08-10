import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    // 최단거리

    static int N;
    static int M;
    static int[][]map;
    static int dr[] = {-1,1,0,0};
    static int dc[] = {0,0,-1,1};
    static class P {int r; int c; P(int r,int c){this.r = r; this.c=c;}}
    
    static int bfs (int r, int c){
        Deque<P> queue = new ArrayDeque<>();
         //방문체크
        int dist[][] = new int [N+2][M+2];
        queue.add(new P(r,c));
        dist[r][c] = 1;
        while(!queue.isEmpty()){
            P cur = queue.poll();
            for(int i = 0; i< 4; i++){
                int nr = cur.r+dr[i];
                int nc = cur.c+ dc[i];
                if(nr<=0||nr>N||nc<=0||nc>M) continue;
                if(dist[nr][nc]==0 && map[nr][nc]==1){
                    queue.add(new P(nr,nc));
                    dist[nr][nc] = dist[cur.r][cur.c]+1;
                }
                    

            }
        }

        return dist[N][M];
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N+2][M+2];
        for(int i = 1; i<=N; i++){  //map 받기
            String str = br.readLine().trim();
            int j = 1;
            for(char c : str.toCharArray()){
                map[i][j++] = c-'0';
            }
        }
        System.out.println(bfs(1,1));

        

    }   
}
