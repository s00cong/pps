
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N,K,S,X,Y;
    static int[][] map;
    static int[] dr = {-1,0,1,0};
    static int[] dc = {0,1,0,-1};
    static List<Point> list = new ArrayList<>();
    static public class Point {
        int x,y;
        int value;
        int time;
        Point(int x, int y, int value, int time){
            this.x = x;
            this.y = y;
            this.value = value;
            this.time = time;
        }
        
    }

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[N+1][N+1];

        for(int i = 1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]!=0)list.add(new Point(i, j,map[i][j],0));
            }
        }
        st = new StringTokenizer(br.readLine());

        S = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        list.sort(Comparator.comparingInt(o -> o.value));
        solution();
        System.out.println(map[X][Y]);
    }

    static void solution(){
        
        Queue<Point> q = new ArrayDeque<>();
        
        for(int i = 0 ; i < list.size();i++){
            Point temp = list.get(i);
            q.add(temp);
            
        }

        while(!q.isEmpty()){
            Point cur = q.poll();
            if(cur.time == S) break;

            for(int d = 0 ; d < 4; d++){
                int nr = dr[d] + cur.x;
                int nc = dc[d] + cur.y;
                if(nr <=0 || nc<=0 || nr>N|| nc>N) continue;
                if(map[nr][nc]==0) {
                    map[nr][nc] = cur.value;
                    q.add(new Point(nr,nc,cur.value,cur.time+1));
                }
                
            }
        }
    }
}
