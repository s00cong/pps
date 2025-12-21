import java.io.*;
import java.util.*;

public class Main {
    static int N, M, K;
    static int[] parent;
    static int[] cost;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        parent = new int[N + 1];
        cost = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
            cost[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            union(a, b);
        }

        boolean[] visited = new boolean[N + 1];
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            int root = find(i);
            if (!visited[root]) {
                visited[root] = true;
                sum += cost[root];
            }
        }

        if (sum <= K) System.out.println(sum);
        else System.out.println("Oh no");
    }

    static int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]); 
    }

    static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a == b) return;

        if (cost[a] < cost[b]) parent[b] = a;
        else parent[a] = b;
    }
}
