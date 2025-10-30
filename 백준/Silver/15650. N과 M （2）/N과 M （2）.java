import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {    //조합
    static int N,M;
    static int[] numbers;
    static StringBuilder sb= new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numbers = new int[N+1];
        
        Comb(0, 1);
        System.out.println(sb.toString());
    }

    static void Comb(int cnt, int start){
        if(cnt == M){
            for(int i = 0 ; i<M; i++){
                sb.append(numbers[i]+" ");
                
            }
            sb.append('\n');
        }

        for(int i = start; i<=N; i++){
            numbers[cnt] = i;
            Comb(cnt+1, i+1);
        }

    }
}
