import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[] arr;
    static int[] out;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int start, int depth) {
        if (depth == m) {
            for (int x : out) {
                sb.append(x).append(' ');
            }
            sb.append('\n');
            return;
        }

        int prev = -1;

        for (int i = start; i < n; i++) {
            if (arr[i] == prev) continue;

            prev = arr[i];
            out[depth] = arr[i];
            dfs(i, depth + 1); 
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        out = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(0,0);

        System.out.print(sb);
    }
}