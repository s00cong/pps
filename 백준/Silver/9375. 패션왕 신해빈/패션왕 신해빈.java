
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static int TC;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TC = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < TC ; i++ ){
            int N = Integer.parseInt(br.readLine());
            Map<String,Integer> map = new HashMap<>();
            for(int j = 0 ; j < N; j++){
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String kind = st.nextToken();
                if(map.containsKey(kind)){
                    map.put(kind,map.get(kind)+1);
                }
                else {
                    map.put(kind,1);
                }
            }
            long ans = 1;
            for(int cnt : map.values()){
                ans *= (cnt + 1L);
            }
            ans -= 1;
            sb.append(ans).append('\n');

        }
        System.out.println(sb);
    }   
}
