import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static long min_sum = Long.MAX_VALUE; 
    // 신맛은 곱, 쓴맛은 합
    static int[] S;
    static int[] B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st;
        S = new int[N];
        B = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            S[i] = Integer.parseInt(st.nextToken()); // 신맛
            B[i] = Integer.parseInt(st.nextToken()); // 쓴맛
        }

        // 공집합(0)은 제외, 전체집합 포함 -> mask: 1 .. (1<<N)-1
        for (int mask = 1; mask < (1 << N); mask++) {
            long sourProd = 1L; // 신맛 곱
            long bitterSum = 0L; // 쓴맛 합

            for (int i = 0; i < N; i++) {
                if ((mask & (1 << i)) != 0) {
                    sourProd *= (long) S[i];
                    bitterSum += (long) B[i];
                }
            }
            long diff = Math.abs(sourProd - bitterSum);
            if (diff < min_sum) min_sum = diff;
        }

        System.out.println(min_sum);
    }
}
