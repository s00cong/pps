
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dr = {-1,0,1,0,0,0};
    static int[] dc = {0,1,0,-1,0,0};
    static int[] dz = {0,0,0,0,-1,1};
    static int L,R,C;
    static int[][][] map; 
    static int cnt;
    static class Point {
        int x,y,z;
        Point(int x, int y,int z){
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
    static Point start;
    static Point end;

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        L = -1; R = -1; C = -1;
        
        while(true){
            st = new StringTokenizer(br.readLine());
            
            L = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            if(L == 0 && R == 0 && C == 0) break;
            map = new int[L][R][C];

            for(int i = 0; i<L; i++){
                for(int j = 0 ; j < R; j++){
                    String str = br.readLine();
                    for(int k =0; k<C; k++){
                        char c = str.charAt(k);
                        if(c=='S'){
                            start = new Point(j,k,i);
                            map[i][j][k] = -1;
                        }
                        else if(c=='E'){
                            end = new Point(j,k,i);
                            map[i][j][k] = -1;
                        }
                        else if(c=='.'){
                            map[i][j][k] = 1;
                        }
                        else if(c=='#'){
                            map[i][j][k] = 0;
                        }
                        else map[i][j][k] = -2;
                    }
                }
                br.readLine();
            }
            bfs();
        }
        
    }

    static void bfs(){
        Queue<Point> q = new ArrayDeque<>();
        int[][][] visited = new int[L][R][C];
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < R; j++) {
                Arrays.fill(visited[i][j], -1);
            }
        }
        boolean esc = false;

        q.add(start);
        visited[start.z][start.x][start.y] = 0;

        while(!q.isEmpty()){
            Point cur = q.poll();
            if(cur.z == end.z && cur.x == end.x && cur.y == end.y){
                int ans = visited[end.z][end.x][end.y];
                System.out.println("Escaped in " + ans + " minute(s).");
                esc = true;
                break;
            }
            for(int d = 0 ; d<6; d++){
                int nz = cur.z + dz[d];
                int nx = cur.x + dr[d];
                int ny = cur.y + dc[d];

                if (nz < 0 || nx < 0 || ny < 0 || nz >= L || nx >= R || ny >= C) continue;
                if(map[nz][nx][ny] == 0) continue; //벽이면
                if(visited[nz][nx][ny] != -1) continue; // 이미 방문했으
                visited[nz][nx][ny] =  visited[cur.z][cur.x][cur.y] +1;
                q.add(new Point(nx,ny,nz));
            }
        }
        if(!esc) System.out.println("Trapped!");
    }

}
