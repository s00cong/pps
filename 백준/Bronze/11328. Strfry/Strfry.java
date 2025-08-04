
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            char[] charArr1 = a.toCharArray();
            char[] charArr2 = b.toCharArray();
            Arrays.sort(charArr1);
            Arrays.sort(charArr2);
            
            if(new String(charArr1).equals(new String(charArr2)))System.out.println("Possible");
            else System.out.println("Impossible");
        }
        
    }
}
