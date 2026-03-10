import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n+1];

        nums[0] = 0;
        nums[1] = 1;

        for(int i = 2; i<=n; i++){
            nums[i] = nums[i-2]+nums[i-1];
        }
        System.out.println(nums[n]);
    }
}
