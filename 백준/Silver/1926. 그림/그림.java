import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static int[][]map;
    static boolean[][] visited;
    static int[] dr = {1,-1,0,0}; //하,상
    static int[] dc = {0,0,1,-1}; //우,좌

    static int dfs(int x, int y){  //재귀!
        visited[x][y] = true;
        int area = 1;

        for(int d = 0; d<4; d++){
            int nr = x+dr[d], nc = y+dc[d]; //배열 탐색
            if(nr<0 || nr>=n||nc<0|| nc>=m) continue;
            if(!visited[nr][nc]&& map[nr][nc]==1){
                area+=dfs(nr,nc);
            }
        }
        return area;
    }
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];
        for(int i = 0 ; i< n ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        int maxArea = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m;j++){
                if(map[i][j]==1&&!visited[i][j]){
                    int area = dfs(i,j);
                    cnt++;
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        System.out.println(cnt);
        System.out.println(maxArea);

    
    }
}
