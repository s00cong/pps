import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static long pa[];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        pa = new long[N];
        long sum_pa = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            pa[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(pa);
        long start = 1; 
        long end = 1000000000000L;
        long sum;
        long ret = 0;
        while(start<=end){
            long mid = (start+end)/2;

            sum = 0;
            for(int i = 0; i<N; i++){
                sum+=mid/pa[i];
            }
            if(sum>=M){
                ret = mid;
                end = mid-1;
            }
            else start = mid + 1;
        }
        
        System.out.println(ret);

    }
}
