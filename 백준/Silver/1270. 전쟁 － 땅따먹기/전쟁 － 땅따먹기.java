import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static List<Integer> T;
    static HashMap<Long, Integer> map[];

    // 한 땅이 하나의 번호가 이상이 되면 해당 번호가 땅을 먹는다.

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new HashMap[N];
        T = new ArrayList<>();
        for(int i = 0; i<N; i++){
            map[i] = new HashMap<>();
        }

        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int people = Integer.parseInt(st.nextToken());
            T.add(people);
            for(int j = 0; j<people; j++){
                Long key = Long.parseLong(st.nextToken());

                if(map[i].containsKey(key)){
                    map[i].put(key, map[i].get(key)+1);
                }
                else{
                    map[i].put(key, 1);
                }

            }
        }
        boolean flag = false;
        for(int i = 0 ; i < N; i++){
            flag = false;
            for(Long key : map[i].keySet()){
                if(map[i].get(key)>T.get(i)/2){ //과반수보다 많으면?
                    System.out.println(key);
                    flag = true;
                    break;
                }
            }
            if(!flag) System.out.println("SYJKGW");
        }

    }

}
