import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[][] nums = new int[N][2];
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            nums[i][0] = a;
            nums[i][1] = b;
        }
        Arrays.sort(nums,(a,b)->{
            if(a[0]!=b[0]) return a[0]-b[0];
            return a[1]-b[1];
        });
        for(int i = 0 ; i<N; i++){
            sb.append(nums[i][0]).append(" ").append(nums[i][1]).append('\n');
        }
        System.out.println(sb.toString());
    }
}
