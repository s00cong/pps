import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int temp = 1;
        int result = 0;
        Deque<Character> stack = new ArrayDeque<>();
        char c = '\0';
        
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i)=='('){
                temp *= 2;
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i)=='['){
                temp *= 3;
                stack.push(str.charAt(i));
            }

            else if(str.charAt(i)==')'){ 
                if(stack.isEmpty() || stack.peek()!='('){
                    System.out.println(0);
                    return;
                }
                else{
                    if(c=='(')result += temp;
                    stack.pop();
                    temp/=2;
                }
            }
            else if(str.charAt(i)==']'){ 
                if(stack.isEmpty() || stack.peek()!='['){
                    System.out.println(0);
                    return;
                }
                else{
                    if(c=='[')result += temp;
                    stack.pop();
                    temp/=3;
                }
            }
            c = str.charAt(i);
        }
        if(!stack.isEmpty()) System.out.println(0);
        else 
        System.out.println(result);


    }

}
