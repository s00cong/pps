import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N,M; //N = 포켓몬 수 , M = 내가 맞춰야 할 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        HashMap<String,Integer> map = new HashMap<>();
        String[] arr = new String[N + 1];
        String pocketmon;
        for(int i = 1; i<=N; i++){
            pocketmon = br.readLine();
            map.put(pocketmon,i);
            arr[i] = pocketmon;
        }
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < M; i++){
            String temp = br.readLine();
            if(Character.isDigit(temp.charAt(0))){
                sb.append(arr[Integer.parseInt(temp)]).append('\n');
            }
            else  sb.append(map.get(temp)).append('\n');
        }

        System.out.println(sb);
        
    }
}

