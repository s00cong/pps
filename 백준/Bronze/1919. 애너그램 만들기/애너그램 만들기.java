
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {  //같은 글자 개수 찾기?
    public static void main(String[] args) throws IOException{
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        int[] alpha_a = new int['z'-'a'+1];
        int[] alpha_b = new int['z'-'a'+1];

        for(char c : a.toCharArray()){
            alpha_a[c-'a']++;
        }

        for(char c : b.toCharArray()){
            alpha_b[c-'a']++;
        }

        int result = 0;
        for(int i = 0 ;i < 26;i++){
            result += Math.abs(alpha_a[i]-alpha_b[i]);
        }
        
        System.out.println(result);
    }
}
