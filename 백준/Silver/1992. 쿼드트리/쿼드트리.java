import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int[][] map;
    static String str;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i = 0 ; i <N; i++){
            String str = br.readLine();
            for(int j = 0 ; j <N; j++){
                map[i][j] = str.charAt(j)-'0';
                
            }
        }
        recursion(N, 0, 0);
        System.out.println(sb);
    }

    static void recursion(int size, int r, int c){
    
        int a = map[r][c];
        for(int i = r; i<r+size; i++){
            for(int j = c; j<c+size; j++){
                if(a!=map[i][j]){
                    sb.append("(");
                    recursion(size/2, r, c);
                    recursion(size/2, r, c+size/2);
                    recursion(size/2, r+size/2, c);
                    recursion(size/2, r+size/2, c+size/2);
                    sb.append(")");
                    return;
                }
            }
        }
        sb.append(a);
    }
}
