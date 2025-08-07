import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] inputs = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max, min;

        for(int i = 0 ; i < N; i++){
            inputs[i] = Integer.parseInt(st.nextToken());
        }
        max = inputs[0];
        min = inputs[0];
        
        for(int a : inputs){
            if(max<a) max = a;
            if(min>a) min = a;
        }

        System.out.printf("%d %d\n",min,max);
    }
}
