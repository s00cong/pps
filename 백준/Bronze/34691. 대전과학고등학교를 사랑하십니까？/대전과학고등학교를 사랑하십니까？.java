import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();

            if (s.equals("end")) break;

            if (s.equals("animal")) {
                sb.append("Panthera tigris").append("\n");
            } else if (s.equals("tree")) {
                sb.append("Pinus densiflora").append("\n");
            } else if (s.equals("flower")) {
                sb.append("Forsythia koreana").append("\n");
            }
        }

        System.out.print(sb);
    }
}