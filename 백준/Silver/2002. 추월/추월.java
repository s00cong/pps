
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    static int N;
    static HashMap<String,Integer> dae = new HashMap<>();
    static int cnt;
    public static void main(String[] args) throws IOException {
        // 대근 : 들어가는 순서
        // 영식 : 나오는 순서 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        String number;
        for(int i = 1; i<=N; i++){
            number = br.readLine();
            dae.put(number,i);  
        }
        
        int[] out = new int[N];
        for (int i = 0; i < N; i++) {
            out[i] = dae.get(br.readLine());
        }

        int min = Integer.MAX_VALUE;

        for (int i = N - 1; i >= 0; i--) {  
            if (out[i] > min) {
                cnt++; 
            } else {
                min = out[i];
            }
        }

        System.out.println(cnt);
    }

}
