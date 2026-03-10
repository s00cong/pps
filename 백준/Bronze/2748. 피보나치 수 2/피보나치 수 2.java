import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Long[] nums = new Long[n+1];

        nums[0] = 0L;
        nums[1] = 1L;

        for(int i = 2; i<=n; i++){
            nums[i] = nums[i-2]+nums[i-1];
        }
        System.out.println(nums[n]);
    }
}
