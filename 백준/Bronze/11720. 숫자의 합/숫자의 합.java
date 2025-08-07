import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        String number = br.readLine();

        for(char c : number.toCharArray()){
            result += c-'0';
        }
        System.out.println(result);
    }
}
