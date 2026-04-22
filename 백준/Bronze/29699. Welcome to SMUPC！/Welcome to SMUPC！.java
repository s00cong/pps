import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s = "WelcomeToSMUPC";
        System.out.println(s.charAt((n - 1) % 14));
    }
}