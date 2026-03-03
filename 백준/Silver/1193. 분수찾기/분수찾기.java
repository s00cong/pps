import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine().trim());

        int k = 1;      
        int sum = 1;   

        while (X > sum) {
            k++;
            sum += k;
        }

        int offset = X - (sum - k) - 1;

        int num, den;
        if (k % 2 == 1) { // 홀수 대각선
            num = k - offset;
            den = 1 + offset;
        } else {          // 짝수
            num = 1 + offset;
            den = k - offset;
        }

        System.out.println(num + "/" + den);
    }
}