
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class comb1 {    
    static int[] result;
    static int n,m;
    public static void main(String[] args) throws IOException {
        //n과m (n개 중 m개 고름 - 조합 : 순서 상관 없이)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        result = new int[m];
        Comb(1,0);
    }

    static void Comb(int start, int cnt){

        if(cnt == m){
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }
        

        for(int i = start; i<n+1; i++){
            result[cnt] = i;
            Comb(i+1, cnt+1);
        }
    }
}
