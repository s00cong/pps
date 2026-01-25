import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        for (int len = L; len <= 100; len++) {
            long sub = (long) len * (len - 1) / 2; // 0+1+...+(len-1)
            long rest = N - sub;

            if (rest < 0) continue; // x가 음수될 가능성 큼

            if (rest % len == 0) {
                long x = rest / len;
                if (x >= 0) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < len; i++) {
                        sb.append(x + i);
                        if (i + 1 < len) sb.append(" ");
                    }
                    System.out.print(sb.toString());
                    return;
                }
            }
        }

        System.out.print("-1");
    }
}
