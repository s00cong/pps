
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws Exception{
        int temp = 0;
        StringBuilder sb = new StringBuilder();
        int N = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0 ; i <3; i++){
            
            String a = br.readLine();

            if(Character.isDigit(a.charAt(0))){
                temp = Integer.parseInt(a);
                N = temp + (3-i);
                break;
            }
            
        }
        if(N%15==0)sb.append("FizzBuzz");
        else if(N%3==0)sb.append("Fizz");
        else if(N%5==0)sb.append("Buzz");
        else sb.append(N);

        System.out.println(sb);
    }

}
