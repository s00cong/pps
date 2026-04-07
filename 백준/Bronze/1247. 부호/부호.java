import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < 3; t++) {
            int n = Integer.parseInt(br.readLine());
            BigInteger sum = BigInteger.ZERO;

            for (int i = 0; i < n; i++) {
                sum = sum.add(new BigInteger(br.readLine()));
            }

            int cmp = sum.compareTo(BigInteger.ZERO);
            if (cmp > 0) sb.append("+\n");
            else if (cmp < 0) sb.append("-\n");
            else sb.append("0\n");
        }

        System.out.print(sb);
    }
}