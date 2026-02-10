import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        if (n == 0) { 
            System.out.println(0);
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine().trim());
        }

        Arrays.sort(arr);

        int k = (int) Math.round(n * 0.15); 
        long sum = 0;
        int cnt = 0;

        for (int i = k; i < n - k; i++) {
            sum += arr[i];
            cnt++;
        }

        int ans = (int) Math.round((double) sum / cnt); 
        System.out.println(ans);
    }
}
