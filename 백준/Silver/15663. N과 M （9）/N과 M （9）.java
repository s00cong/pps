
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int nums[];
    static Set<String> result = new LinkedHashSet<>();
    static boolean visited[];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nums = new int[N];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        dfs(0,new int[M]);
        StringBuilder sb = new StringBuilder();
        for(String sequence : result){
            sb.append(sequence).append('\n');
        }
        System.out.print(sb.toString());
    }

    static void dfs(int depth, int[] arr){
        if(depth == M){
            result.add(buildSequence(arr));
            return;
        }

        for(int i = 0 ; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = nums[i];
                dfs(depth+1, arr);
                visited[i] = false;
            }
        }
    }

    private static String buildSequence(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<M; i++){
            sb.append(arr[i]).append(' ');
        }
        return sb.toString();
    }

}
