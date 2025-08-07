import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0 ; i <T; i++){
            int result = 0;
            int continious = 0;
            String str = br.readLine();
            for(char c : str.toCharArray()){
                if(c == 'O'){
                    continious++;
                    result+=continious;
                }
                else{
                    continious=0;
                }
            }
            System.out.println(result);
        }

    }
}
