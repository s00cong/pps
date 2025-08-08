import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st; 
        for(int i = 0 ; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int N  = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            String result = "";

            for(char c : str.toCharArray()){
                for(int k = 0 ; k < N; k++){
                    result += Character.toString(c);
                }
            }

            System.out.println(result);


        }
        
    }
}
