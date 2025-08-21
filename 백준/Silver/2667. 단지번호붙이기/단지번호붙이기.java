import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    
    static int map[][];
    static int N;
    static boolean visited[][];
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine().trim());
        map = new int[N][N];
        visited = new boolean[N][N];
        

        for(int i = 0 ; i<N; i++){
            String line = br.readLine().trim();
            for(int j = 0; j<N; j++){
                map[i][j] = line.charAt(j)-'0';
            }
        }
        List<Integer> sizes = new ArrayList<>();

        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                if( !visited[i][j] && map[i][j]==1){
                    sizes.add(DFS(i,j));
                }
            }
        }
        sb.append(sizes.size()).append("\n");
        Collections.sort(sizes);
        
        for(int s : sizes) sb.append(s).append('\n');

        System.out.println(sb.toString());
    }


    static int DFS (int r, int c){

        visited[r][c] = true ;
        int cnt = 1;

        for(int i = 0 ; i < 4; i++){
            int nr = r + dr[i];
            int nc = c + dc[i];
            if(nr<0 || nr>=N || nc<0 || nc>=N) continue;
            if(map[nr][nc]==1 && !visited[nr][nc]){
                cnt += DFS(nr,nc);
            }
        }
        return cnt;
    }
}
