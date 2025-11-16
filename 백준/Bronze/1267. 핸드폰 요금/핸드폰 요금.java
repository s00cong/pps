import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int yPrice = 0;
        int mPrice = 0;

        for (int i = 0; i < N; i++) {
            int time = Integer.parseInt(st.nextToken());

            // Y 요금제
            yPrice += ((time / 30) + 1) * 10;

            // M 요금제
            mPrice += ((time / 60) + 1) * 15;
        }

        if (yPrice < mPrice) {
            System.out.println("Y " + yPrice);
        } else if (yPrice > mPrice) {
            System.out.println("M " + mPrice);
        } else {
            System.out.println("Y M " + yPrice);
        }
    }
}
