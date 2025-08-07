import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] alpha = new int[26];
        Arrays.fill(alpha, -1);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int idx = 0;
        for(char c : str.toCharArray()){
            if(alpha[c-'a']==-1){
                alpha[c-'a']=idx;
            }
            idx++ ;
        }
        for(int a : alpha)
            System.out.print(a+" ");
    }
}
