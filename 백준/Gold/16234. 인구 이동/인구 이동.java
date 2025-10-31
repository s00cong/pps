import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    static int N;
    static int[][] map;
    static int L,R;
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    static class Point {
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int cnt;
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        for(int i = 0 ; i <N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < N; j ++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution());
    }

    static int solution(){
        int days = 0;
        
        while(true){
            boolean moved = false;
            boolean[][] visited = new boolean[N][N];
            
            for(int i = 0 ; i < N; i++){
                for(int j = 0 ; j < N; j++){
                    if(visited[i][j]) continue;

                    List<Point>union = new ArrayList<>();
                    Queue<Point> q = new ArrayDeque<>();
                    q.offer(new Point(i, j));
                    visited[i][j] = true;

                    int sum = 0; 

                    while(!q.isEmpty()){
                        Point cur = q.poll();
                        union.add(cur);
                        sum += map[cur.x][cur.y];

                        for(int d = 0; d<4; d++){
                            int nr = cur.x + dr[d];
                            int nc = cur.y + dc[d];

                            if (nr < 0 || nr >= N || nc < 0 || nc >= N) continue;
                            if (visited[nr][nc]) continue;

                            int diff = Math.abs(map[cur.x][cur.y] - map[nr][nc]);
                            if(diff>=L && diff<=R){
                                visited[nr][nc] = true;
                                q.offer(new Point(nr, nc));
                            }
                        }

                    }

                    if(union.size() > 1){
                        moved = true;
                        int avg = sum / union.size();
                        for(Point p : union)map[p.x][p.y] = avg;
                    }

                }
            }
            if(!moved) break;
            days++;
            

        }
        return days;
        
    }

}
