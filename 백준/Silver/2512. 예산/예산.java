
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static long[] money;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        money = new long[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            money[i] = Long.parseLong(st.nextToken());
        }
        M = Integer.parseInt(br.readLine());
        //총액 이하에서 가능한 한 최대의 예산
        // -> 한 파에서 가능한 한 많은 파
        Arrays.sort(money);
        long l = 1;
        long r = money[N-1];
        long sum = 0;
        long ret = 0;
        long mid = 0; 
        while(l<=r){
            mid = (l+r)/2;
            sum = 0;
            for(int i = 0 ; i < N; i++){
                if(money[i]>=mid) sum += mid;
                else sum += money[i];
            }
            if(sum<=M){
                ret = mid;
                l = mid+1;
            }
            else {
                r = mid-1;
            }
        }
        System.out.println(ret);

    }
}
