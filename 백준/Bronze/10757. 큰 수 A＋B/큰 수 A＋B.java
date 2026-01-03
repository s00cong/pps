
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BigInteger a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        String aa,bb;
        aa = st.nextToken();
        bb = st.nextToken();
        a = new BigInteger(aa);
        b = new BigInteger(bb);

        System.out.println(a.add(b));

    }
}