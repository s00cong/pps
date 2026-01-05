
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static long G;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        G = Long.parseLong(br.readLine());
        long past = 1;
        long cur = 2;

        ArrayList<Long> result = new ArrayList<>();
        while(past<cur){
            long diff = cur*cur - past*past;

            if(diff == G){
                result.add(cur);
                past++;
                cur++;
    
            } else if (diff < G) {
                cur++;
            } else {
                past++;
            }

        }

        if(result.isEmpty()){
            System.out.println(-1);
        }
        else {
            for(long x : result){
                System.out.println(x);
            }
        }


    }
}
