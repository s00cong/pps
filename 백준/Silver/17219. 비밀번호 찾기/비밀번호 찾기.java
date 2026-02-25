import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        Map <String,String> map = new HashMap<>();
        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            String site = st.nextToken();
            String pw = st.nextToken();
            map.put(site, pw);
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<M; i++){
            String find = br.readLine();
            sb.append(map.get(find)).append('\n');
        }
        System.out.println(sb);
    }

}
