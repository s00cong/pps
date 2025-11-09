import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static Map<Long,Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            int people = Integer.parseInt(st.nextToken());

            map.clear();

            for(int t = 0; t< people; t++){
                Long key = Long.parseLong(st.nextToken());
                if(map.containsKey(key)){
                    map.put(key,map.get(key)+1);
                } else map.put(key,1);
            }
            boolean flag = false;
            for(Long k : map.keySet()){
                if(map.get(k) > people/2){
                    sb.append(k).append("\n");
                    flag = true;
                    break;
                }
            }
            if(!flag){
                sb.append("SYJKGW").append("\n");
            }

        }
        
        System.out.println(sb);

    }
}
