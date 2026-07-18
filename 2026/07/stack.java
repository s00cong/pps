
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        String str = "((A*B)-(C/D))";

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (Character.isLetterOrDigit(ch))sb.append(ch);

            else if(ch == '('){
                stack.push(ch);
            }
            else if(ch == ')'){
                while(stack.isEmpty() || stack.peek()!='('){
                    sb.append(stack.pop());
                }
                stack.pop(); // ( 제거
            }
            else{
                stack.push(ch);
            }
        }
        System.out.println(sb);
    }    
}
