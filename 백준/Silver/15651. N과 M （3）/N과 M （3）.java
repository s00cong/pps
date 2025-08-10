import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] numbers;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numbers = new int[M];
        dfs(0);
        System.out.print(sb.toString());
    }
    public static void dfs (int cnt){
        if(cnt == M){
            for(int i = 0 ; i < M; i++){
                sb.append(numbers[i]).append(" ");
            }
            sb.append('\n');
            return;
        }

        for(int i = 1; i <=N; i++){
            numbers[cnt] = i;
            dfs(cnt+1);
        }
    }


}
