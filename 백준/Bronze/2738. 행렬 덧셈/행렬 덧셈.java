import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[][] A;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N][M];
        for(int i = 0; i< N; i++){
            st = new StringTokenizer(br.readLine());

            for(int j = 0 ; j< M; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i< N; i++){
            st = new StringTokenizer(br.readLine());

            for(int j = 0 ; j< M; j++){
                A[i][j] += Integer.parseInt(st.nextToken());
                sb.append(A[i][j]).append(" ");
            }
            sb.append('\n');
        }

        System.out.println(sb.toString());



    }
}
