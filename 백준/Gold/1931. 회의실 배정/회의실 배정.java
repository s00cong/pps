import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] meetings = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meetings[i][0] = Integer.parseInt(st.nextToken()); 
            meetings[i][1] = Integer.parseInt(st.nextToken()); 
        }

        Arrays.sort(meetings, (a, b) -> {
            if (a[1] == b[1]) return Integer.compare(a[0], b[0]); // end 같으면 start 오름차순
            return Integer.compare(a[1], b[1]); 
        });

        int cnt = 0;
        int lastEnd = 0;

        for (int i = 0; i < N; i++) {
            int s = meetings[i][0];
            int e = meetings[i][1];

            if (s >= lastEnd) {
                cnt++;
                lastEnd = e;
            }
        }

        System.out.println(cnt);
    }
}
