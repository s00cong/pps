
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
    static int[] dc ={0,1,0,-1};
    static int[] dr = {-1,0,1,0};
    
    static int[][] map; // 일반 : 0, 학생 : 1, 선생님 : 2, 장애물 : 3
    static int[] Objects = new int[3];
    static int[][] temp;
    static boolean flag = false;
    static class Point {
        int r,c;
        Point(int r, int c){
            this.c = c;
            this.r = r;
        }
        
    }
    static List<Point> teacher = new ArrayList<>();

    // 장애물 위치 3개 고정

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++){
                char temp = st.nextToken().charAt(0);
                
                if(temp == 'X') {
                    map[i][j] = 0;
                }
                else if(temp == 'S') map[i][j] = 1; //학생
                else {
                    map[i][j] = 2;
                    teacher.add(new Point(i,j));
                }
            }
        }
        selectObject(0, 0);
        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }


    static void selectObject(int cnt, int start){   //조합 3개

        if(cnt == 3){
            //bfs
            boolean ok = true;
            makeObject();
            for(int i = 0 ; i < 4; i++){
                if(!BFS(i)) {   //학생을 봤다면
                    ok = false;
                    break;
                }
            }
            if(ok) flag = true;
            return;
        }

        for(int i = start; i<N*N; i++){
            if(map[i/N][i%N]!=0) continue;
            if(flag) break;
            Objects[cnt] = i;
            selectObject(cnt+1, i+1);
        }
    }

    static void makeObject(){
        temp = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                temp[i][j] = map[i][j];
            }
        }
        for(int i = 0; i<3; i++){
            int a = Objects[i];
            temp[a/N][a%N] = 3; //Object는 3
        }
        
    }

    static boolean BFS(int dir){
        
        for(int i = 0 ; i < teacher.size();i++){
            Queue<Point> q = new ArrayDeque<>();
            q.add(teacher.get(i));
            while(!q.isEmpty()){
                Point cur = q.poll();
                
                Point next = new Point(cur.r + dr[dir], cur.c+dc[dir]);
                if(next.r<0||next.c<0||next.r>=N||next.c>=N) {
                    break;
                }
                if(temp[next.r][next.c]==3){
                    break;
                }
                if(temp[next.r][next.c]==1){
                    return false;
                }

                q.add(next);
            }
        }

        return true;
    }
    

}
