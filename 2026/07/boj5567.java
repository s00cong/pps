
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

    /*
    자신의 친구와 친구의 친구를 초대하기로 했다. 
    상근이의 동기는 모두 N명이고, 이 학생들의 학번은 모두 1부터 N까지이다. 
    상근이의 학번은 1이다.
    상근이는 동기들의 친구 관계를 모두 조사한 리스트를 가지고 있다. 
    이 리스트를 바탕으로 결혼식에 초대할 사람의 수를 구하는 프로그램을 작성하시오.

    첫째 줄에 상근이의 동기의 수 n (2 ≤ n ≤ 500)이 주어진다. 
    둘째 줄에는 리스트의 길이 m (1 ≤ m ≤ 10000)이 주어진다. 다음 줄부터 m개 줄에는 친구 관계 ai bi가 주어진다. (1 ≤ ai < bi ≤ n) ai와 bi가 친구라는 뜻이며, bi와 ai도 친구관계이다.


    첫째 줄에 상근이의 결혼식에 초대하는 동기의 수를 출력한다.
    */

public class boj5567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        int[] dist = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dist[i] = -1;
        }

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        dist[1] = 0;

        int count = 0;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int next : graph[cur]) {
                if (dist[next] != -1) {
                    continue;
                }

                dist[next] = dist[cur] + 1;
                if (next != 1 && dist[next] <= 2) {
                    count++;
                }

                if (dist[next] < 2) {
                    queue.offer(next);
                }
            }
        }

        System.out.println(count);
    }
}
