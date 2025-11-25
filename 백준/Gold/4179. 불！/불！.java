import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    static int R,C;
    static char[][] map;
    static boolean[][] visited;
    static int dr[] = {-1,1,0,0};
    static int dc[] = {0,0,-1,1};
    static Queue<Point> FireQ = new ArrayDeque<>();
    static Queue<Point> JhQ = new ArrayDeque<>();


    static public class Point {
    
        int x,y,time;

        Point(int x, int y, int time){
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        visited = new boolean[R][C];

        for(int i = 0; i < R; i++){
            String Line = br.readLine();
            for(int j = 0; j<C; j++){
                char c = Line.charAt(j);
                map[i][j] = c;
                if(c=='J'){
                    JhQ.add(new Point(i, j, 0));
                    visited[i][j] = true;
                }
                else if (c=='F'){
                    FireQ.add(new Point(i, j, 0));
                }

            }
        }
        bfs();

    }
    public static void bfs(){

        while(!JhQ.isEmpty()){
            int Fsize = FireQ.size();

            for(int i = 0; i<Fsize; i++){
                Point cur = FireQ.poll();
                int x = cur.x;
                int y = cur.y;
                for(int k = 0 ; k < 4; k++){
                    int nr = x + dr[k];
                    int nc = y + dc[k];
                    if(nr<0||nr>=R||nc<0||nc>=C) continue;
                    if(map[nr][nc]=='.' || map[nr][nc]=='J'){
                        map[nr][nc] = 'F';
                        FireQ.offer(new Point(nr, nc, 0));
                    }

                }


            }

            int JHsize = JhQ.size();
            for(int i = 0; i < JHsize; i++){
                Point cur = JhQ.poll();
                int x = cur.x;
                int y = cur.y;
                for(int k = 0; k < 4; k++){
                    int nr = x + dr[k];
                    int nc = y + dc[k];

                    if(nr<0||nr>=R||nc<0||nc>=C){
                        System.out.println(cur.time+1);
                        return;
                    }
                    if(visited[nr][nc]) continue;
                    if(map[nr][nc]=='.'){
                        visited[nr][nc] = true;
                        JhQ.offer(new Point(nr, nc, cur.time+1));
                    }
                    
                }

            }
        }
        System.out.println("IMPOSSIBLE");
    }
}
