import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = Integer.parseInt(s);

        boolean a = s.contains("7");
        boolean b = n % 7 == 0;

        if(!a && !b) System.out.println(0);
        else if(!a) System.out.println(1);
        else if(!b) System.out.println(2);
        else System.out.println(3);
    }
}