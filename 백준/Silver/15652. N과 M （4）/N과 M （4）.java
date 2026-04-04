
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] arr;
    static int[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visited = new int[N+1];

        solve(0,1);
        System.out.println(sb);
    }

    static void solve(int cnt, int start){
        if(cnt == M) {
            Arrays.sort(arr);
            for(int i = 0; i<M;i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append('\n');
            return;
        }
        for(int i = start; i<=N; i++){            
            arr[cnt]=i;
            solve(cnt+1, i);
        }
    }
}
