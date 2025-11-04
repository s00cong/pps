import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int N, M;
    static ArrayList<Integer>[] arr;
    static int[] Kevin;
    static int min = Integer.MAX_VALUE;
    static boolean[] isVisited;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        arr = new ArrayList[N + 1];
        int ans = 0;
        for(int i = 0; i <= N; i++){
            arr[i] = new ArrayList<>();
        }
        for(int i = 0; i < M; i++){
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            addGraph(x, y);
        }
        for(int i = 1; i <= N; i++){
            Kevin = new int[N + 1];
            Arrays.fill(Kevin, Integer.MAX_VALUE);
            isVisited = new boolean[N + 1];
            int result = 0;
            bfs(i);
            for(int j = 1; j <= N; j++){
                if(i != j){
                    // System.out.print(Kevin[j] + " ");
                    result += Kevin[j];
                }
            }
            // System.out.println();
            if(result < min){
                min = result;
                ans = i;
            }
        }
        System.out.println(ans);
    }

    static void addGraph(int x, int y){
        arr[x].add(y);
        arr[y].add(x);
    }

    static void bfs(int start){
        Queue<int[]>q = new LinkedList<>();
        isVisited[start] = true;
        q.add(new int[]{start, 0});
        Kevin[start] = 0;
        while(!q.isEmpty()){
            int[] node = q.poll();
            int cur_location = node[0];
            int cur_index = node[1];
            for(int i = 0; i < arr[cur_location].size(); i++){
                int next = arr[cur_location].get(i);
                if(isVisited[next]) continue;
                Kevin[next] = cur_index + 1;
                q.add(new int[]{next, cur_index + 1});
                isVisited[next] = true;
            }
        }
    }
}
