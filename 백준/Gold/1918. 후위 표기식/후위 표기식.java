import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static Stack<Character> stack = new Stack<>();
    static  StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        

        for(int i = 0 ; i < str.length(); i++){
            char c = str.charAt(i);
            if(c>='A' && c<='Z') sb.append(c);
            else{
                if(c=='(') stack.add(c);
                else if(c==')'){
                    while(stack.peek()!='('){
                        sb.append(stack.pop());
                    }
                    stack.pop();
                }
                else {
                    while (!stack.isEmpty() && priority(stack.peek()) >= priority(c)) {
                        sb.append(stack.pop());
                    }
                    stack.push(c);
                }
            }
        }
        while(!stack.empty())sb.append(stack.pop());

        System.out.println(sb);

    }
    static int priority(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        return 0;
    }
    
}
