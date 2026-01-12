import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String boom = br.readLine();

        int len = boom.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));

            if (st.size() < len) continue;

            boolean flag = true;
            for (int j = 0; j < len; j++) {
                if (st.get(st.size() - len + j) != boom.charAt(j)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                for (int j = 0; j < len; j++) {
                    st.pop();
                }
            }
        }

        if (st.isEmpty()) {
            System.out.println("FRULA");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : st) sb.append(c);
        System.out.println(sb.toString());
    }
}
