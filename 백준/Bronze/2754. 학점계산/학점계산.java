
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        double score = 0.0;
        if(!str.equals("F")){
            if(str.charAt(0)=='A')score+=4;
            else if(str.charAt(0)=='B')score+=3;
            else if(str.charAt(0)=='C')score+=2;
            else score+=1;

            if(str.charAt(1)=='+')score+=0.3;
            else if(str.charAt(1)=='-')score-=0.3;
        }
        System.out.println(score);
    }
}
