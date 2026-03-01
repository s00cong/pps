import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int max = 0; 
        int max_idx = 0;
        for(int i = 1; i<=5;i++){
            st = new StringTokenizer(br.readLine());
            int temp = 0;
            for(int j = 0 ; j <4; j++){
                temp += Integer.parseInt(st.nextToken());
            }

            if(max<temp){
                max = temp;
                max_idx = i;
            }

        }
        System.out.println(max_idx + " "+ max);

    }
}
