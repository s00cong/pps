import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<int[]>[] g;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println(0);
            return;
        }

        g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) g[i] = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            g[a].add(new int[]{b, w});
            g[b].add(new int[]{a, w});
        }

        int[] t = bfs(1, n);
        int[] res = bfs(t[0], n);

        System.out.println(res[1]);
    }

    static int[] bfs(int s, int n) {
        boolean[] v = new boolean[n + 1];
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{s, 0});
        v[s] = true;

        int node = s, dist = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int d = cur[1];

            if (d > dist) {
                dist = d;
                node = x;
            }

            for (int[] nxt : g[x]) {
                if (!v[nxt[0]]) {
                    
                    
                    v[nxt[0]] = true;
                    q.offer(new int[]{nxt[0], d + nxt[1]});
                }
            }
        }

        return new int[]{node, dist};
    }
}