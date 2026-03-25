import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   //걸그룹 수
        int M = Integer.parseInt(st.nextToken());   // 맞혀야 할 문제 수.

        StringBuilder sb = new StringBuilder();
        HashMap<String,String> map = new HashMap<>();
        HashMap<String,List<String>> memberMap = new HashMap<>();

        for(int i = 0; i < N; i++){
            String team = br.readLine();
            int numberofmembers = Integer.parseInt(br.readLine());
            List<String> members = new ArrayList<>();

            for(int j = 0; j<numberofmembers; j++){
                String name = br.readLine();
                members.add(name);
                map.put(name, team);
            }
            Collections.sort(members);
            memberMap.put(team, members);
        }
        
        for(int i = 0 ; i < M; i++){
            String str = br.readLine();
            int temp = Integer.parseInt(br.readLine());
            if(temp == 0){
                List<String> member = memberMap.get(str);
                for(String names : member){
                    sb.append(names).append('\n');
                }
            }
            else{
                sb.append(map.get(str)).append('\n');
            }
        }
        
        System.out.println(sb);

    }

}
