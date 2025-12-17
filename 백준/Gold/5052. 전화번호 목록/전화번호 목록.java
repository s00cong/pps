
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static String[] numbers;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int tc = 1; tc<=T; tc++){
            int N = Integer.parseInt(br.readLine());
            numbers = new String[N];
            for(int i = 0 ; i < N; i++){
                numbers[i] = br.readLine();
            }
            check();
        }
        System.out.println(sb.toString());
    }

    static void check(){
        HashSet<String> set = new HashSet<>();
        for(String str : numbers){
            set.add(str);
        }

        for(String str : numbers){
            for(int i = 1; i<str.length();i++){
                if(set.contains(str.substring(0,i))){
                    sb.append("NO").append("\n");

                    return;
                }
            }
        }
        sb.append("YES").append("\n");
}


}
