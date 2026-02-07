import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        int[] arr = new int[N];
        int[] sorted = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int v = Integer.parseInt(st.nextToken());
            arr[i] = v;
            sorted[i] = v;
        }

        Arrays.sort(sorted);

        int[] uniq = new int[N];
        int m = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0 || sorted[i] != sorted[i - 1]) {
                uniq[m++] = sorted[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int rank = Arrays.binarySearch(uniq, 0, m, arr[i]);
            sb.append(rank);
            if (i + 1 < N) sb.append(' ');
        }
        System.out.print(sb.toString());
    }
}
