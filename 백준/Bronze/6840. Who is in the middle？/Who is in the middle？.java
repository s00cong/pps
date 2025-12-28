
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) throws Exception {
        int[] a = new int[3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i<3; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);
        System.out.println(a[1]);
    }

}
