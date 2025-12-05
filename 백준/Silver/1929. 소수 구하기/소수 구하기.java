import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static boolean[] prime;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        isPrime();
    }
    
    static void isPrime(){
        prime = new boolean[N+1];
        Arrays.fill(prime, true);
        if(N>=0) prime[0] = false;
        if(N>=1) prime[1] = false;

        
        for(int i = 2; i * i <=N; i++){
            if(prime[i]){
                for(int j = i * i; j<=N; j+=i){
                    prime[j] = false;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = M; i<=N; i++){
            if(prime[i])sb.append(i).append('\n');
        }
        System.out.println(sb.toString());
    }

}
