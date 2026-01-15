import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Deque<Integer> q = new ArrayDeque<>();
        for (int i = N; i >= 1; i--) {
            q.push(i);
        }
        while (!q.isEmpty()) {
            sb.append(q.pop()).append(" ");
            if (q.isEmpty()) break;
            int temp = q.pop();
            q.addLast(temp);
        }
        System.out.println(sb.toString());
    }


}
