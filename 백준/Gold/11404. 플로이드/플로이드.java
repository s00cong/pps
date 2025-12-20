
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[][] dist;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        dist = new int[N+1][N+1];
        for(int i = 1; i<=N; i++){
            Arrays.fill(dist[i], 987654321);
            dist[i][i] = 0; 
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (c < dist[a][b]) dist[a][b] = c;
        }

        for(int k = 1; k<=N; k++){
            for(int i = 1; i<=N; i++){
                if(dist[i][k]==987654321) continue;
                for(int j = 1; j<=N; j++){
                    if(dist[k][j]==987654321) continue;
                    int temp = dist[i][k] + dist[k][j];
                    if(temp < dist[i][j]) dist[i][j] = temp;
                }
            }
        }

        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=N; j++){
                if(dist[i][j]==987654321) sb.append("0").append(" ");
                else sb.append(dist[i][j]).append(" ");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
