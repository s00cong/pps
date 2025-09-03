import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dp;
    static int res;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N ==1){
            System.out.println(0);
            return;
        }
        if(N ==2){
            System.out.println(1);
            return;
        }
        if(N ==3){
            System.out.println(1);
            return;
        }
        

        dp = new int[N+1];

        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        int min;
        for(int i = 4; i<=N; i++){
            min = dp[i-1]+1;
            if(i%3==0){
                min = Math.min(min,dp[i/3]+1);
            }
            if(i%2 ==0){
                min = Math.min(min,dp[i/2]+1);
            }
            dp[i] = min;
        }
        res = dp[N];
        System.out.println(res);
    }
}
