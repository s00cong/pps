import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] nums = {1, 5, 10, 50};
    static boolean[] visited = new boolean[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        dfs(0, 0, 0);

        int count = 0;
        for (boolean v : visited) {
            if (v) count++;
        }

        System.out.println(count);
    }

    static void dfs(int depth, int start, int sum) {
        if (depth == N) {
            visited[sum] = true;
            return;
        }

        for (int i = start; i < 4; i++) {
            dfs(depth + 1, i, sum + nums[i]);
        }
    }
}