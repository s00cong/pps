
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] map;
    static StringBuilder sb = new StringBuilder();
    static int[] cnt = new int[3];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        recursion(N, 0, 0);
        for(int i = 0 ; i<3; i++)
            System.out.println(cnt[i]);
    }

    static void recursion(int size, int r, int c){
        int a = map[r][c];

        for(int i = r; i< r+size; i++){
            for(int j = c; j<c+size; j++){
                if(map[i][j]!=a){
                    for(int nr = 0; nr<3; nr++){
                        for(int nc = 0; nc<3; nc++){
                            recursion(size/3, r+nr*size/3, c+nc*size/3);
                        }
                    }
                    return;
                }
            }
        }
        cnt[a+1]++;

    }

}
