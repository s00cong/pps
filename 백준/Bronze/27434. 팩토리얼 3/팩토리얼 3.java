import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    static BigInteger multiplyRange(int start, int end) {
        if (start > end) return BigInteger.ONE;
        if (start == end) return BigInteger.valueOf(start);
        if (end - start == 1) {
            return BigInteger.valueOf(start).multiply(BigInteger.valueOf(end));
        }

        int mid = (start + end) / 2;
        return multiplyRange(start, mid).multiply(multiplyRange(mid + 1, end));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 0 || n == 1) {
            System.out.println(1);
            return;
        }

        System.out.println(multiplyRange(1, n));
    }
}