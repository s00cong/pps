import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);

        int mode = arr[0];
        int maxFreq = 1;

        int cur = arr[0];
        int curFreq = 1;

        boolean secondPicked = false;

        for (int i = 1; i < n; i++) {
            if (arr[i] == cur) {
                curFreq++;
            } else {
                if (curFreq > maxFreq) {
                    maxFreq = curFreq;
                    mode = cur;
                    secondPicked = false;
                } else if (curFreq == maxFreq && !secondPicked && cur != mode) {
                    mode = cur;
                    secondPicked = true;
                }

                cur = arr[i];
                curFreq = 1;
            }
        }

        if (curFreq > maxFreq) {
            mode = cur;
        } else if (curFreq == maxFreq && !secondPicked && cur != mode) {
            mode = cur;
        }

        StringBuilder sb = new StringBuilder();
        sb.append((int) Math.round((double) sum / n)).append("\n");
        sb.append(arr[n / 2]).append("\n");
        sb.append(mode).append("\n");
        sb.append(arr[n - 1] - arr[0]).append("\n");

        System.out.print(sb.toString());
    }
}
