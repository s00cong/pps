
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] arr;
    static int[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visited = new int[N+1];

        solve(0,1);
    }

    static void solve(int cnt, int start){
        if(cnt == M) {
            for(int i = 0; i<M;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i = start; i<=N; i++){            
            arr[cnt]=i;
            solve(cnt+1,i+1);
        }
    }
}
