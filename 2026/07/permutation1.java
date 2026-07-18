
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class permutation1 { //n개 중에서 m개 뽑기 순서 상관있게
    static int[] arr;
    static int n,m;
    static int[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visited = new int[n+1];
        
        Perm(0); 
    }

    static void Perm(int cnt){

        if(cnt == m){
            for(int a : arr){
                System.out.print(a+" ");
            }
            System.out.println();
            return;
        }
        for(int i = 1; i<=n; i++){
            if(visited[i]==1) continue;
            arr[cnt] = i;
            visited[i]=1;
            Perm(cnt+1);
            visited[i]=0;
        }

    }
}
