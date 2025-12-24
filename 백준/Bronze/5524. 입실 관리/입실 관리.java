
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++){
            String str = br.readLine().toLowerCase();
            sb.append(str).append("\n");
        }

        System.out.println(sb);

    }
}
