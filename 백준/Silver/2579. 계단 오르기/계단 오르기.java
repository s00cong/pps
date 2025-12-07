import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int[] dp = new int[301];
    static int[] stairs;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        stairs = new int[N+1];
        for(int i = 1; i<=N; i++){
            int score = Integer.parseInt(br.readLine());
            stairs[i] = score;
        }
        dp[0] = 0;
        dp[1] = stairs[1];
        if(N == 1){
            System.out.println(dp[1]);
            return;
        }
        dp[2] = stairs[1]+stairs[2];   
        if(N==2){
            System.out.println(dp[2]);
            return;
        }

        for(int i = 3; i<=N; i++){
            dp[i] = Math.max(dp[i-2]+stairs[i], dp[i-3]+stairs[i-1]+stairs[i]); //연속 3개는 못밟으니까!!
        }
        System.out.println(dp[N]);
    }
}
