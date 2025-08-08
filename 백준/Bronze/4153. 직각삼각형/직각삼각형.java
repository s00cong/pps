import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inputs = new int[3];

        StringTokenizer st;
        
        while(true)
        {
            st= new StringTokenizer(br.readLine());
            inputs[0] = Integer.parseInt(st.nextToken());
            inputs[1] = Integer.parseInt(st.nextToken());
            inputs[2] = Integer.parseInt(st.nextToken());
            if(inputs[0]+inputs[1]+inputs[2]==0) break;
            Arrays.sort(inputs);
            if(Math.pow(inputs[2], 2)==Math.pow(inputs[1], 2)+Math.pow(inputs[0], 2))
                System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
