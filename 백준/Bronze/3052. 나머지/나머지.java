import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        int[] nums = new int[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int temp ;

        for(int i = 0 ; i < 10 ; i++){
            temp = Integer.parseInt(br.readLine()); 
            nums[temp%42]++;
        }

        int cnt = 0;
        for(int a : nums){
            if(a!=0)cnt++;
        }
        System.out.println(cnt);
    }
}
