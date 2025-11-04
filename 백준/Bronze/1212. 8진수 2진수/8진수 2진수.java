import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String oct = br.readLine();

        String[] table = {"000","001","010","011","100","101","110","111"};

        StringBuilder sb = new StringBuilder();

        int first = oct.charAt(0) - '0';
        sb.append(Integer.toBinaryString(first));

        for(int i = 1; i < oct.length(); i++){
            int num = oct.charAt(i) - '0';
            sb.append(table[num]);
        }

        System.out.println(sb);
    }
}
