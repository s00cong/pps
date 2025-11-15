import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str == null) break;        
            if (str.equals("END")) break;  

            StringBuilder rev = new StringBuilder(str);
            sb.append(rev.reverse()).append("\n");
        }

        System.out.println(sb);
    }
}
