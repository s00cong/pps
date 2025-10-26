import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Main {
    static int[][] map = new int[5][5];
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    static boolean[] selected = new boolean[25];
    static int count;
    

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0 ; i <5; i++){
            String str = br.readLine();
            for(int j = 0 ; j<5; j++){
                if(str.charAt(j)=='Y')
                    map[i][j] = 0;
                else map[i][j] = 1; //S가 4개 이상
            }
        }
        DFS(0,0);
        System.out.println(count);

    }

    // 7개 뽑기!
    static void DFS(int cnt, int start){

        if(cnt == 7){
            if(BFS())
                count++;
            return;
        }
        for(int i = start; i<25;i++){
            selected[i] = true;
            DFS(cnt+1, i+1);
            selected[i] = false;
        }
    }

    static boolean BFS(){ //1이 4개 이상
        boolean[][] visited = new boolean[5][5];
        ArrayList<int[]> list = new ArrayList<>();
        int con_count = 1;

        int s_cnt=0;
        for(int i = 0 ; i < 25; i++){
            if(selected[i]){
                int x = i/5;
                int y = i%5;
                list.add(new int[]{x,y});
                if(map[x][y]==1)s_cnt++;
            }
        }
        if(s_cnt<4) return false;

        Queue<int[]> q = new ArrayDeque<>();
        q.offer(list.get(0));
        visited[list.get(0)[0]][list.get(0)[1]] = true;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int i = 0 ; i<4; i++){
                int nx = cur[0]+dr[i];
                int ny = cur[1]+dc[i];

                if(nx<0||ny<0||nx>=5||ny>=5) continue;
                if(!visited[nx][ny]&&selected[nx*5+ny]){
                    visited[nx][ny] = true;
                    q.offer(new int[]{nx,ny});
                    con_count++;
                }
            }
        }
        return con_count == 7;
    }   

}