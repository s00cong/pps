import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        int MOD = 20000303;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        long rem = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            rem = (rem * 10 + (c - '0')) % MOD;
        }

        System.out.print(rem);
    }
}