import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    
    static int N , M; // 정점, 간선
    static ArrayList<Integer>[] list; 
    static int[] inD; 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        N = sc.nextInt();
        M = sc.nextInt();
        list = new ArrayList[N+1];
        inD = new int[N+1];
        for(int i = 1 ; i<N+1; i++){
            list[i] = new ArrayList<>();
        }
        int from,to;
        for(int i = 0; i<M;i++){
            from  = sc.nextInt();
            to = sc.nextInt();
            list[from].add(to);
            inD[to]++;
        }
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 1; i<=N; i++){
            if (inD[i]==0) {
                q.offer(i);
            }
        }

        // 가지치기. 큐사이즈가 0이면 위상 정렬 불가 
        int idx;
        while(!q.isEmpty()){
            idx = q.poll();
            sb.append(idx).append(" ");
            for(int i :list[idx] ){
                inD[i]--;
                if(inD[i]==0) {
                    q.offer(i);
                }
            }
        }
        //가지치기 2. res.size() == N이여야함. 

        System.out.println(sb.toString());

    }
}
