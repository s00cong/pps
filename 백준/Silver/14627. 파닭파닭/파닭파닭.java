import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int pa[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        pa = new int[N];
        long sum_pa = 0;
        for(int i = 0; i<N; i++){
            pa[i] = Integer.parseInt(br.readLine());
            sum_pa += pa[i];
        }
        Arrays.sort(pa);
        int l = 1;
        int r = pa[N-1];
        long sum ;
        int ret = 0;
        while(l<=r){
            int mid = (l+r)/2;
            sum = 0;
            for(int i = 0 ; i < N; i++){
                sum += pa[i]/mid;
            }
            if(sum >= M){ //최대값을 찾을 때 커지는 방향
                ret = mid;
                l = mid + 1;
            }
            else r = mid-1;
            
        }
        long ans = 0;
        ans = sum_pa - ((long)M *ret);
        System.out.println(ans);
    }

}
