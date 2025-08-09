import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().trim();

        Stack<Character> stack = new Stack<>();
        int result = 0;
        for(int i = 0 ; i< line.length();i++){
            if( line.charAt(i) =='(') stack.push('(');

            else{
                stack.pop();
                if(line.charAt(i-1)=='('){  
                    result += stack.size();
                }
                else result++;
            }
        }
        System.out.println(result);

    }
}
