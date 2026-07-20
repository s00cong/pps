
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PermAndComb {
    static int n,m;
    static int numbers[];
    static int visited[];
    static StringBuilder sb = new StringBuilder();
    // 조합 & 순열
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        numbers = new int[m];
        visited = new int[n+1];
        perm(0);
        System.out.println(sb);
        sb.setLength(0);
        comb(1,0);
        System.out.println(sb);
    }

    static void perm(int cnt){
        if(cnt == m){
            for(int a : numbers)
                sb.append(a).append(" ");
            sb.append("\n");
            return;
        }

        for(int i = 1; i<=n; i++){
            if(visited[i]==1) continue;
            numbers[cnt] = i;
            visited[i] = 1;
            perm(cnt+1); 
            visited[i] = 0;
        }
    }

    static void comb(int start,int cnt){
        if(cnt == m){
            for(int a : numbers)
                sb.append(a).append(" ");
            sb.append("\n");
            return;
        }

        for(int i = start; i<=n; i++){
            numbers[cnt] = i;
            comb(i+1, cnt+1); 
        }

    }
}
