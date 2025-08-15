import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int numbers[] = new int[N];
        for(int i = 0; i<N; i++){
            numbers[i] = Integer.parseInt(br.readLine().trim());
        }

        StringBuilder sb = new StringBuilder();

        Arrays.sort(numbers);
        for(int i : numbers)
            sb.append(i).append('\n');
        System.out.println(sb.toString());
    }
}