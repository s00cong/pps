
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N,L,W; // 트럭 수, 다리 최대 하중, 다리길이
    static int[] A;
    static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        solution();
        System.out.println(ans);
    }

    static void solution(){
        Queue<Integer> q = new ArrayDeque<>();
        int cur_w = 0;
        for(int i = 0 ; i < L; i++)q.add(0);
        int idx = 0;

        while(idx<N){
            ans++;
            cur_w -= q.poll();

            if(cur_w+A[idx] <= W){
                q.add(A[idx]);
                cur_w+=A[idx];
                idx++;
            }else{
                q.add(0); // 트럭 빈칸!
            }
            
        }
        ans += L;
        
    }

}
