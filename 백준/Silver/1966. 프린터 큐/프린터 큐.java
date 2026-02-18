import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<int[]> q = new LinkedList<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int p = Integer.parseInt(st.nextToken());
                q.offer(new int[]{i, p});
                pq.offer(p);
            }

            int count = 0;

            while (!q.isEmpty()) {
                int[] cur = q.poll();

                if (cur[1] == pq.peek()) {
                    pq.poll();
                    count++;
                    if (cur[0] == M) {
                        sb.append(count).append('\n');
                        break;
                    }
                } else {
                    q.offer(cur);
                }
            }
        }

        System.out.print(sb.toString());
    }
}
