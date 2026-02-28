
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0, b = 0;
        for(int i = 3; i>=1; i--){
            int temp = Integer.parseInt(br.readLine());
            a += temp * i;
        }
        for(int i = 3; i>=1; i--){
            int temp = Integer.parseInt(br.readLine());
            b += temp * i;
        }
        if(a==b) System.out.println("T");
        else {
            System.out.println(a>b? "A" : "B");
        }

    }
}
