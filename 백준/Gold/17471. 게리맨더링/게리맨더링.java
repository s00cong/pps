import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    
    static int N;
    static int[] people;
    static ArrayList<ArrayList<Integer>> list;
    static int total = 0;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st;
        
        people = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<= N; i++){
            people[i]=Integer.parseInt(st.nextToken());
            total+=people[i];
        }
        
        list = new ArrayList<>(N+1);
        for(int i = 0; i<=N; i++) list.add(new ArrayList<>());

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            for (int j = 0; j < k; j++) {
                int v = Integer.parseInt(st.nextToken());
                list.get(i).add(v);
                list.get(v).add(i); // 양방향 보장
            }
        }

        ArrayList<Integer>cur = new ArrayList<>();
        for(int r = 1; r<=N/2; r++){
            comb(1,r,cur);
        }
        System.out.println(answer == Integer.MAX_VALUE? -1 : answer);

    }

    static void comb(int start, int r, ArrayList<Integer> cur){
        //조합
        if(r == 0){
            checkAndUpdate(cur);    //R이 0이면 cur에 드러간것들 다 방문 체크해줌
            return;
        }
        for(int i = start; i<=N; i++){
            cur.add(i);
            comb(i+1,r-1,cur);
            cur.remove(cur.size()-1);
        }
    }

    static void checkAndUpdate(ArrayList<Integer> A){
        boolean[] inA = new boolean[N+1];
        for (int x : A) inA[x] = true;

        if(!isConnected(A.get(0),inA,A.size())) return;

        boolean[] inB = new boolean[N+1];
        int bStart = -1;
        int sizeB = N-A.size();
        for(int i = 1; i<=N; i++){
            if(!inA[i]){
                inB[i] = true;
                if(bStart ==-1) bStart = i;
            }
        }
        if(!isConnected(bStart,inB,sizeB))return;

        int sumA = 0;
        for(int i = 1; i<=N; i++)if(inA[i])sumA+=people[i];
        int diff =Math.abs(sumA-(total-sumA));
        answer = Math.min(answer, diff);
    }
    static boolean isConnected(int start,boolean[] allowed, int need){
        boolean[] visited = new boolean[N+1];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        visited[start] = true;
        q.add(start);
        int cnt = 1;

        while(!q.isEmpty()){
            int u = q.poll();
            for(int v : list.get(u)){
                if(!visited[v] && allowed[v]){
                    visited[v] = true;
                    q.add(v);
                    cnt ++;
                }
            }
        }

        return cnt == need;
    }


}
