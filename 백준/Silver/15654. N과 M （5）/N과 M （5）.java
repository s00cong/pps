
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] arr;
    static int[] visited;
    static int[] numbers;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        arr = new int[M];
        visited = new int[N+1];

        numbers = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);
        solve(0);
        System.out.println(sb);
    }

    static void solve(int cnt){
        if(cnt == M) {
            for(int i = 0; i<M;i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append('\n');
            return;
        }
        for(int i = 1; i<=N; i++){
            if(visited[i]==1) continue;         
            arr[cnt]=numbers[i];
            visited[i]=1;
            solve(cnt+1);
            visited[i] = 0;

        }
    }
}
